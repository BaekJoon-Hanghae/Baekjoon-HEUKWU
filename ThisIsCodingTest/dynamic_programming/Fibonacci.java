package ThisIsCodingTest.dynamic_programming;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci_recursion(4));
        System.out.println(fibonacci_memoization(50));
        System.out.println(fibonacci_loop(50));
    }

    //recursion function
    public static int fibonacci_recursion(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        return fibonacci_recursion(a - 1) + fibonacci_recursion(a - 2);
    }

    //memoization
    public static long[] m = new long[100];

    public static long fibonacci_memoization(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        if (m[a] != 0) {
            return m[a];
        }
        m[a] = fibonacci_memoization(a - 1) + fibonacci_memoization(a - 2);
        return m[a];
    }

    //loop
    public static long[] n = new long[100];

    public static long fibonacci_loop(int a) {
        n[1] = 1;
        n[2] = 1;

        for (int i = 3; i <= a; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }

        return n[a];
    }
}
