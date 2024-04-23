package HRDatabaseofficial;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Container;
import javax.swing.JLabel;


public class demographicsPanel
{
    public void frame(Demographics obj)
    {
        
        String demo = obj.toString();

        JFrame theFrame = new JFrame("HRDatabase"); //frame
        theFrame.setSize(1000, 500);

        JLabel label = new JLabel(demo); //test

        theFrame.add(label); 
        theFrame.setVisible(true);
    }
}