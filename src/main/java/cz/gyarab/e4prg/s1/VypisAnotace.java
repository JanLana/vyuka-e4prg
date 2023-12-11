package cz.gyarab.e4prg.s1;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

@Deprecated
public class VypisAnotace {
    @Override
    public String toString() {
        return "aaaa";

    }

    public static void main(String[] args) {
        Class<?> mojeTrida = VypisAnotace.class;

        for (Method m: mojeTrida.getDeclaredMethods()) {
            if (m.getAnnotation(Test.class) != null)
                System.out.println(m.getName());
        }

        /*
        Annotation anot = mojeTrida.getAnnotation(Deprecated.class);
        Annotation anot2 = mojeTrida.getAnnotation(Test.class);

        System.out.println("mam anotaci Deprecated:" + anot);
        System.out.println("mam anotaci Test:" + anot2);
*/
    }



    @Test
    public void testPositive() {
        int out = MyMin.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = MyMin.min(-1, -2);
        assertEquals(-2, out);
    }

    public void nedelaNic() {

    }


}
