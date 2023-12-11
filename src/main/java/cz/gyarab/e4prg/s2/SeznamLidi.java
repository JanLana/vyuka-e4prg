package cz.gyarab.e4prg.s2;

public class SeznamLidi {
    public static void main(String[] args) {
        Clovek c = new Clovek("Vaclav", null);

        System.out.println(c);
        System.out.println("Pisem: " + c.pismenVeJmene());
    }
}
