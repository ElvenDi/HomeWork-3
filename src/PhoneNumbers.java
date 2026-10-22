import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumbers {
    public static void printNumbers() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
                    System.out.println(line);
                }
                if (line.matches("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}")) {
                    System.out.println(line);
                }
            }
            }
        }
    }
