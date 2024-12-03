package day4_1;

public class Day4_1 {

    public static void main(String[] args) {
        var prop = System.getProperties();

//        for (var item : prop.keySet()) {
//            System.out.println(item);
//        }
        for (var item : prop.entrySet()) {
            System.out.println(item);
        }

//        System.out.println(System.getProperty("os.name"));
        var env = System.getenv();
        for (var item : env.entrySet()) {
            System.out.println(item);
        }
    }

}
