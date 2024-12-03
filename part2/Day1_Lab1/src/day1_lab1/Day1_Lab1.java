package day1_lab1;

public class Day1_Lab1 {

    public static void main(String[] args) {
        ComLineParser clp = new ComLineParser(new String[] {"?", "r", "w"});
        clp.parse(args);
    }
    
}
