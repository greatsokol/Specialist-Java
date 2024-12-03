package day1_2;

public class Day1_2 {

    public static void main(String[] args) {
        System.out.println(7 >= 7.0);
        System.out.println(true != false);
        int n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        int n = 3;

        if (n == 2) {
            n2++;
        } else if (n == 3) {
            n3++;
        } else if (n == 4) {
            n4++;
        } else if (n == 5) {
            n5++;
        }

        System.out.println(n3);

        int a = 10, b = 15;
        int max = a > b ? a : b;

        n = 8;
        switch (n) {
            case 1, 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Not bad");
                break;
            case 4, 5:
                System.out.println("Good");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
