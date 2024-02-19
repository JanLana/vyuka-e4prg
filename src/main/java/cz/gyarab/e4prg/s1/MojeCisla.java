package cz.gyarab.e4prg.s1;

import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.ArrayList;

@Data
public class MojeCisla {
    @NonNull List<Integer> data;

    public void udelejSKazdymNeco(OperaceNadCislem op) {
        for(int i = 0; i < data.size(); i++) {
            int v = data.get(i);
            v = op.udelejNeco(v);
            data.set(i, v);
        }
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(13);
        data.add(-5);

        MojeCisla m = new MojeCisla(data);
        System.out.println("puvodni:" + m);

        m.udelejSKazdymNeco(new VynasobDvema());


        System.out.println("vynasobDvema:" + m);

        m.udelejSKazdymNeco(new OperaceNadCislem() {
            @Override
            public int udelejNeco(int x) {
                return x < 0 ? -1*x : x;
            }
        }
        );

        System.out.println("vysledek:"+ m);

        // otoc znamenko
        /*
        m.udelejSKazdymNeco(
                () -> {return -1*x;}
        );
         */

        m.udelejSKazdymNeco(k -> -1*k);

        final String prefix = "- ";

        OperaceNadCislem vynasobMinusJedna = k -> -1*k;
        OperaceNadCislem vynasobDeseti = k -> 10*k;
        OperaceNadCislem vypis = x -> { System.out.println(prefix + x); return x; };

        m.udelejSKazdymNeco(vynasobMinusJedna);
        m.udelejSKazdymNeco(vynasobDeseti);

        m.udelejSKazdymNeco(vypis);
        //prefix = "+ ";
        m.udelejSKazdymNeco(vypis);



        System.out.println("vysledek:"+ m);




    }
}
