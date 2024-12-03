package day3_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Day3_2 {

    static void save(double[] dat, String fileName) {
        try (var out = new DataOutputStream(new FileOutputStream(fileName))) {
            out.writeInt(dat.length);
            for (double d : dat) {
                out.writeDouble(d);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void loadAndPrint(String fileName) {
        try (var in = new DataInputStream(new FileInputStream(fileName))) {
            int length = in.readInt();
            for (int i = 0; i < length; i++) {
                Double d = in.readDouble();
                System.out.println(d);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static double[] load(String fileName) throws IOException {
        try (var in = new DataInputStream(new FileInputStream(fileName))) {
            int len = in.readInt();
            double[] doubles = new double[len];
            for (int i = 0; i < len; i++) {
                doubles[i] = in.readDouble();
            }
            return doubles;
        }
    }

    public static void main(String[] args) throws IOException {
        double[] dat = {3, 1, 2, 5.07};
        save(dat, "data.txt");
        //loadAndPrint("data.txt");

        double[] doubles = load("data.txt");
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }

}
