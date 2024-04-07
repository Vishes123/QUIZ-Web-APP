package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    login(){
        JLabel l1 = new JLabel("QUIZ TEsT");
        l1.setBounds(140,60,300,45);
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        l1.setForeground(new Color(22,99,54));
        add(l1);

        JLabel l2 = new JLabel("Enter Your Name");
        l2.setBounds(160,150,300,20);
        l2.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        l2.setForeground(new Color(22,99,54));
        add(l2);
        JTextField t1 = new JTextField();
        t1.setFont(new Font("Tahoma",Font.BOLD,17));
        t1.setBounds(80,200,300,25);
        add(t1);

        JButton b1 = new JButton("NEXT");
        b1.setBounds(100,270,120,25);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(22,99,54));
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    String name = t1.getText();
                    setVisible(false);
                    new Rules(name);
                }

            }
        });

        JButton b2 = new JButton("BACK");
        b2.setBounds(250,270,120,25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(22,99,54));
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    System.exit(550);

                }
            }
        });


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i =i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450,0,550,500);
        add(image);


        getContentPane().setBackground(Color.white);
        setUndecorated(true);
        setSize(1000,500);
        setLayout(null);
        setLocation(200,150);
        setVisible(true);

    }
    public static void main(String[] args) {
        new login();

    }
}
