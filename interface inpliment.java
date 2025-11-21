public class interface inpliment {
    
    interface A {
         void show();

    }
    class B implements A {
 }
public class main{
    public static void main (string []args){
        A obj=new B();
        obj.show();
    } 
    
    
