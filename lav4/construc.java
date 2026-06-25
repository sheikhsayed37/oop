class Car {
    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display Method
    void displayCar() {
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class constructormethodcar {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2500000);

        car1.displayCar();
    }
}