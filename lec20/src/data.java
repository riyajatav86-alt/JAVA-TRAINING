import java.io.FileWriter;
import java.io.IOException;

public class data {

    public static void main(String[] args) {
        createData();
    }

    static void createData() {
        try {
            FileWriter writer = new FileWriter("index.html");
            writer.write("hello new file data");
            writer.close();
            System.out.println("File write completed");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

