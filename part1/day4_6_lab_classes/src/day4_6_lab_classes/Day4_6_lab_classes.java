package day4_6_lab_classes;

//import java.util.Arrays;

class Point implements Comparable {
    private final int x;
    private final int y;
    private final String color;
    private final double distance;
    
    Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.distance = Math.sqrt(x*x + y*y);
    }
    
    public double distance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("x=%d y=%d distance=%f %s", x, y, distance, color);
    }

    public int compare(Point p) {
        if(distance > p.distance()) return 1;
        else if(distance < p.distance()) return -1;
        else return 0;
    }
    
    private static void swapPoints(Point[] points, int n, int m) {
        Point tmp = points[n];
        points[n] = points[m];
        points[m] = tmp;   
    }
    
    public static void sortPointsWithSelection(Point[] points) {
        int n = 0;
        for (int i=n; i<points.length; i++) {
            int min = n;
            for (int j=n; j<points.length; j++) {
                if(points[min].compare(points[j]) > 0) {
                    min = j;
                }
            }
            swapPoints(points, n, min);
            n++;
        }
    }
    
    public static void sortPointsWithBubble(Point[] points) {
        for(int k=1; k<points.length; k++)
            for(int i=0; i<points.length-1; i++)
                if(points[i].compare(points[i+1]) > 0) 
                    swapPoints(points, i, i+1);
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if(distance > p.distance()) return 1;
        else if(distance < p.distance()) return -1;
        else return 0;
    }
}
        
public class Day4_6_lab_classes {
    public static void main(String[] args) {
        Point[] points = {
            new Point(2,2,"red"),
            new Point(1,1,"black"),
            new Point(3,3,"white"),
            new Point(0,0,"yellow"),
        };
        
        System.out.println("points:");
        for (Point p: points) System.out.println(p);
        //Arrays.sort(points);
        //Point.sortPointsWithSelection(points);
        Point.sortPointsWithBubble(points);
        System.out.println("sorted:");
        for (Point p: points) System.out.println(p);
    }
    
}
