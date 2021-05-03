import java.util.Scanner;

public class encode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char message;
        char encryptedChar;
        int key = scanner.nextInt();
        String encoded = scanner.next();
        char[] end = new char[encoded.length()];
        try {
            for (int i = 0; i <= encoded.length() - 1; i++) {
                message = encoded.charAt(i);
                if (message + key > 126) {
                    encryptedChar = (char) (32 + (message + key - (127)));
                    end[i] = (encryptedChar);
                } else
                    encryptedChar = (char) (message + key);
                end[i] = (encryptedChar);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        for (char c : end) {
            System.out.print(c);
        }
    }
}
