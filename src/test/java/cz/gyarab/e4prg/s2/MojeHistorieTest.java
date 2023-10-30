package cz.gyarab.e4prg.s2;

import cz.gyarab.e4prg.s1.MyHistory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MojeHistorieTest {

    @TempDir
    private Path tmpDir;

    @Test
    void readTest() {
        //File tmpDir = new File("tmp");
        //tmpDir.mkdir();

        MojeHistorie h = new MojeHistorie(tmpDir + "/readTest.data");
        System.out.println(h.filename);

        assertThrows(IOException.class, () -> h.read());

        // smaz tmpDir
    }

    @Test
    void saveTest() {
        MojeHistorie h = new MojeHistorie(tmpDir +"/readTest.data");
        System.out.println(h.filename);


        try {
            h.save();
        } catch (IOException e) {
            assertTrue(false);
        }
    }

    @Test
    void saveAndReadTest() {

    }

    @Test
    void addLineTest() {
        MojeHistorie h = new MojeHistorie("abc");
        h.addLine("radek 1");

        assertEquals("radek 1", h.toString());
    }

    @Test
    void addMoreLinesTest() {
        MojeHistorie h = new MojeHistorie("abc");
        h.addLine("radek 1");
        h.addLine("radek 2");
        h.addLine("radek 3");

        assertEquals("radek 1\nradek 2\nradek 3", h.toString());
    }

    @Test
    void duplicityLinesTest() {
        MojeHistorie h = new MojeHistorie("abc");
        h.addLine("radek 1");
        h.addLine("radek 2");
        h.addLine("radek 3");
        h.addLine("radek 2");

        assertEquals("radek 1\nradek 2\nradek 3", h.toString());
    }

}