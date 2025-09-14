//Find Factorial of a Number Using Loop

// public class Main2 {

//     public static long Char(int n) {
//         if (n < 0) {
//             throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
//         }
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         long factorial = 1;
//         for (int i = 2; i <= n; i++) {
//             factorial *= i;
//         }
//         return factorial;
//     }

//     public static void main(String[] args) {
//         int number = 5;
//         System.out.println("Factorial of " + number + Char(number)); 
//     }
// }


//Find Factorial of a Number Using Recursion



public class Main2 {

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        // Factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
    
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + calculateFactorial(number)); 
    }
}