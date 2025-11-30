import java.util.*;

public class Yellow {
    public static void main(String[]args){
     int[] arr = {3,5,7,8,1,5,7,9};
     Map<Integer,Integer>Map=new HashMap<>();
     for(int n : arr){
         Map.put(n,Map.getOrDefault(n,0)+1);
     }
     for (Map.Entry<Integer, Integer>e: Map.entrySet()){
         System.out.println(e.getKey()+"_"+e.getKey());
     }

    }
}
