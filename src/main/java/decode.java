            import java.util.Scanner;

            public class decode {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    char message;
                    char encryptedChar;
                    int key = 0;
                    String decode = scanner.next();
                    char[] end = new char[decode.length()];
                    try {
                        for (; key < 100; key++) {
                            for (int i = 0; i < decode.length(); i++) {
                                message = decode.charAt(i);
                                if (message - key > 126) {
                                    encryptedChar = (char) (32 + (message - key + (127)));
                                    end[i] = (encryptedChar);
                                    System.out.println("Decoded with i=" + key + ":" + new String(end));
                                } else
                                    encryptedChar = (char) (message - key);
                                end[i] = (encryptedChar);
                                System.out.println("Decoded with i=" + key + ":" + new String(end));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                }
            }



