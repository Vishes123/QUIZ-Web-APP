package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame {
    String name;
    Rules(String name){
        this.name=name;
        JLabel l1 = new JLabel("Welcome "+name+" to  QUIZ TEST");
        l1.setBounds(150,100,700,30);
        l1.setFont(new Font("System",Font.BOLD,28));
        l1.setForeground(new Color(22,99,54));
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setBounds(70,150,700,350);
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setForeground(new Color(22,99,54));
        l2.setText(

                "<html>"+
                        "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                        "2. There are a total 10 questions. " + "<br><br>" +
                        "3. You only have 15 seconds to answer the question." + "<br><br>" +
                        "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                        "5. No talking." + "<br><br>" +
                        "6. No one else can be in the room with you." + "<br><br>" +
                        "<html>"
        );
        add(l2);

        JButton b1 = new JButton("START");
        b1.setBounds(300,500,100,30);
        b1.setBackground(new Color(22,99,54));
        b1.setForeground(Color.white);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    setVisible(false);
                    new New_Quiz(name);
                }

            }
        });

        JButton b2 = new JButton("BACK");
        b2.setBounds(450,500,100,30);
        b2.setBackground(new Color(22,99,54));
        b2.setForeground(Color.white);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    new login();
                    setVisible(false);
                }

            }
        });

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i =i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);

        setSize(800,650);
        setUndecorated(true);
        setLocation(320,50);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Rules("User");

    }
}
