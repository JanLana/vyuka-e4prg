package cz.gyarab.e4prg.s2;

import cz.gyarab.e4prg.s1.MyHistory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MojeHistorieTest {

    @Test
    void read() {
        MojeHistorie h = new MojeHistorie("abc");
        assertThrows(IOException.class, () -> h.read());

//        try {
//            h.read();
//            System.out.println("Chyba!!!");
//        } catch (IOException e) {
//            System.out.println("ok");
//        }
    }

    @Test
    void addLine() {
        MojeHistorie h = new MojeHistorie("abc");
        h.addLine("radek 1");

        assertEquals("radek 1", h.toString());
    }

    @Test
    void addMoreLines() {
        MojeHistorie h = new MojeHistorie("abc");
        h.addLine("radek 1");
        h.addLine("radek 2");
        h.addLine("radek 3");

        assertEquals("radek 1\nradek 2\nradek 3", h.toString());
    }

    @Test
    void duplicityLines() {
        MojeHistorie h = new MojeHistorie("abc");
        h.addLine("radek 1");
        h.addLine("radek 2");
        h.addLine("radek 3");
        h.addLine("radek 2");

        assertEquals("radek 1\nradek 2\nradek 3", h.toString());
    }

}