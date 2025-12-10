import java.util.*;
public class backward_move {
public static void main(String[]args){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(100);
    list.add(150);
    list.add(120);
    list.add(190);
    list.add(160);
    list.add(160);
    list.add(130);
    list.add(177);
    int a= list.size();
    int m=a/2;
    ListIterator<Integer> it = list.listIterator();
    while(it.hasPrevious()&& it.nextIndex()<=m){
        Integer x= it.next();
        System.out.println(x);
    }
    while(it.hasPrevious()){
        Integer y=it.previous();
        System.out.println(y);
    }

}
}