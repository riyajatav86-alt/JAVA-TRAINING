import java.util.*;

public class Shorted_Integer_ArrayList {
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(9);
        Collections.sort(list);
        System.out.println(list);
    }
}
