package day1_lab1;

import java.util.Arrays;
import static java.lang.Math.*;

public class Day1_Lab1 {

    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        
        java.util.Date d2 = new java.util.Date(2024, 2, 29);
//        Date.era = 2;
        System.out.println(d2);
        
        Date d3 = new Date("2025-11-26");
//        d3.era = 3;
        System.out.println(d3);
        
        System.out.println(d3.incYear());
        
        Integer n1 = 127;
        Integer n2 = 127;
        System.out.println(n1==n2);
        
        java.util.Date dt = new java.util.Date();
        System.out.println(dt.toString());
        
        Arrays.sort(args);
        
        System.out.println(sin(1)*cos(1));
    }

}
