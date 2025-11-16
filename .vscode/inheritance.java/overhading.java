public class overhading {
    public static int a;

    class hello{
        void sum(){
        System.out.println("Hello");

    }
    void sum(int a){
        System.out.println("a");
    }
    void sum(int a,int b){
        System.out.println("a+b");
    }
    public static void main(String[] args){
        hello ob=new hello();
        ob.sum(5, 5);
}
    }
