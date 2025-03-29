package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image i2=i1.getImage().getScaledInstance(1070,650, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1070,650);
        add(image);


        setSize(1070,650);
        setLocation(175,50);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



        try {
            Thread.sleep(7000);
            setVisible(false);
            new Login();

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    public static void main(String[] args){
        new Splash();
    }
}

