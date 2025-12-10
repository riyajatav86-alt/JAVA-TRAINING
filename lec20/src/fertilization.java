import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;class Egg {
    boolean isFertilized = false;

    void fertilize() {
        isFertilized = true;
        System.out.println("Fertilization successful! Zygote created.");
    }
}

class Sperm {
    boolean isHealthy;

    Sperm(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }
}

public class fertilization {

    public static void main(String[] args) {
        Egg egg = new Egg();

        Sperm sperm = new Sperm(true);  // healthy sperm

        if (sperm.isHealthy) {
            egg.fertilize();
        } else {
            System.out.println("Fertilization failed. Sperm not healthy.");
        }
    }
}
