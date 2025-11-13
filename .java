 public class constractorinheritance {
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
        
        }
    }
    public static void main(String[] args){
        Dog s1 = new Dog();
        s1.bark();
        s1.eat();
    }
}
