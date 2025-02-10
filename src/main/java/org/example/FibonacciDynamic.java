package org.example;

import java.util.HashMap;
import java.util.Map;

class FibonacciDynamic {
    private static final Map<Integer, Long> app_memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        if(app_memo.containsKey(n)){
            return app_memo.get(n);
        }
        app_memo.put(n, fibonacci(n-1) + fibonacci(n-2));
        return app_memo.get(n);
    }
}
