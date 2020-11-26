package geco;

import java.security.SecureRandom;

public class PasswordGeneation {
    private final static int MIN_ASCII = 33;
    private final static int MAX_ASCII = 122;

    SecureRandom random;

    /**
     * constructeur.
     */
    public PasswordGeneation() {
        random = new SecureRandom();
    }

    /**
     * renvoie un mot de passe aléatoire.
     * @param size taille du mot de passe
     */
    public String getRandomPassword(int size){
        String password = "";
        for (int i = 0 ; i<size ; i ++){
            int charValue = random.nextInt((MAX_ASCII - MIN_ASCII)+1)+ MIN_ASCII;
            password += (char)charValue;
        }
        return password;
    }
}
