package armstrong;

import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        int original = number;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result += digit * digit * digit;
            number /= 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong number ");
        } else {
            System.out.println(original + " is not an Armstrong number ");
        }

        sc.close();
    }
}

