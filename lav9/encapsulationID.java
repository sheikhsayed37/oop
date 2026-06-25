class Student {

    // Private fields
    private String name;
    private String id;
    private double cgpa;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class encapsulationID {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("SHEIKH MOHAMMED SAYED ALI");
        s.setId("E253045");
        s.setCgpa(3.85);

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("CGPA: " + s.getCgpa());
    }
}