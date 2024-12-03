
public class Test {

    private int count = 0;

    public void add(int n) {
        count += n;
        System.out.println(count);
    }
    
    private void addPrivate(int n) {
        count += n;
        System.out.println(count);
    }
}
