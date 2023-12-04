package cz.gyarab.e4prg.s1;

public class VrcholStromu {
    String jmeno;
    VrcholStromu levy;
    VrcholStromu pravy;

    public VrcholStromu(String jmeno, VrcholStromu levy, VrcholStromu pravy) {
        this.jmeno = jmeno;
        this.levy = levy;
        this.pravy = pravy;
    }

    public VrcholStromu(String jmeno) {
        this.jmeno = jmeno;
        //levy = pravy = null;
    }

    public static void main(String[] args) {
        VrcholStromu koren =
                new VrcholStromu("A",
                        new VrcholStromu("B",
                                new VrcholStromu("D"),
                                new VrcholStromu("E")),
                        new VrcholStromu("C",
                                new VrcholStromu("F",
                                        new VrcholStromu("H"),
                                        new VrcholStromu("I")),
                                new VrcholStromu("G")));

        VrcholStromu vrcholH = new VrcholStromu("H", null, null);
        VrcholStromu vrcholI = new VrcholStromu("I", null, null);
        VrcholStromu vrcholF = new VrcholStromu("F", vrcholH, vrcholI);



    }
}
