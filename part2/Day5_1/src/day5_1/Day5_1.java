package day5_1;

//class Point {
//
//    private final int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public String toString() {
//        return x + ":" + y;
//    }
//}

record Point(int x, int y) {}

public class Day5_1 {
    
    public static int test(Object o) {
        return switch(o) {
            case null -> 0;
            case Point p -> 7;
            default -> 99;
        };
    }    
    
    public static void main(String[] args) {
        
        Point p1 = new Point(1, 2);
        System.out.println(p1);
        
        System.out.println(test(null));
        System.out.println(test("abc"));
        System.out.println(test(p1));
    }

}
