
    import java.util.ArrayList;

public class merge_Array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(112);
        list1.add(12);
        list1.add(224);
        list2.add(025);
        list2.add(113);
        list2.add(219);
        System.out.println("____FIRST ARRAY_LIST____");
        System.out.println(list1);
        System.out.println("_____SECOND ARRAY_LIST____");
        System.out.println(list2);
        System.out.println("_____MERGE ARRAY_LIST____");
        list1.addAll(list2);
        System.out.println(list1);

    }


}