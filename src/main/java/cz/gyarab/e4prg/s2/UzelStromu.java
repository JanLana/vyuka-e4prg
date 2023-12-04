package cz.gyarab.e4prg.s2;

public class UzelStromu {
    String jmeno;
    UzelStromu levy;
    UzelStromu pravy;

    public UzelStromu(String jmeno, UzelStromu levy, UzelStromu pravy) {
        this.jmeno = jmeno;
        this.levy = levy;
        this.pravy = pravy;
    }

    public UzelStromu(String jmeno) {
        this(jmeno, null, null);
    }

    public void projdiDoHloubky() {
        System.out.print(jmeno + " ");
        if (levy != null) {
            levy.projdiDoHloubky();
        }
        if (pravy != null) {
            pravy.projdiDoHloubky();
        }
    }


    public static void main(String[] args) {
        UzelStromu koren =
                new UzelStromu("A",
                        new UzelStromu("B",
                                new UzelStromu("D",
                                        new UzelStromu("G",
                                                new UzelStromu("I"),
                                                new UzelStromu("J")),
                                        null),
                                new UzelStromu("E")),
                        new UzelStromu("C", null,
                                new UzelStromu("F",
                                        new UzelStromu("H"),
                                        null)));

        System.out.println("Do hloubky:\t");
        koren.projdiDoHloubky();
        System.out.println("Do sirky:\t");
        //koren.projdiDoSirtky();
    }
}
