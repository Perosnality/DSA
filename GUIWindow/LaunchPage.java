package GUIWindow;

import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    LaunchPage()
    {
        button.setBounds(100,160,200,40);
        button.setFocusable(true);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()== button)
        {
            NewWindow newwindow = new NewWindow();
            frame.dispose();
        }

        
    }
    
}
