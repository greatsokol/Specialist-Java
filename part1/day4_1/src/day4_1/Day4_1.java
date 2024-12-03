package day4_1;

public class Day4_1 {
    
    static int countOfSpaces(String str) {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                n++;
            }
        }
        return n;
    }
    
    public static void main(String[] args) {
        String s1 = "C++";
        System.out.println(countOfSpaces("dfds fsd\t\t dfs \nfsdf"));
    }
    
}
