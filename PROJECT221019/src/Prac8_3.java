import javax.swing.*;
import java.awt.*;

public class Prac8_3 extends JFrame{
    public Prac8_3() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);
        grid.setVgap(1);
        Container c = getContentPane();

        c.setLayout(grid);
        for(int i = 0; i < 10; i++) {
            //버튼의 내용은 toString 메서드로 i를 문자열로 바꾸어 입력
            c.add(new JButton(Integer.toString(i)));
        }

        setSize(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac8_3();
    }
}
