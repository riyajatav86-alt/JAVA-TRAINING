public class parameterizedconstructor {
    class car{
        car(String model, int year){
            System.out.println("Car Model: " + model);
            System.out.println("Manufacturing Year: " + year);
        }
    }
    public static void main(String[] args) {
        car myCar = new parameterizedconstructor().new car("riya", 2025);
    }
}
    
