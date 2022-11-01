import javax.swing.*;
import java.awt.*;

class NorthArea extends JPanel {
    public NorthArea() {
        setBackground(Color.LIGHT_GRAY);
        setOpaque(true);
        setLayout(new FlowLayout());
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class CenterArea extends JPanel {
    public CenterArea() {
        setBackground(Color.white);
        setLayout(null);
        for(int i = 0; i < 10; i++) {
            JLabel label = new JLabel("*");
            int x = (int)(Math.random()*200) + 10;
            int y = (int)(Math.random()*200) + 10;
            label.setLocation(x, y);
            label.setSize(30, 30);
            setOpaque(true);

            add(label);
        }
    }
}

class SouthArea extends JPanel {
    public SouthArea() {
        setBackground(Color.YELLOW);
        setOpaque(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Word Input"));
        add(new JTextField(15));
    }
}
public class Prac8_8 extends JFrame{
    public Prac8_8() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

        Container c = getContentPane(); // 컨텐트팬은 디폴트로 BorderLayout 배치 관리자.

        c.add(new NorthArea(), BorderLayout.NORTH);
        c.add(new CenterArea(), BorderLayout.CENTER);
        c.add(new SouthArea(), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Prac8_8();
    }
}