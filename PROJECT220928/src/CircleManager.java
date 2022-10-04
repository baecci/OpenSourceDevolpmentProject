import java.util.Scanner;

class Circle6 {
    private double x, y;
    private int radius;
    public Circle6(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")"+ radius);
    }
    public int getRadius() {
        return radius;
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle6 c[] = new Circle6[3]; // 3개의 Circle 배열 선언
        int max=0;
        for(int i=0; i < c.length; i ++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble(); // x값 읽기.
            double y = scanner.nextDouble(); // y값 읽기.
            int radius = scanner.nextInt(); // radius값 읽기.
            c[i] = new Circle6(x, y, radius); // Circle 객체 생성
        }
        for(int i=0; i<c.length; i++)
            if(max < c[i].getRadius())
                max = c[i].getRadius();
        for(int i=0; i<c.length; i++)
            if(max == c[i].getRadius()) {
                System.out.print("가장 면적인 큰 원은 ");
                c[i].show();
            }
        scanner.close();
    }
}
