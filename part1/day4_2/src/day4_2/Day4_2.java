package day4_2;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Day4_2 {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("dfsdf sdfsdf sdf \n dsfs");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //------------------------------------------
        StringBuilder sb = new StringBuilder(250);
        sb.append("dgdfgd");
        //------------------------------------------
        String[] arr = {"java", "c++", "spring", "javascript"};
        Pattern p = Pattern.compile("^[a-j].+[+at]$");
        for (var item : arr) {
            if (p.matcher(item).matches()) {
                System.out.println(item);
            }
        }
        //------------------------------------------
        //System.out.println(args.length);

        int sum = 0;
        for (int i=0; i<args.length; i++) {
            String arg = args[i];
            System.out.printf("Argument #%d=%s\n", i, arg);
            try {
                sum += Integer.valueOf(arg);
            } catch (NumberFormatException ex) {
                System.out.printf("Can't convert: %s\n", arg);
            }
        }
        System.out.printf("Result sum=%d\n", sum);
    }

}
