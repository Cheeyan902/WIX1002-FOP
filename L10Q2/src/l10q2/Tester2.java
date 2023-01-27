package l10q2;

public class Tester2 {

    public static void main(String[] args) {
     
        SubstitutionCipher plainInput = new SubstitutionCipher("inputPlain.txt", "outputCipher.txt", 5);
        SubstitutionCipher cipherInput = new SubstitutionCipher("inputCipher.txt", "outputPlain.txt", 5);

        plainInput.convertFrom("Plain");
        cipherInput.convertFrom("Cipher");
        
    }
    
}
