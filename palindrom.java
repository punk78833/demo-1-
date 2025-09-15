import java.util.Scanner;

public class palindrom {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;              // Extract last digit
            reversedNumber = reversedNumber * 10 + digit;  // Build reversed number
            number /= 10;                         // Remove last digit
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is palindrome: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is NOT a palindrome.");
        }

        scanner.close();
    }
}
