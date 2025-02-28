class Car {
    String model;
    int year;
    String color;

    // Constructor 1: No parameters (Default constructor)
    public Car() {
        model = "Unknown";
        year = 0;
        color = "Unspecified";
    }

    // Constructor 2: One parameter
    public Car(String model) {
        this.model = model;
        year = 0;
        color = "Unspecified";
    }

    // Constructor 3: Two parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        color = "Unspecified";
    }

    // Constructor 4: Three parameters
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using different constructors to create objects
        Car car1 = new Car();  // Calls Constructor 1
        Car car2 = new Car("Tesla");  // Calls Constructor 2
        Car car3 = new Car("BMW", 2023);  // Calls Constructor 3
        Car car4 = new Car("Audi", 2020, "Red");  // Calls Constructor 4

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
        car4.displayInfo();
    }
}
