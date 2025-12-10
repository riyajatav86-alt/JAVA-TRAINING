import java.io.File;
import java.io.IOException;

public class hello {
    public static void main(String[] args) {
        try {
            File file = new File("home.html");

            if (file.createNewFile()) {
                System.out.println("Done: " + file.getName());
            } else {
                System.out.println("Already file created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
