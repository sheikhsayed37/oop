class Shape {

    // Rectangle Area
    double area(double length, double width) {
        return length * width;
    }

    // Circle Area
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

public class overloadingarea {
    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("Rectangle Area = "
                + s.area(10, 5));

        System.out.println("Circle Area = "
                + s.area(7));
    }
}
