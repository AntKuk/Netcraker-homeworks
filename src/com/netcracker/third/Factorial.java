package com.netcracker.third;

public class Factorial {
    static {
        System.out.println();
        System.out.println("tasks for factorial");
        System.out.println();
    }

    public long loopFactor(int n) {
        long result = 1;

        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            n = - n;
        }

        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public long recFactor(int n) {
        if(n == 0 | n == 1) {
            return 1;
        }

        else {
            return n * recFactor(n - 1);
        }

    }


}
