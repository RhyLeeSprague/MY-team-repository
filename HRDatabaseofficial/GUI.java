package HRDatabaseofficial;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.DefaultListSelectionModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class GUI extends JFrame {

    public ArrayList<Demographics> userList;

    public void frame() {
        SwingUtilities.invokeLater(() -> {
            // objects
            demographicsPanel demo = new demographicsPanel();
            ListMaker lm = new ListMaker();
            GUIhelper gui = new GUIhelper();
            login find = new login();

            // makes the list
            userList = lm.makeAList();

            // Creates the frame
            JFrame frame = new JFrame("HRDatabase"); // frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 500);
            frame.setLayout(new BorderLayout(10, 10));

            JPanel userPanel = new JPanel();
            { // panel in frame
                userPanel.setLayout(new FlowLayout());
                userPanel.setPreferredSize(getPreferredSize()); // auto sets size

                // WELCOME "THEIR NAME"
                JLabel customName = new JLabel("Welcome Joe Schmoe!");
                // perhaps find a way to make the login name dynamic??
                userPanel.add(customName);

                // Log Out Button
                JButton logOutButton = new JButton("Log Out");
                logOutButton.setFocusable(false); // makes button prettier so cant focus on text
                logOutButton.setFont(new Font("Times New Roman", Font.BOLD, 18)); // sets font for Label

                logOutButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose(); // closes the gui screen
                        find.loginScreen(); // opens the login screen
                    }
                });
                userPanel.add(logOutButton);

                // User List Label
                JLabel label = new JLabel("User List:");
                label.setBounds(getBounds()); // auto sets bounds
                label.setBackground(Color.CYAN); // blue :)
                label.setOpaque(true); // makes sure you can see the color
                userPanel.add(label); // adds it

                // converts list to a String array
                String[] info = gui.getNames(userList); // converts to something we can use

                // New List
                DefaultListModel listModel = new DefaultListModel();

                for (int i = 0; i < info.length; i++) {
                    listModel.addElement(info[i]);
                }

                JList users = new JList(listModel);
                users.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION); // you can only select one person at
                                                                                    // a time
                users.setLayoutOrientation(JList.VERTICAL); // vertical list
                users.setVisibleRowCount(10);

                users.addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        String val = (String) users.getSelectedValue();
                        Demographics person = gui.returnObject(val, userList);
                        demo.demoFrame(person);
                    }
                });
                userPanel.add(users, BorderLayout.CENTER); // adds list to panel and center

                // Add User Button
                JButton addButton = new JButton("Add User");
                addButton.setFocusable(false); // makes button prettier so cant focus on text
                addButton.setFont(new Font("Times New Roman", Font.BOLD, 18)); // sets font for Label

                addButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ArrayList<Demographics> tempList = demo.addFrame(userList); // opens add user screen
                        lm.setList(tempList);
                        String[] info = gui.convertObjectArray(tempList);

                        listModel.addElement(info[2]);
                    }
                });
                userPanel.add(addButton);
            }

            frame.getContentPane().add(userPanel); // adds panel
            frame.setVisible(true);

        });
    }
}