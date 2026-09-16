import java.io.*;
import java.util.*;

public class HotelBrochureUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File file = new File("brochure.txt");

            // Create brochure file if it doesn't exist
            if (!file.exists()) {

                BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                bw.write("Hotel Name: Paradise Hotel\n");
                bw.write("Location: Mumbai\n\n");
                bw.write("Menu:\n");
                bw.write("1. Paneer Tikka\n");
                bw.write("2. Veg Biryani\n");
                bw.write("3. Gulab Jamun\n");

                bw.close();

                System.out.println("brochure.txt created successfully!");
            }

            // Read file content
            StringBuilder content = new StringBuilder();

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }

            br.close();

            System.out.println("\nCurrent Brochure:");
            System.out.println("--------------------");
            System.out.println(content);

            System.out.println("1. Update Hotel Location");
            System.out.println("2. Update Menu Item");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            String updatedContent = content.toString();

            switch (choice) {

                case 1:

                    System.out.print("Enter current location: ");
                    String oldLocation = sc.nextLine();

                    System.out.print("Enter new location: ");
                    String newLocation = sc.nextLine();

                    updatedContent = updatedContent.replace(
                            "Location: " + oldLocation,
                            "Location: " + newLocation);

                    break;

                case 2:

                    System.out.print("Enter existing menu item: ");
                    String oldItem = sc.nextLine();

                    System.out.print("Enter new menu item: ");
                    String newItem = sc.nextLine();

                    updatedContent =
                            updatedContent.replace(oldItem, newItem);

                    break;

                default:
                    System.out.println("Invalid choice!");
                    sc.close();
                    return;
            }

            // Write updated content back to file
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter(file));

            bw.write(updatedContent);

            bw.close();

            System.out.println("\nBrochure updated successfully!");

            // Display updated brochure
            System.out.println("\nUpdated Brochure:");
            System.out.println("--------------------");

            BufferedReader updatedReader =
                    new BufferedReader(new FileReader(file));

            while ((line = updatedReader.readLine()) != null) {
                System.out.println(line);
            }

            updatedReader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}