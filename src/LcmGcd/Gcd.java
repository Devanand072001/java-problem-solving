package LcmGcd;

import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = input(), b = input();

        System.out.println(a + " " + b);

        System.out.println("GCD: " + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static int input() {
        int n = 0;
        while (n == 0)
            n = new Random().nextInt(100);
        return n;
    }
}
