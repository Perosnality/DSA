package Dummy;

import javax.swing.*;
import java.awt.*;

public class LayeredMain {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.red);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.red);
        label3.setBounds(150,150,200,200);
        
        JLayeredPane layerpane = new JLayeredPane();
        layerpane.setBounds(0,0,500,500);
        layerpane.add(label1, Integer.valueOf(0));
        layerpane.add(label2, Integer.valueOf(2));
        layerpane.add(label3, Integer.valueOf(1));
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layerpane);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
