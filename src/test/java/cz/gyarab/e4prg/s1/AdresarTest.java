package cz.gyarab.e4prg.s1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class AdresarTest {
    String testovaciDB = "ttt.db";

    @Test
    public void vytvoreniTabulkyUSER()  {
        // s prazdnou databazi
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + testovaciDB)) {
            Adresar a = new Adresar(conn);
            // tady by mela tabulka USER v databazi exisovat, extuje opravdu?
            DatabaseMetaData databaseMetaData = conn.getMetaData();
            ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[] {"TABLE"});

            while (resultSet.next()) {
                String name = resultSet.getString("TABLE_NAME");
                if (name.equals("USER"))
                    return;
            }
            fail("nevytvari tabulku user");
        } catch (SQLException e) {
            fail("Nastala vyjimka " + e);
        }
    }

    @BeforeEach
    @AfterEach
    private void prepareDisk() {
        try {
            Files.delete(Paths.get(testovaciDB));
        } catch (IOException e) {
        }
    }

    @Test
    public void fungujePokudTabulkaUSERuzExistuje() {

        // s databazi ve ktere uz tabulka USER existuje
        //Adresar a = new Adresar();
    }


    @Test
    public void fungujePokudTabulkaUSERuzExistujeAleJina() {

    }

}