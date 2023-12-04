package cz.gyarab.e4prg.s1;

import java.sql.*;

public class Adresar {
    Connection conn;

    public Adresar(Connection conn) throws SQLException {
        this.conn = conn;
        execute("CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY, jmeno VARCHAR)");
    }

    private void execute(String sql, String ...args) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < args.length; i++) {
                stmt.setString(i+1, args[i]);
            }
            stmt.execute();
        }
    }

    private void addUser(String jmeno) throws SQLException {
        execute("INSERT INTO user(jmeno) VALUES (?)", jmeno);
    }

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db")) {
            Adresar a = new Adresar(conn);
            a.addUser("test");
        }
    }
}
