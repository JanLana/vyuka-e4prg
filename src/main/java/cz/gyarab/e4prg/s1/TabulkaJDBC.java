package cz.gyarab.e4prg.s1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TabulkaJDBC {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/db3963",
                "db3963", "phoh3Jai9eek4ae")) {
            System.out.println("spojeni navazano...");
        } catch (SQLException e) {
            System.out.println("Chyba spojeni: " + e);
        }

        System.out.println("konec");

    }
}
