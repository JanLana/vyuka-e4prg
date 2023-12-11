package cz.gyarab.e4prg.s2;

import lombok.NonNull;
import lombok.ToString;

@ToString
public class Clovek {
    private String jmeno;
    private String prijmeni;

    public Clovek(@NonNull String jmeno, @NonNull String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public int pismenVeJmene() {
        return jmeno.length() + prijmeni.length();
    }
}
