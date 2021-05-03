import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char result;
        char EncryptedChar;
        int key = scanner.nextInt();
        String encoded = scanner.next();
        char[] end = new char[encoded.length()];
        try {
            for (int i = 0; i <= encoded.length() - 1; i++) {
                result = encoded.charAt(i);
                if (result + key > 126) {
                    EncryptedChar = (char) (32 + (result + key - (127)));
                    end[i] = (EncryptedChar);
                } else
                    EncryptedChar = (char) (result + key);
                end[i] = (EncryptedChar);
            }
        } catch (Exception e) {
            System.out.println("Hello");
        }
        for (char c : end) {
            System.out.print(c);
        }
    }
}