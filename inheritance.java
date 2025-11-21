class Animal {
    void eat() {
        System.out.println("Pizza");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("biryani");
    }

    void data() {
        System.out.println("hello");
    }
}

public class inheritance {
    public static void main(String[] args) {

        Animal s2 = new Dog(); // upcasting
        s2.eat();  // Output: biryani
    }
}

    
      
