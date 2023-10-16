package cz.gyarab.e4prg.s1;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Base64;

public class HledejKlic {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        long sum = 0;

        for (int i = 0; i < 10; i++) {
            keyPairGenerator.initialize(4096);

            KeyPair keyPair = keyPairGenerator.generateKeyPair();

        }
        System.out.println("prumer: " + (sum / 10) + "ms");

        /*
        while(true){
            keyPairGenerator.initialize(8192);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPair.getPublic();
            byte[] pub = publicKey.getEncoded();
            String encoded = Base64.getEncoder().encodeToString(pub);
            if (encoded.charAt(49) == 'A' || encoded.charAt(49) == 'a'){
                System.out.println(encoded);
                return;
            }
        }

         */
    }
}
