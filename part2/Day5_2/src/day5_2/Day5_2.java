package day5_2;

import java.io.File;
import java.io.FilenameFilter;

public class Day5_2 {

    //public static double f(double x) -> x*x -1; not working
    
    public static void main(String[] args) {
//        File dir = new File(".");
//        if(dir.exists()) {
//            String[] files = dir.list();
//            for(String file : files) {
//                System.out.println(file);
//            }
//        }

//        File dir = new File(".");
//        if(dir.exists()) {
//            String[] files = dir.list(new FilenameFilter() { // anonymous class
//                @Override
//                public boolean accept(File folder, String name) {
//                    return new File(name).isFile();
//                    //return name.contains(".xml");
//                }
//            });
//            
//            for(String file : files) {
//                System.out.println(file);
//            }
//        }

//        File dir = new File(".");
//        if (dir.exists()) {
//            String[] files = dir.list((folder, name) -> new File(name).isFile()); // lambda
//            for (String file : files) {
//                System.out.println(file);
//            }
//        }
        
        File dir = new File(".");
        if (dir.exists()) {
            String[] files = dir.list(Day5_2::test); // link on static method
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
    
    public static boolean test(File f, String s) {
        return s.startsWith("b");
    }

}
