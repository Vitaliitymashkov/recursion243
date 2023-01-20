package org.example.service;

public class Service {
    private static int i = 1;
    public static int go(int a, int b) {
        Integer counter = i;
        System.out.printf("Entering %s loop. a = %s; b = %s%n", counter, a, b);
        i++;
        if (b == 0) {
            System.out.printf("Exiting from loop %s. b == 0. returning 1 %n%n", counter);
            return 1;
        }
        int t = go(a, b / 2);
        System.out.printf("Assigning in loop %s. t = %s %n", counter, t);

        if (b % 2 != 0) {
            System.out.printf("Exiting from loop %s. b (%s) is not even. returning t*t*a (%s*%s*%s) = %s %n%n", counter, b, t, t, a, t*t*a);
            return t * t * a;
        } else {
            System.out.printf("Exiting from loop %s. b (%s) is even. returning t*t (%s*%s) = %s %n%n", counter, b, t, t, t*t);
            return t * t;
        }
    }
}
