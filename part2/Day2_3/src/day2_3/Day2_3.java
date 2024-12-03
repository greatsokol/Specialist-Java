package day2_3;

import java.util.Arrays;

class Point implements Comparable<Point>{
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d y=%d", x, y);
    }

    @Override
    public int compareTo(Point o) {
       Point p = (Point)o;
       return this.x-p.x;
    }

}

public class Day2_3 {
    public static void main(String[] args) {
        Point dat[] = {new Point(7,3),new Point(2,1),new Point(4,2)};
        Arrays.sort(dat);
        for(var item: dat){
            System.out.println(item);
        }
    }
    
}
