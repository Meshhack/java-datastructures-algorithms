/**Project Substitution Ciphers
 *
/ *The Caesar Cipher is a simple substitution cipher that shifts letters by a fixed number of positions in the alphabet. For exampl/e, with a shift of 3, A becomes D, B becomes E, and so on. This project implements the Caesar Cipher and allows users to encrypt a/nd decrypt messages using a specified shift value.  
 */


  

public class JavaDoc {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    

    public static String encrypt(String plaintext, int shift) {
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (Character.isLetter(c)) {
                int index = ALPHABET.indexOf(Character.toUpperCase(c));
                int newIndex = (index + shift) % ALPHABET.length();
                char newChar = ALPHABET.charAt(newIndex);
                ciphertext += Character.isLowerCase(c) ? Character.toLowerCase(newChar) : newChar;
            } else {
                ciphertext += c;
            }
        }
        return ciphertext;
    }

    public static String Decrypt(String ciphertext, int shift) {
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            if (Character.isLetter(c)) {
                int index = ALPHABET.indexOf(Character.toUpperCase(c));
                int newIndex = (index - shift + ALPHABET.length()) % ALPHABET.length();
                char newChar = ALPHABET.charAt(newIndex);
                plaintext += Character.isLowerCase(c) ? Character.toLowerCase(newChar) : newChar;
            } else {
                plaintext += c;
            }
        }
        return plaintext;
    }

    public static void main(String[] args) {
        String message = "TRAVELEAST";
        int shift = 3;

        System.out.println("Original Message: " + message);
        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encryptedMessage);
        String decryptedMessage = Decrypt(encryptedMessage, shift);
        System.out.println("Decrypted Message: " + decryptedMessage);   
    }
}
