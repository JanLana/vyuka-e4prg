package cz.gyarab.e4prg.s1;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Clovek {
    @NonNull String jmeno;
    @NonNull String prijmeni;

    public int kolikPismenMam() {
        return jmeno.length() + prijmeni.length();
    }
}
