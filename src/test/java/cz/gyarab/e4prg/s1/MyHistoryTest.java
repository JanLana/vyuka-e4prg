package cz.gyarab.e4prg.s1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MyHistoryTest {
    @Test
    void read() {
        MyHistory h = new MyHistory("abc");

        assertThrows(IOException.class, () -> h.read());

    }



    @Test
    void save() {
    }

    @Test
    void addMoreLine() {
        MyHistory h = new MyHistory("abc");
        h.addLine("radek 1");
        h.addLine("radek 2");
        h.addLine("radek 3");

        assertEquals("radek 1\nradek 2\nradek 3\n", h.toString());
    }

    @Test
    void addDuplicateLine() {
        MyHistory h = new MyHistory("abc");
        h.addLine("radek 1");
        h.addLine("radek 2");
        h.addLine("radek 3");
        h.addLine("radek 1");


        assertEquals("radek 1\nradek 2\nradek 3\n", h.toString());
    }

    @Test
    void addLine() {
        MyHistory h = new MyHistory("abc");
        h.addLine("radek 1");
        assertEquals("radek 1\n", h.toString());


//        if (h.toString().equals("radek 1")) {
//            System.out.println("test prosel");
//        } else {
//            System.out.println("test neprosel, toString vratil " + h.toString() + " ale  ja chtel " + "radek1");
//        }
    }

}