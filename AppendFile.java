
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {
        createData();     // append function
        createFile();     // create new file function
    }
    // Create new file (if not exists)
    static void createFile() {
        try {
            File file = new File("index.html");

            if (file.createNewFile()) {
                System.out.println("--- done!! file created ---");
            } else {
                System.out.println("--- sorry!! file already exists ---");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Append data in file
    static void createData() {
        try {
            FileWriter writer = new FileWriter("index.html", true);  // append = true
            writer.write("\n--- new data inserted to the file ---");
            writer.close();

            System.out.println("Data appended successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
