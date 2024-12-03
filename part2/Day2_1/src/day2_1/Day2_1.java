package day2_1;

import java.awt.Color;

public class Day2_1 {
    private static double fullArea(Shape ... shapes) {
        double s = 0;
        for(var item: shapes) {
          s += item.area();
        }
        return s;
    }

    
    public static void main(String[] args) {
        Rect rect = new Rect(20000000, 20000000, 1, 2, Color.BLUE);
        rect.print();
        rect.move(10, 10).move(5, 5);
        rect.print();
        
        Circle cr = new Circle(10, 10, 100);
        cr.move(10, 10);
        cr.print();

        System.out.println(fullArea(rect, cr));
    }
    
}
