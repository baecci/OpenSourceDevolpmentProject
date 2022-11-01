import javax.swing.*;
import java.awt.*;

public class Prac8_4 extends JFrame{
    public Prac8_4() {
        setTitle("Color Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);
        grid.setVgap(1);
        Container c = getContentPane();

        c.setLayout(grid);
        for(int i = 0; i < 10; i++) {
            //버튼을 만들고
            JButton btn = new JButton(Integer.toString(i));
            //버튼에 색을 입혀
            btn.setBackground(new Color(255, 255 - 20 * i, 20 * i));
            //추가
            c.add(btn);
        }

        setSize(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac8_4();
    }
}
