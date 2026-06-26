import java.util.Scanner;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        int[] prime = new int[end - start + 1];
        int count = 0;

        for (int num = start; num <= end; num++) {

            if (num < 2)
                continue;

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                prime[count] = num;
                count++;
            }
        }

        System.out.println("Prime Numbers:");

        for (int i = 0; i < count; i++) {
            System.out.print(prime[i] + " ");
        }

        input.close();
    }
}
