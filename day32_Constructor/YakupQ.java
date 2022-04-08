package day32_Constructor;
import java.util.Scanner;
public class YakupQ {






        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int sum = 0;
            int attempt = 3;

            do {

                System.out.println("Enter a positive number:");
                int user = scanner.nextInt();

                if (user < 0) {
                    System.out.println("number shouldn't be negative");
                    System.out.println("your number is: " + user );
                    attempt--;
                    System.out.println("your remaining attempts is: " + attempt);
                }

                sum = sum + user;
                System.out.println("sum is: " + sum);

            } while (attempt > 0);

        }
}
