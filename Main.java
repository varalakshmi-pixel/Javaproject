public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b; // Swap Two Numbers (With Third Variable Using temp)
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);

        int c = 10;
        int d = 20;

        System.out.println("Before swapping:");
        System.out.println("c = " + c + ", d = " + d);

        c = c + d;  
        d = c - d; // Swap Two Numbers (Without Third Variable)
        c = c - d;

        System.out.println("After swapping:");
        System.out.println("c = " + c + ", d = " + d);
    }
}


