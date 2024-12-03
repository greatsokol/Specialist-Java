package day3_1;

import java.lang.reflect.InvocationTargetException;


public class Day3_1 {

    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            IllegalArgumentException,
            InvocationTargetException {

        Class info = Class.forName("Test");
        Object obj = info.getConstructor().newInstance();
        var method = info.getMethod("add", int.class);
        method.invoke(obj, 10);
        method.invoke(obj, 10);
        method.invoke(obj, 10);
        
        var methodPriv = info.getDeclaredMethod("addPrivate", int.class);
        methodPriv.setAccessible(true);
        methodPriv.invoke(obj, 70);
    }

}
