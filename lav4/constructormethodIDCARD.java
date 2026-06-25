class IDCard {
    String name;
    String id;
    String department;
    String institution;

    // Constructor
    IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    // Display Method
    void showID() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
    }
}

public class constructormethodIDCARD {
    public static void main(String[] args) {

        IDCard student1 = new IDCard(
                "Sayed",
                "221-15-1234",
                "CCE",
                " International Islamic University");

        student1.showID();
    }
}