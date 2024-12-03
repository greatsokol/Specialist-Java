package day5_3;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

class pred implements Predicate<Object> {

    @Override
    public boolean test(Object t) {
        return true;
    }
}

public class Day5_3 {

    public static List filter31(List list) {

        return List.of();
    }

    public static <T> Collection<T> anyFilter(Collection<? extends T> list, Predicate<T> filter) {
        List result = new LinkedList();
        for (var item : list) {
            if (filter.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList(List.of(4, 1, 2, 3, 45, 656, -767, 454, -11, 43));
        List<String> list2 = new LinkedList(List.of("Java", "C++", "Python", "Basic"));
        
        System.out.println(anyFilter(list1, t -> t > 0));
        System.out.println(anyFilter(list2, t -> t.length() > 4));
    }
}
