//Armstrong number

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int sumOfPowers = 0;
        int numberOfDigits = 0;

        
        int tempNum = num;
        while (tempNum != 0) {
            tempNum /= 10;
            numberOfDigits++;
        }

    
        tempNum = num; 
        while (tempNum != 0) {
            int digit = tempNum % 10; 
            sumOfPowers += Math.pow(digit, numberOfDigits); 
            tempNum /= 10; 
        }

        
        if (sumOfPowers == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
