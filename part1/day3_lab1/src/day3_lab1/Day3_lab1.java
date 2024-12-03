package day3_lab1;

public class Day3_lab1 {

    public static void main(String[] args) {
        int year = 2024, dayNum = 318, monthNum = 1;
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int days : daysInMonth) {
            if (dayNum > days) {
                dayNum -= days;
                monthNum++;
            } else {
                break;
            }
        }

        System.out.printf("%d %d\n", monthNum, dayNum);
    }

}
