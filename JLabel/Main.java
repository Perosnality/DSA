package JLabel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new  ImageIcon("logo.png");

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        label.setText("My name is Prabin"); 
        label.setVerticalAlignment(JLabel.TOP);
        Image newImage = image.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        label.setIcon(newIcon);
        // label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new FontUIResource("Serif",Font.PLAIN,50));
        label.setIconTextGap(-25);
        try{
            label.setForeground(Color.green);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.add(label);
        frame.setIconImage(image.getImage());
    }
}

