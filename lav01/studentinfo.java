public class studentinfo {
     public static void main(String[] args) {
        String name = "Sheikh Mohammed Sayed Ali";
        String studentId = "E253045";
        int age = 20;
        String email = "sheikhmohammedsayedali.com";
        String phone = "0189273738";
        String address = "Chattogram";

        
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

        System.out.printf("\nFormatted Personal Information:\n");       
        System.out.printf("Name: %s\n", name);
        System.out.printf("Student ID: %s\n", studentId);   
        System.out.printf("Age: %d\n", age);
        System.out.printf("Email: %s\n", email);        
        System.out.printf("Phone: %s\n", phone);
        System.out.printf("Address: %s\n", address);
                
    }
}

