package day3_2;

import java.util.Arrays;
public class Day3_2 {

    private static int find(long d[], long num) {
        int L = 0, R = d.length, M;

        do {
            M = L + (R - L) / 2;
            System.out.println(L+" "+M+" "+R);
            if (d[M] == num) {
                return M;
            } 
            if (d[M] > num) {
                R = M-1;
            } 
            if (d[M] < num) {
                L = M+1;
            }
            System.out.println(L+" "+M+" "+R);
        } while (L <= R); 
        return -1;
    }

    private static void sortByCalculation(long d[]){
        //min-max
        long min=d[0], max=d[0];
        for(int i=1; i<d.length; i++) {
            if(d[i]>max) max = d[i];
            if(d[i]<min) min = d[i];
        }
//        System.out.println(min+" "+max);
        long size = max-min+1;
        int help[] = new int[(int)size];
        for(int i=0; i<d.length; i++) {
            help[(int)(d[i]-min)]++;
        }
        
        System.out.println(Arrays.toString(help));
        
        int j = 0;
        for(int i=0; i<help.length; i++) {
            int n = help[i];
            for(int k=0; k<n; k++, j++) {
                d[j] = min+i;
            }
        }
    }
    
    public static void main(String[] args) {
        long dat[] = {0, 3, 4, 5, 6, 7, 7, 8, 9, 6, 8, 5, 4, 6};

        System.out.println(Arrays.toString(dat));
        sortByCalculation(dat);
        System.out.println(Arrays.toString(dat));
        
        Arrays.sort(dat);
        int index = find(dat, 8);
        
        String el = index != -1 ? String.valueOf(dat[index]) : "";
        System.out.println(index+ " " + el);
    }

}
