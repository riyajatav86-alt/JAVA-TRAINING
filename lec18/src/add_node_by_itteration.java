import java.util.*;
public class add_node_by_itteration {
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            if(x==50){
                it.add(20);
                System.out.println(list);
            }
        }
    }
}
