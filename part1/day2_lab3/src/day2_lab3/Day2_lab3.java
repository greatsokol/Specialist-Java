package day2_lab3;

// Високосность
public class Day2_lab3 {

    private static boolean isLeap(int y) {
        return (y % 100 != 0 || y % 400 == 0) && (y % 4 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeap(2020));
        System.out.println(isLeap(2021));
        System.out.println(isLeap(2024));
    }
}
