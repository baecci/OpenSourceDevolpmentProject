import java.util.Scanner;
import java.util.Random;

public class UpDown {
    public static void main(String[] args) {
        // 랜덤으로 정답 초기화
        Random r = new Random();
        int rightAnswer = r.nextInt(100);

        System.out.println("수를 결정하였습니다. 맞춰보세요!");
        Scanner scanner = new Scanner(System.in);
        
        int answer = 0;  //사용자 답
        int tryNum = 0;  //시도횟수
        int min = 0;  //정답의 최소값
        int max = 99;  //정답의 최대값

        //이중반복문으로 게임시작
        while(true) {
            while (true) {
                tryNum++;
                System.out.println(min + "-" + max);
                System.out.print(tryNum + ">>");
                answer = scanner.nextInt();

                //정답이 더 높은 경우
                if (answer < rightAnswer) {
                    System.out.println("UP\n");
                    min = answer;
                }

                //정답이 더 낮은 경우
                if (answer > rightAnswer) {
                    System.out.println("Down\n");
                    max = answer;
                }

                //정답일 경우
                if (answer == rightAnswer) {
                    System.out.println("맞았습니다!\n");
                    tryNum = 0;
                    min = 0;
                    max = 99;
                    break;
                }
            }
            System.out.print("다시하시겠습니까?(y/n)>>");
            String re = scanner.next();
            if(re.equals("n")){
                break;
            }
        }
        scanner.close();
    }
}
