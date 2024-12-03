package day1_lab2;

import java.util.Scanner;

public class Day1_lab2 {

    private static final char[] ALLOWED_OPS = {'-', '+', '*', '/'};

    private static double getIntFromKeyboard(Scanner keyboard) {
        System.out.print("Enter an double: ");
        return keyboard.nextDouble();
    }

    private static char getOpFromKeyboard(Scanner keyboard) {
        System.out.print("Enter operation: ");
        char ch = keyboard.next().charAt(0);
        if ((new String(ALLOWED_OPS).indexOf(ch)) == -1) {
            System.out.format("Wrong operation: '%s'. Please, retry.\n", ch);
            return getOpFromKeyboard(keyboard);
        }
        return ch;
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            double a = getIntFromKeyboard(keyboard);
            double b = getIntFromKeyboard(keyboard);
            char ch = getOpFromKeyboard(keyboard);

            double result = switch (ch) {
                case '-' ->
                    a - b;
                case '+' ->
                    a + b;
                case '*' ->
                    a * b;
                case '/' ->
                    a / b;
                default ->
                    Double.NaN;
            };

            if (result != Double.NaN) {
                System.out.format("result: %f\n", result);
            } else {
                System.out.println("Something's wrong");
            }
        }
    }
}
