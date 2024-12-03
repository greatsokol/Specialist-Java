package dev4_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Dev4_2 {

    public static <T extends Comparable<? super T>> T max2(T a, T b) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        System.out.println("max2 <>");
        return max;
    }

    public static double max2(double a, double b) {
        double max = a;
        if (b > max) {
            max = b;
        }
        System.out.println("max2 double");
        return max;
    }
    
    public static double sum(Collection col) {
        double sum = 0;
        for (var item : col) {
            sum += (int) item;
        }
        return sum;
    }

    public static double sumEx(Collection<?> col) {
        double sum = 0;
        for (var item : col) {
            sum += (int) item;
        }
        return sum;
    }

    public static void main(String[] args) {
        List dat = List.of(3, 5, 1, 9, -7);
        System.out.println(sumEx(dat));

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(sumEx(list1));

        System.out.println(sumEx(Arrays.asList(4, 1, 8, 5)));

        System.out.println(max2(2, 3));
        System.out.println(max2(2.3, 3));

    }

}
