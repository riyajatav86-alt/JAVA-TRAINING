import java.io.File;
import java.io.IOException;

public class file_creation {

    public static void main(String[] args) {
        try {

            File f = new File("home.html");

            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("--- !! file of this name is already created ---");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

