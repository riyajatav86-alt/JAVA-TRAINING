public class array_list {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    list.add(70);
    int a=  list.size();
    int m=a/2;

    ListIterator<Integer> it = list.listIterator();
    while(it.hasNext()&& it.nextIndex()<=m){
        Integer x= it.next();
        //if(x==50){
        //  it.add(10);
        //it.set(60);
        System.out.println(x);
        // }
    }
    while(it.hasPrevious()){
        Integer y= it.previous();
        System.out.println(y);
    }
}{
}
