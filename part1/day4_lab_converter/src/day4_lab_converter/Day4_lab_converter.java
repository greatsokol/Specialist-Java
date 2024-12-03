package day4_lab_converter;

public class Day4_lab_converter {

    private static String getBinary(int num){
        StringBuilder sb = new StringBuilder(64);
        
        for (int i=0; i<32; i++) {
            int b = num & 1;
            sb.append(b);
            if(i==7 || i==15 || i==23) 
                sb.append(" ");
            num >>>= 1;
        }        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(getBinary(1));
        System.out.println(getBinary(2));
        System.out.println(getBinary(4));
        System.out.println(getBinary(8));
        System.out.println(getBinary(16));
        System.out.println(getBinary(32));
        System.out.println(getBinary(64));
        System.out.println(getBinary(128));
        System.out.println(getBinary(256));
        System.out.println(getBinary(512));
        System.out.println(getBinary(1024));
        System.out.println(getBinary(-1024));
        System.out.println(getBinary(2147483647)+" "+Integer.toBinaryString(2147483647));
        System.out.println(getBinary(-2147483647)+" "+Integer.toBinaryString(-2147483647));
    }
    
}
