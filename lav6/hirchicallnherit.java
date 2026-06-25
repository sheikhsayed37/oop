class Person {

    void displayInfo() {
        System.out.println("Name: SHEIKH MOHAMMED SAYED ALI");
        System.out.println("ID: E253045");
    }
}

class Doctor extends Person {

    void treatPatient() {
        System.out.println("Doctor treats patients.");
    }
}

class Teacher extends Person {

    void teachStudents() {
        System.out.println("Teacher teaches students.");
    }
}

class Engineer extends Person {

    void buildSystems() {
        System.out.println("Engineer designs and builds systems.");
    }
}

public class hirchicallnherit {
    public static void main(String[] args) {

        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Engineer e = new Engineer();

        System.out.println("Doctor Information:");
        d.displayInfo();
        d.treatPatient();

        System.out.println();

        System.out.println("Teacher Information:");
        t.displayInfo();
        t.teachStudents();

        System.out.println();

        System.out.println("Engineer Information:");
        e.displayInfo();
        e.buildSystems();
    }
}