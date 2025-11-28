import java.util.HashSet;


    public class properties {
        public static void main(String[] args) {
            int arr[] = {1, 5, 2, 6, 7};
            HashSet<Integer> set = new HashSet<>();
            for (int x : arr) {
                if (set.contains(x)) {
                    System.out.println(true);
                }
                set.add(x);
                System.out.println(false);
            }
        }
    }
