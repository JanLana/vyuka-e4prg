package cz.gyarab.e4prg.s1;

public class MojiLide {
    public static void main(String[] args) {
        Clovek a = new Clovek("Jan", "Lana");
        System.out.println(a);
        System.out.println(a.kolikPismenMam());

        Clovek b = new Clovek("Pepa", null);
        System.out.println(b);
        System.out.println(b.kolikPismenMam());
    }
}
