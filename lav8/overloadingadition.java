class Calculator {

    // Addition of two numbers
    int addition(int a, int b) {
        return a + b;
    }

    // Addition of three numbers
    int addition(int a, int b, int c) {
        return a + b + c;
    }
    

    // Addition of two decimal numbers
    double addition(double a, double b) {
        return a + b;
    }
}

public class overloadingadition {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20 = "
                + calc.addition(10, 20));

        System.out.println("Sum of 10, 20 and 30 = "
                + calc.addition(10, 20, 30));

        System.out.println("Sum of 5.5 and 4.5 = "
                + calc.addition(5.5, 4.5));
    }
}