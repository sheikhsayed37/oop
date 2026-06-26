import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        
        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        int[] even = new int[end - start + 1];
        int count = 0;
        int i = start;

        while (i <= end) {
            if (i % 2 == 0) {
                even[count] = i;
                count++;
            }
            i++;
        }

        System.out.println("Even Numbers:");
        int j = 0;
        while (j < count) {
            System.out.print(even[j] + " ");
            j++;
        }

        input.close();
    }
}