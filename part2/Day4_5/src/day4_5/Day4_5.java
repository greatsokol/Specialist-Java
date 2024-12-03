package day4_5;

class Upper {

    private int num = 5;

    public Upper() { // outer this here
        Inner inner = new Inner();
        inner.count = 10;
        inner.print();
        System.out.println("upper count "+inner.count);
        System.out.println("upper inner num "+this.num);
    }

    class Inner { // inner this here
        static double std = 100f;
        private int count = 3;

        private void print() {
            System.out.println("inner num "+Upper.this.num);
            System.out.println("inner count "+this.count);
        }
        
        void publicPrint() {
            print();
        }
    }
}

public class Day4_5 {

    public static void main(String[] args) {
        Upper upper = new Upper();
        //Upper.Inner inner = new Upper.Inner();
        Upper.Inner inner = upper.new Inner();
        inner.publicPrint();
    }

}
