package day5_4;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class Day5_4 {

    public static int mean(Collection<String> coll, Function<String, Integer> f) {
        int res = 0;
        for(var item : coll) res += f.apply(item);
        return res;
    }
    
    public static void main(String[] args) {
        List<String> list2 = new LinkedList(List.of("Java", "C++", "Python", "Basic"));
        System.out.println(mean(list2, t -> t.length()));
        var res = list2.stream().mapToInt(s -> s.length());
        list2.add("Scala"); 
        var len = res.reduce((acc, i) -> acc+i); // lazy evaluation
        System.out.println(len);
        
        //list2.add("Scala");
        //var len2 = res.reduce((acc, i) -> acc+i); // exception here
        //System.out.println(len2);
        
        System.out.println(list2.stream().mapToInt(s -> s.length()).sum());
    }
    
}
