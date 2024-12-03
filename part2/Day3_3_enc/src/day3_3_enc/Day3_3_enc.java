package day3_3_enc;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;

public class Day3_3_enc {
    static class Goods implements Serializable{
        static final long serialVersionUID=1;
        
        int id;
        String title;
        Date date;
        double[] dim;
        boolean inStock;

        public Goods(int id, String title, double[] dim, boolean inStock) {
            this.id = id;
            this.title = title;
            this.date = new Date();
            this.dim = dim;
            this.inStock = inStock;
        }
        
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //--------------------------------------------------------------------
        String fileName = "unicode.txt";
        Charset cs = Charset.forName("utf-16");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName, cs))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }

        //--------------------------------------------------------------------
        String fileName2 = "ascii.txt";
        Charset cs2 = Charset.forName("cp1251");
        try (BufferedReader br2 = new BufferedReader(new FileReader(fileName2, cs2))) {
            String s2;
            while ((s2 = br2.readLine()) != null) {
                System.out.println(s2);
            }
        }

        //--------------------------------------------------------------------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            oos.writeObject(new Goods(1, "Vesch", new double[] {1,2,3}, true));
        }
        
        //--------------------------------------------------------------------
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))) {
            var obj = (Goods)ois.readObject();
            System.out.println(obj.id);
            System.out.println(obj.title);
            System.out.println(obj.date);
        }
    }

}
