/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day2_3_annot;

/**
 *
 * @author Administrator
 */
public class Day2_3_annot {

    @Developer(fname = "test", type = "type", data = "55", version = "1.0")
    public static class Test implements Comparable<Test>{

        @Override
        public int compareTo(Test o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    public static void main(String[] args) throws ClassNotFoundException {
        Test test = new Test();
        
        Class clazz1 = test.getClass();
        Class clazz2 = Class.forName("day2_3_annot.Day2_3_annot$Test");
        Class clazz3 = Test.class;
        
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        
        for (var interfaze : clazz1.getInterfaces()) {
            System.out.println(interfaze);
        }

        for (var methodz : clazz1.getMethods()) {
            System.out.println(methodz);
        }        
    }

}
