package HRDatabaseofficial;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame
{
    public boolean loginScreen()
    {
        Person people = new Person();
        Demographics person1 = new Demographics();
        GUI find = new GUI();
        SwingUtilities.invokeLater(() ->
        {
        JFrame Lframe = new JFrame("HRDatabase"); //frame
        Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lframe.setSize(1000, 500);
        Lframe.setLayout(new BorderLayout(10,10));
        Lframe.setLocationRelativeTo(null);
        //logo

        JPanel panel = new JPanel();
        {
            panel.setLayout(new FlowLayout());
            panel.setPreferredSize(getPreferredSize()); //auto sets size
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("Login:");
        panel.add(title);
        title.setFont(new Font("Times New Roman", Font.BOLD, 18)); //sets font for Label

        
        JTextField username = new JTextField("Email",10);
        panel.add(username);

        JPasswordField password = new JPasswordField("Password",10);
            panel.add(password);
        
        JButton loginButton = new JButton("Login");
            panel.add(loginButton); 
            loginButton.setFocusable(false); //makes button prettier so cant focus on text
            title.setFont(new Font("Times New Roman", Font.BOLD, 18)); //sets font for Label

            loginButton.addActionListener(new ActionListener() 
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        //Needs the proper call for the arrayList found in either GUI 
                        //or Demographcis than good to go
                        //people.logIn(person1.getEmailAddress(), person1.getPassword(), find.userList());
                        Lframe.dispose();
                        find.frame();
                    }
                });
        }

        Lframe.add(panel);
        Lframe.setVisible(true);
        });

        return false;
    }
}
