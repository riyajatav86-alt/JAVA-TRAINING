import java.util.HashSet;
public class intersection_Array {
    public static void main(String[]args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr1[]={9,8,7,6,5,4,3,2,1};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for(int x:arr){
            set1.add(x);
        }
        for(int y: arr){
            if(set1.contains(y)){
                result.add(y);
                System.out.println(result);
            }
        }
    }
}
