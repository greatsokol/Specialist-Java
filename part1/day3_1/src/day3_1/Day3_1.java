package day3_1;

public class Day3_1 {

    private static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int max = arr[0];
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private static int whichMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 15, 16, 17, 8, 9, 0};
        System.out.println(max(data));
        System.out.println(whichMax(data));

    }
}
