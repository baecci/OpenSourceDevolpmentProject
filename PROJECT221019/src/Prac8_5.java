import javax.swing.*;
import java.awt.*;

public class Prac8_5 extends JFrame{
    public Prac8_5() {
        setTitle("4X4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 4);
        grid.setVgap(1);
        Container c = getContentPane();

        c.setLayout(grid);
        for(int i = 0; i < 16; i++) {
            //버튼을 만들고
            JButton btn = new JButton(Integer.toString(i));
            //버튼에 색을 입혀
            btn.setBackground(new Color(100, 255 - 15 * i, 15 * i));
            //추가
            c.add(btn);
        }

        setSize(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac8_5();
    }
}
