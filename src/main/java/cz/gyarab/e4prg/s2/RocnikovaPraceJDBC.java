package cz.gyarab.e4prg.s2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class RocnikovaPraceJDBC {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/db3963", "db3963", "phoh3Jai9eek4ae")) {
            System.out.println("spojeni se podarilo");
            /* kód používající conn */
        } catch (SQLException e) {
            System.out.println("chyba: " + e);
        }

        System.out.println("konec");
    }
}
