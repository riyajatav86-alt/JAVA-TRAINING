import java.util.*;
public class replace_absolute {
    public static int abs(int n) {
        if (n < 0)
            return -n;
        else
            return n;
    }

    public static void main(String[] args) {
        int num = -25;
        System.out.println("Absolute value: " + abs(num));
    }
}
