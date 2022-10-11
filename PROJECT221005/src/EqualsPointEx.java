import lib.Point;

public class EqualsPointEx {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = new Point(3,4);

        if(a == b)
            System.out.println("a==b");
        if(a.equal(b))
            System.out.println("a is equal to b");
        if(a.equal(c))
            System.out.println("a is equal to c");
    }
}
