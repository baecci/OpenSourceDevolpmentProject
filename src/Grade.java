import java.util.Scanner;

public class Grade {
    //private 필드
    private int math;
    private int science;
    private int english;

    //인자있는 생성자
    public Grade(int m, int s, int e){
        math = m;
        science = s;
        english = e;
    }

    //평균 구하는 메소드
    public float average(){
        return (float)(math + science + english) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}
