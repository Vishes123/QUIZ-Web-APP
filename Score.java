package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score  extends JFrame {
    Score(String name, int score){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i =i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(60,200,200,150);
        add(image);

        JLabel h = new JLabel("ThankYou "  +name+  "  Playing QUIZ Test");
        h.setBounds(100,80,700,30);
        h.setFont(new Font("Tahoma", Font.BOLD,25));
        add(h);

        JLabel Score = new JLabel(name+   " your Score is"   +score);
        Score.setBounds(350,200,300,30);
        Score.setFont(new Font("Tahoma", Font.BOLD,25));
        add(Score);

        JButton Ex = new JButton("EXIT");
        Ex.setBounds(380,270,120,30);
        Ex.setBackground(new Color(22,99,54));
        Ex.setForeground(Color.white);
        add(Ex);
        Ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==Ex){
                    setVisible(false);
                    new login();
                }
            }
        });

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i0 =i10.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon i20 = new ImageIcon(i0);
        JLabel image1 = new JLabel(i20);
        image1.setBounds(0,00,750,550);
        add(image1);

        setSize(750,550);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Score("User",0);

    }
}
