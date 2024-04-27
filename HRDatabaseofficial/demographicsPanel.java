package HRDatabaseofficial;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.util.ArrayList;


public class demographicsPanel
{
    public void demoFrame(Demographics obj)
    {
        JFrame dFrame = new JFrame("HRDatabase"); //frame
            dFrame.setSize(1000, 500);
            dFrame.setLayout(new BorderLayout(10,10));
    

        dFrame.setVisible(true);
    }

    public ArrayList<Demographics> addFrame(Demographics obj, ArrayList<Demographics> userList)
    {
        JFrame aFrame = new JFrame("HRDatabase"); //frame
            aFrame.setSize(1000, 500);
            aFrame.setLayout(new BorderLayout(10,10));
 
            SwingUtilities.invokeLater(() ->
            {
                JPanel aPanel = new JPanel();
                {
                    aPanel.setLayout(new FlowLayout());
                    aPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                    String[] todo = new String[]{"Name", "Email", "Address", "Emergency Contact", "Emergency Contact #"};
                    for (String s: todo)
                    {
                        JLabel label = new JLabel(s);
                        aPanel.add(label);

                        JTextField textField = new JTextField(10);
                        aPanel.add(textField);

                        textField.addActionListener(new ActionListener() 
                        {  @Override

                        public void actionPerformed(ActionEvent e)
                        {
                            String input = textField.getText();
                            switch(s)
                            {
                        case("Name"):
                            obj.setFirstAndLastName(input);
                            System.out.println(obj.getFirstAndLastName()); //test
                            break;

                        case("Email"):
                            obj.setEmailAddress(input);
                            break;

                        case("Address"):
                            obj.setEmailAddress(input);
                            break;

                        case("Emergency Contact"):
                            obj.setEmergencyContactName(input);
                            break;
                        
                        case("Emergency Contact #"):
                            obj.setEmergencyContactNum(input);
                            break;
                            }
                        }
                        });
                        }

                JButton eval = new JButton("Add Eval");
                eval.setFocusable(false); //makes button prettier so cant focus on text
                eval.setFont(new Font("Times New Roman", Font.BOLD, 18)); //sets font for Label
                aPanel.add(eval);

                JButton jobHist = new JButton("Add Job History");
                jobHist.setFocusable(false); //makes button prettier so cant focus on text
                jobHist.setFont(new Font("Times New Roman", Font.BOLD, 18)); //sets font for Label
                aPanel.add(jobHist);

                JButton skills = new JButton("Add Skills");
                skills.setFocusable(false); //makes button prettier so cant focus on text
                skills.setFont(new Font("Times New Roman", Font.BOLD, 18)); //sets font for Label
                aPanel.add(skills);

                //commit button very important
                JButton commit = new JButton("Commit");
                commit.setFocusable(false); //makes button prettier so cant focus on text
                commit.setFont(new Font("Times New Roman", Font.BOLD, 18)); //sets font for Label
                commit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        userList.add(obj);
                        aFrame.dispose();
                    }
                });
                aPanel.add(commit);

            aFrame.setVisible(true);
        }
        aFrame.getContentPane().add(aPanel); //adds panel
    });
        return userList;
    }
}