package Dummy;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class Main {
    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JFrame");
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setSize(500,250);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        // frame.getContentPane().setBackground(Color.red);
        frame.getContentPane().setBackground(new ColorUIResource(250,150,250));
        
    }
    
}
