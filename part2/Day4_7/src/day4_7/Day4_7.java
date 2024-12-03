package day4_7;

import java.util.AbstractList;

public class Day4_7 {

    public static void main(String[] args) {
        var obj = new AbstractList<Object>() {
            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
    
}
