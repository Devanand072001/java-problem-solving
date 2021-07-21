package LcmGcd;

import javax.swing.*;
import java.util.Random;

public class Lcm {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = input(100), b = input(100);

        System.out.println(a + " " + b);

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
        // return a*b / gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static int input(int limit) {
        int n = 0;
        while (n == 0)
            n = new Random().nextInt(limit + 1);
        return n;
    }
}
