/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day4_lab_files;

import java.awt.BorderLayout;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Administrator
 */
public class Day4_lab_files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        Path r1 = Paths.get(".");
//        System.out.println(r1.toAbsolutePath());
//        System.out.println(Files.exists(r1));
//        System.out.println(Files.isDirectory(r1));

//        Path r2 = Paths.get("name.txt");
//        System.out.println(r2.toAbsolutePath());
//        System.out.println(Files.exists(r2));
//        System.out.println(Files.isDirectory(r2));
//        
//        Charset cs = Charset.forName("cp1251");
//        var list = Files.readAllLines(r2);
//        System.out.println(list);
//        
//        list = Files.readAllLines(r2, cs);
//        System.out.println(list);
        Charset cs1 = Charset.forName("UTF-16LE");
        Path r1 = Paths.get("doc.txt");
        var list1 = Files.readAllLines(r1, cs1);
        for (var s : list1) {
            System.out.println(s);
        }

        Charset cs2 = Charset.forName("UTF-16BE");
        Path r2 = Paths.get("doc2.txt");
        var list2 = Files.readAllLines(r2, cs2);
        for (var s : list2) {
            System.out.println(s);
        }

    }

}
