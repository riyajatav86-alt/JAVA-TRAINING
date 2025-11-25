package MYPACKAGE.src;

public class final method {
    class Parent {
        final void show() {
            System.out.println("Parent show");
        }
    }
    class Child extends Parent {
        // Trying to override final method will cause a compile-time error
        /*
        void show() {
            System.out.println("Child show");
        }
        */
    }
    
}
