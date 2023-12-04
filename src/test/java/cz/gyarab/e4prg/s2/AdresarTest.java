package cz.gyarab.e4prg.s2;

import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class AdresarTest {
    String jmenoDbSouboru = "adresarTest.db";

    @Test
    public void vytvoreniTabulkyUserFunguje() {
        try (Connection conn = DriverManager
                .getConnection("jdbc:sqlite:" + jmenoDbSouboru)) {
            Adresar a = new Adresar(conn);

            // otestuj, ze tabulka user se vytvorila ....
            try {
                a.execute("CREATE TABLE user (id INTEGER PRIMARY KEY, jmeno VARCHAR)");
            } catch (SQLException ex) {
                return;
            }

            fail("nenasel jsem tabulku user");
        } catch (SQLException e) {
            fail("nepovedlo se...");

        }
    }
}