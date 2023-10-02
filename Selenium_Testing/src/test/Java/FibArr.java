public class FibArr {
    // Dynamic Programming approach for  Fibonacci Series
    // Function to find the fibonacci Series
    static int fib(int n) {
        // Declare an array to store Fibonacci numbers 1 extra to handle case, n = 0
        int[] fib = new int[n + 2];

        int i;
        // 0th and 1st number of the series are 0 and 1
        fib[0] = 0;
        fib[1] = 1;
        for (i = 2; i <= n; i++) {
            // Add the previous 2 number in the series and store it
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        // Nth Fibonacci Number
        return fib[n];
    }

    public static void main(String[] args) {
        // Given Number N
        int n = 10;
        // Print first 10 term
        for (int i = 0; i < n; i++)
            System.out.print(fib(i) + " ");
    }
}