package day1_lab1;

import java.util.Scanner;

public class Day1_lab1 {

    private static int getIntFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return keyboard.nextInt();
    }

    public static void main(String[] args) {
        int a = getIntFromKeyboard();
        int b = getIntFromKeyboard();
        int c = getIntFromKeyboard();

        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        System.out.format("Max value: %d\n", max);
    }
}
