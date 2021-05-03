            import java.util.Scanner;

            public class decode {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    char result;
                    char EncryptedChar;
                    int key = 0;
                    String encoded = scanner.next();
                    char[] end = new char[encoded.length()];
                    try {
                        for (; key < 100; key++) {
                            for (int i = 0; i < encoded.length(); i++) {
                                result = encoded.charAt(i);
                                if (result - key > 126) {
                                    EncryptedChar = (char) (32 + (result - key + (127)));
                                    end[i] = (EncryptedChar);
                                    System.out.println("Decoded with i=" + key + ":" + new String(end));
                                } else
                                    EncryptedChar = (char) (result - key);
                                end[i] = (EncryptedChar);
                                System.out.println("Decoded with i=" + key + ":" + new String(end));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Hello");
                    }
                }
            }



