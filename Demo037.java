import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int number4 = scanner.nextInt();

        int largest = number1;

        if(number2 > largest) {
            largest = number2;
        }

        if(number3 > largest) {
            largest = number3;
        }

        if(number4 > largest) {
            largest = number4;
        }

        System.out.println(largest + " is the biggest number.");
        
        scanner.close();
    }
}

