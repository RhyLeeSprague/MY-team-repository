package HRDatabaseofficial;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame
{
    public void frame() 
    {
        SwingUtilities.invokeLater(() -> 
        {
            demographicsPanel demo = new demographicsPanel();
            //GUIhelper gui = new GUIhelper();
            /*
            ArrayList list = new ArrayList(); //temp
            for(int i=1; i<11; i++) //temp
            { 
                String name = "name ";  //temp
                list.add(name + i);  //temp
            }
            */

            JFrame frame = new JFrame("HRDatabase"); //frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 500);
            frame.setLayout(getLayout());

            JPanel userPanel = new JPanel();{ //panel in frame
                userPanel.setPreferredSize(getPreferredSize()); //auto sets size

                JLabel label = new JLabel("User List:");
                label.setBounds(getBounds()); //auto sets bounds
                label.setBackground(Color.CYAN); //blue :)
                label.setOpaque(true); //makes sure you can see the color
                userPanel.add(label); //adds it

               //String[] info = gui.convertObjectArray(list); //temp to a temp

               /*TEMP*/ String[] temp = new String[] {"one", "two", "three"};

               JComboBox<String> users = new JComboBox<>(/*TEMP*/ temp); //drop down box
               userPanel.add(users, BorderLayout.CENTER); //adds dropdown box to panel and center

                ActionListener action = new ActionListener() 
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        String selected = (String) users.getSelectedItem(); //get the selected item
                        // demo.frame(selected);
                    }
                };
            }

            frame.getContentPane().add(userPanel); //adds panel
            frame.pack(); //resizes the panel

            frame.setVisible(true);
        });
    }
}   
