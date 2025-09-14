//Reverse the String

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = input.nextInt();

        int originalNum = num; 
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Original number: " + originalNum);
        System.out.println("Reversed number: " + reversedNum);

        input.close();
    }
}