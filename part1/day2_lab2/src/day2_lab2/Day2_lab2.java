package day2_lab2;

import java.util.Arrays;

// Факториал
public class Day2_lab2 {

    private static long getFactorial(int n) {
        int result = 1;
        try {
            for (int i = 1; i <= n; i++) {
                result = Math.multiplyExact(result, i);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return result;
    }

    private static long getFactorialRecursive(int n) {
        try {
            if (n <= 1) {
                return 1;
            } else {
                return Math.multiplyExact(n, getFactorialRecursive(n - 1));
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return 0;
    }

    private static int summa(int... args) {
        return Arrays.stream(args).sum();
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println(getFactorial(n));
        System.out.println(getFactorialRecursive(n));

        System.out.println(summa());
    }

}
