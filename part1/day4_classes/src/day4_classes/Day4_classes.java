package day4_classes;

class Goods {

    int id;
    String title;
    double price;
    int weight;

    public Goods(int id) {
        this.id = id;
        this.weight = 1;
        this.title = "title";
        this.price = 10;
    }

    @Override
    public String toString() {
        return String.format("id=%d title=%s weight=%d price=%.3f", id, title, weight, price);
    }
}

public class Day4_classes {

    public static void main(String[] args) {
        Goods g1 = new Goods(121212);
        System.out.println(g1);
    }

}
