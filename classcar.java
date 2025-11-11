public class classcar {
    String model;
    int year;
    
    classcar(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
    
    public static void main(String[] args) {
        classcar myCar = new classcar("riya", 2025);
        myCar.displayInfo();
    }
}

