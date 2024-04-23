package HRDatabaseofficial;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;


public class login {
    
    public boolean loginScreen()
    {
        SwingUtilities.invokeLater(() ->
        {
        JFrame frame = new JFrame("HRDatabase"); //frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);

        JLabel title = new JLabel("Login:");
        JTextField username = new JTextField("Username");
        JPasswordField password = new JPasswordField("Password");

        frame.add(title);
        frame.add(username);
        frame.add(password);
        frame.setVisible(true);

        //check user and password match
        //do all that stuff
        //if all works out, then return true and we are good to run the GUI application
        });

        return false;
    }
}
