import java.util.*;


public class frequencycount {
public static void main(String[]args){
    HashMap<Integer,Integer> map =new HashMap<>();
    int ar[]={2,2,3,4,2,2,4,2};
    for(int x :ar){
        map.put(x, map.getOrDefault(x,0)+1);

    }
    System.out.println(map);
}
}
