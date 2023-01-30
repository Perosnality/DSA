package JPanel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Image;


public class Main {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        
        
        
        ImageIcon image = new ImageIcon("logo.png");
        Image newImage = image.getImage().getScaledInstance(100, 120, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        label.setIcon(newIcon);
  
        
        
        
        
        
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);
        // redpanel.setLayout(new FlowLayout(FlowLayout.LEFT)); //align the image
        redpanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        redpanel.add(label, gbc);
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        redpanel.add(label);
        frame.setSize(750,750);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
    
}
