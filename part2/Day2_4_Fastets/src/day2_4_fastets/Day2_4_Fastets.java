package day2_4_fastets;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Best {

}

class Math24 {

    public static int f1() {
        return 1;
    }

    public static int f2() {
        return 2;
    }

    @Best
    public static int f3() {
        return 3;
    }

    public static int f4() {
        return 4;
    }

    public int fff() {
        return 111;
    }

    public final Method getFastestMethod() {
        for (Method method : getClass().getMethods()) {
            if (method.isAnnotationPresent(Best.class)) { //getAnnotation(Best.class) != null
                return method;
            }
        }
        return null;
    }
}

public class Day2_4_Fastets {

    public static void main(String[] args) throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException {

        Math24 math24 = new Math24();
        Method method = math24.getFastestMethod();
        if (method != null) {
            System.out.println(method.invoke(math24));
        }

    }
}
