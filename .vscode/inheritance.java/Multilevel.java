
    class Animal {
        void eat() {
            System.out.println("pizza");
        }
    }
 class Dog  extends Animal {
        void bark() {
            System.out.println("hele");
        }
    }
    class puppy extends Dog {
        void weep() {
            System.out.println("weeping");
        }
    }
    public class Multilevel {

    public static void main(String[] args){
        puppy p1 = new puppy();
        p1.weep();
        p1.bark();
        p1.eat();
    }
    
}
