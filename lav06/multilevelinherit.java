class Grandfather {
    void company() {
        System.out.println("Grandfather owns a company.");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father owns a car.");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son owns a bike.");
    }
}

public class multilevelinherit {
    public static void main(String[] args) {

        Son s = new Son();

        s.company(); // from Grandfather
        s.car();     // from Father
        s.bike();    // from Son
    }
}