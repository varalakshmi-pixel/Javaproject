//Generate Fibonacci series Using Loop

// public class Main3 {
//     public static void Fibonacci(int n) {
//         if (n <= 0) {
//             System.out.println("Please enter a positive integer.");
//             return;
//         } else if (n == 1) {
//             System.out.println("0");
//             return;
//         }

//         int a = 0;
//         int b = 1;
//         System.out.print(a + " " + b); 

//         for (int i = 2; i < n; i++) {
//             int Value = a + b;
//             System.out.print(" " + Value);
//             a = b;
//             b = Value;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int Count = 10;
//         System.out.print("Fibonacci Series: ");
//         Fibonacci(Count);
//     }
// }




//Generate Fibonacci Series Using Recursion 

public class Main3 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}