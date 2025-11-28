import java.util.*;
public class duplicate_value {
    public static void main (String[]args){
        int arr[]={12,13,45,67,87,45,34};
        HashSet<Integer>set=new HashSet<>();
        set.add(45);
        set.add(56);
        set.add(25);
        set.add(23);
        System.out.println(set);

    }
}
