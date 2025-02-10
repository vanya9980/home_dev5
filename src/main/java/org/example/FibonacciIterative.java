package org.example;

class FibonacciIterative {
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        long prev = 0;
        long curr = 1;

        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
