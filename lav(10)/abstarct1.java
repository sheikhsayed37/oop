abstract class Shape {

    // Abstract Method
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.1416 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class abstarct1 {
    public static void main(String[] args) {

        Circle c = new Circle(7);
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Circle Area = " + c.area());
        System.out.println("Rectangle Area = " + r.area());
    }
}