package cz.gyarab.e4prg.s2;

import cz.gyarab.e4prg.s1.MyHistory;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertThrows;

@Deprecated
public class SeznamTestu {

    @Override
    public String toString()
    {return "aaa";}


    public static void main(String[] args) {
        Class<?> cl = SeznamTestu.class;

        for (Method m: cl.getDeclaredMethods()) {
            if (m.getAnnotation(Test.class) != null)
                System.out.println(m.getName());
        }

        System.out.println("----------");


        Annotation anot = cl.getAnnotation(Test.class);
        System.out.println("Anotace Test: " + anot);

        Annotation anot2 = cl.getAnnotation(Deprecated.class);
        System.out.println("Anotace Deprecated: " + anot2);
    }

    @Test
    void read() {
        MyHistory h = new MyHistory("\\abc.dat");

        assertThrows(IOException.class, () -> h.read());
    }

    @Test
    void save() {
    }

    void nemamAnotaciTest() {

    }




}
