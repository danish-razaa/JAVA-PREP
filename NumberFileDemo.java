import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NumberFileDemo {

    // Write first 100 even numbers
    public static void writeNumbers() {
        try {
            FileWriter writer = new FileWriter("numbers.txt");

            for (int i = 2; i <= 200; i += 2) {
                writer.write(i + "\n");
            }

            writer.close();
            System.out.println("Numbers written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read numbers from file
    public static void readNumbers() {
        try {
            FileReader reader = new FileReader("numbers.txt");

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        writeNumbers();

        System.out.println("\nContents of file:");
        readNumbers();
    }
}