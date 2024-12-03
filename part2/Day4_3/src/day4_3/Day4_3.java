package day4_3;

import java.util.HashMap;

public class Day4_3 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("Java", 21);
        map.put("Python", 4);
        map.put("C", 23);
        map.putIfAbsent("Java", 17);

        System.out.println(map);
        System.out.println(map.containsKey("java"));
        System.out.println(map.containsValue(17));
        System.out.println(map.containsValue(23));
    }

}
