package Dummy;

import java.awt.*;


import java.awt.event.*;
import javax.swing.*;


public class Button extends JFrame implements ActionListener {
    JButton button ;
    JLabel label;

    Button()
    {
        ImageIcon icon = new ImageIcon("logo.png");
        ImageIcon icon2 = new ImageIcon("logo.png");
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100,100,250,100);
        
        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("Power Of Simplicity");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));        
        button.setIconTextGap(-21);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.setResizable(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button)
        {
            // System.out.println("Power Of Simplicity");
            // button.setEnabled(false);
            label.setVisible(true);
        }
        
    }

    
}
