package day2_1;

public class Day2_1 {

    public static void main(String[] args) {
//        System.out.println(~24);
//        System.out.println(8 << 2);
//        System.out.println(-16 >> 2);
//        System.out.println(-16 >>> 2);

        int counter = 1;
        int num = -25;
        int template = 1;
        while (counter<=32) {
            int res = (num & template) > 0 ? 1 : 0;
            System.out.println(
                    ///counter + '-' +
                    Integer.toBinaryString(num) + ' '
                    + Integer.toBinaryString(template) + ' '
                    + res
            );
            template <<= 1;
            counter++;
        }
    }
}
