import java.awt.*;
import javax.swing.*;

class Challenge8 extends JFrame{
    Challenge8(){
        setTitle("Open Challenge8");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthArea(), BorderLayout.NORTH);
        c.add(new CenterArea(), BorderLayout.CENTER);
        setSize(400, 500);
        setVisible(true);
    }

    class NorthArea extends JPanel{
        NorthArea(){
            setBackground(Color.GRAY);
            setLayout(new FlowLayout());
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }

    class CenterArea extends JPanel{
        CenterArea(){
            String text[] = {"Hello", "Java", "Love"};
            setBackground(Color.lightGray);
            setLayout(null);
            int x, y;
            for(int i = 0; i < text.length; i++){
                x = (int)(Math.random()*350);
                y = (int)(Math.random()*450);
                JLabel label = new JLabel(text[i]);
                label.setSize(50, 10);
                label.setLocation(x, y);
                add(label);
            }
        }
    }

    public static void main(String args[]){
        new Challenge8();
    }
}
