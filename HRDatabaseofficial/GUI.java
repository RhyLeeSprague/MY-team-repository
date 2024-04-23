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
            Demographics person = new Demographics();
            demographicsPanel demo = new demographicsPanel();
            GUIhelper gui = new GUIhelper();
            login find = new login();
                    

            JFrame frame = new JFrame("HRDatabase"); //frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 500);
            frame.setLayout(getLayout());

            JPanel userPanel = new JPanel();{ //panel in frame
                userPanel.setPreferredSize(getPreferredSize()); //auto sets size

                // WELCOME "THEIR NAME"
                JLabel customName = new JLabel("Welcome ");
                userPanel.add(customName);

                // clock in and out button
                
                JButton logOutButton = new JButton("Log Out");

                logOutButton.addActionListener(new ActionListener() 
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        frame.dispose(); //closes the gui screen
                        find.loginScreen(); //opens the login screen
                    }
                });
                userPanel.add(logOutButton);

                JLabel label = new JLabel("User List:");
                label.setBounds(getBounds()); //auto sets bounds
                label.setBackground(Color.CYAN); //blue :)
                label.setOpaque(true); //makes sure you can see the color
                userPanel.add(label); //adds it

               String[] info = gui.convertObjectArray(person.getList()); //temp to a temp

               JComboBox<String> users = new JComboBox<>(info); //drop down box
               userPanel.add(users, BorderLayout.CENTER); //adds dropdown box to panel and center

                users.addActionListener(new ActionListener() 
                {
                            public void actionPerformed(ActionEvent e)
                            {
                            String selected = (String) users.getSelectedItem(); //get the selected item
                            Demographics obj = gui.returnObject(selected, person.getList()); //finds the object it's at
                            demo.frame(obj); //calls the demo frame
                            }
                });
            }

            frame.getContentPane().add(userPanel); //adds panel
            frame.setVisible(true);
        });
    }
}   
