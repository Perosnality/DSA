package JFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class MyFrame {
    MyFrame()
    {
        JFrame frame = new JFrame();
        
        frame.setTitle("Hello Sir");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        // frame.getContentPane().setBackground(Color.cyan);
        frame.getContentPane().setBackground(new ColorUIResource(0, 100, 100));;
        

    }
    
}
