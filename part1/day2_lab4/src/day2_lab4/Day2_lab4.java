package day2_lab4;


public class Day2_lab4 {


    private static boolean isPrimeNumberSlow(long n) {
        for (long i=2; i<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    private static boolean isPrimeNumberFast(long n) {
        for (long i=2; Math.multiplyExact(i,i)<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        //System.out.println(isPrimeNumberSlow(101));
        //System.out.println(isPrimeNumberSlow(1001));
        long t1 = System.currentTimeMillis();
        System.out.println(isPrimeNumberSlow(2147483647));
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        
        t1 = System.currentTimeMillis();
        System.out.println(isPrimeNumberFast(2147483647));
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
