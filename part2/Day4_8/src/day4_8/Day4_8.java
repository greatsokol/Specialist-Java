package day4_8;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

record Point(int x, int y){}

public class Day4_8 {

    public static void main(String[] args) {
        System.out.println(Day.values());
        Class info = Day.class;
        System.out.println(info.getSuperclass().getName());
        System.out.println(info.isAnonymousClass());
        
        Point pp = new Point(1,2);
        System.out.println(pp.x());
        
        
    }

}
