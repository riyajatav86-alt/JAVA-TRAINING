
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
    class Cat extends Animal {
        void meow() {
            System.out.println("meow meow");
        }
    }
public class Hierachical {
    public static void main(String[] args){
        Dog s1 = new Dog();
        s1.bark();
        s1.eat();

        Cat c1 = new Cat();
        c1.meow();
        c1.eat();
    }
    
}
