package day4_6;

class Upper {

    private final int num = 5;

    public Upper() { // here only this
        Inner inner = new Inner(this);
        inner.count = 10;
        inner.print();
        System.out.println("upper count "+inner.count);
        System.out.println("upper inner num "+this.num);
    }

    private static class Inner { // << implementation like in C, C#
        private int count = 3;
        private final Upper obj;

        public Inner(Upper obj) {
            this.obj = obj;
        }
        
        private void print() {
            System.out.println("inner num "+ obj.num);
            System.out.println("inner count "+this.count);
        }
    }
}

public class Day4_6 {

    public static void main(String[] args) {
        Upper upper = new Upper();
    }

}
