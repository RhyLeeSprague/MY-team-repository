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
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class demographicsPanel {
    public void demoFrame(Demographics obj) {
        JFrame dFrame = new JFrame("HRDatabase"); // frame
        dFrame.setSize(1000, 500);
        dFrame.setLayout(new BorderLayout(10, 10));

        dFrame.setVisible(true);
    }

    public ArrayList<Demographics> addFrame(ArrayList<Demographics> userList) {
        JFrame aFrame = new JFrame("HRDatabase"); // frame
        aFrame.setSize(1000, 500);
        aFrame.setLayout(new BorderLayout(10, 10));

        SwingUtilities.invokeLater(() -> {
            JPanel aPanel = new JPanel();
            {
                aPanel.setLayout(new FlowLayout());
                aPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                class Input {
                    String name = "";
                    String email = "";
                    String address = "";
                    String emergencyContact = "";
                    String emergencyContactNum = "";
                }

                Evaluations newEval = new Evaluations();
                Skills newSkills = new Skills();
                jobHistory newJobHistory = new jobHistory();

                Input inputs = new Input();

                String[] todo = new String[] { "Name", "Email", "Address", "Emergency Contact", "Emergency Contact #" };
                for (String s : todo) {
                    JLabel label = new JLabel(s);
                    aPanel.add(label);

                    JTextField textField = new JTextField(10);
                    aPanel.add(textField);

                    textField.addActionListener(new ActionListener() {
                        @Override

                        public void actionPerformed(ActionEvent e) {
                            String input = textField.getText();
                            switch (s) {
                                case ("Full Name"):
                                    inputs.name = input;
                                    break;

                                case ("Email"):
                                    inputs.email = input;
                                    break;

                                case ("Address"):
                                    inputs.address = input;
                                    break;

                                case ("Emergency Contact"):
                                    inputs.emergencyContact = input;
                                    break;

                                case ("Emergency Contact #"):
                                    inputs.emergencyContactNum = input;
                                    break;
                            }
                        }
                    });
                }

                JButton eval = new JButton("Add Eval");
                eval.setFocusable(false); // makes button prettier so cant focus on text
                eval.setFont(new Font("Times New Roman", Font.BOLD, 18)); // sets font for Label
                aPanel.add(eval);
                eval.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String supervisor = JOptionPane.showInputDialog(aFrame, "Enter supervisor name:");
                        String evalDate = JOptionPane.showInputDialog(aFrame, "Enter Eval Date:");
                        String[] satisfaction = new String[3];
                        for (int i = 0; i < satisfaction.length; i++) {
                            satisfaction[i] = JOptionPane.showInputDialog(aFrame, "Enter Employee Satisfaction");
                        }
                        String[] extras = new String[3];
                        for (int i = 0; i < extras.length; i++) {
                            extras[i] = JOptionPane.showInputDialog(aFrame, "Enter Extra Notes:");
                        }
                        newEval.evalSupervisor = supervisor;
                        newEval.dateOfEval = evalDate;
                        newEval.employeeSatisfaction = satisfaction;
                        newEval.extraNotes = extras;

                    }
                });

                JButton jobHist = new JButton("Add Job History");
                jobHist.setFocusable(false); // makes button prettier so cant focus on text
                jobHist.setFont(new Font("Times New Roman", Font.BOLD, 18)); // sets font for Label
                aPanel.add(jobHist);
                jobHist.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String companyName = JOptionPane.showInputDialog(aFrame, "Enter company name:");
                        String supervisor = JOptionPane.showInputDialog(aFrame, "Enter supervisor:");
                        String lengthOfJob = JOptionPane.showInputDialog(aFrame, "Enter length of job:");
                        String[] teammates = new String[3];
                        for (int i = 0; i < teammates.length; i++) {
                            teammates[i] = JOptionPane.showInputDialog(aFrame, "Enter teammate name:");
                        }
                        String[] teamRoles = new String[3];
                        for (int i = 0; i < teamRoles.length; i++) {
                            teamRoles[i] = JOptionPane.showInputDialog(aFrame, "Enter teammate's role:");
                        }
                        newJobHistory.companyName = companyName;
                        newJobHistory.supervisor = supervisor;
                        newJobHistory.lengthOfJob = lengthOfJob;
                        newJobHistory.teammates = teammates;
                        newJobHistory.teamRoles = teamRoles;

                    }
                });

                JButton skills = new JButton("Add Skills");
                skills.setFocusable(false); // makes button prettier so cant focus on text
                skills.setFont(new Font("Times New Roman", Font.BOLD, 18)); // sets font for Label
                aPanel.add(skills);
                skills.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] critSkills = new String[3];
                        for (int i = 0; i < critSkills.length; i++) {
                            critSkills[i] = JOptionPane.showInputDialog(aFrame, "Enter critical skills here:");
                        }
                        String[] critSkillLvl = new String[3];
                        for (int i = 0; i < critSkillLvl.length; i++) {
                            critSkillLvl[i] = JOptionPane.showInputDialog(aFrame, "Enter skill levels:");
                        }
                        String[] softSkills = new String[3];
                        for (int i = 0; i < softSkills.length; i++) {
                            softSkills[i] = JOptionPane.showInputDialog(aFrame, "Enter soft skills:");
                        }
                        String[] talents = new String[3];
                        for (int i = 0; i < talents.length; i++) {
                            talents[i] = JOptionPane.showInputDialog(aFrame, "Enter talents:");
                        }

                        newSkills.criticalSkills = critSkills;
                        newSkills.criticalSkillLevel = critSkillLvl;
                        newSkills.softSkills = softSkills;
                        newSkills.giftsTalents = talents;

                    }
                });

                // commit button very important
                JButton commit = new JButton("Commit");
                commit.setFocusable(false); // makes button prettier so cant focus on text
                commit.setFont(new Font("Times New Roman", Font.BOLD, 18)); // sets font for Label
                commit.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Demographics newEntry = new Demographics();
                        newEntry.setFirstAndLastName(inputs.name);
                        newEntry.setEmailAddress(inputs.email);
                        newEntry.setHomeAddress(inputs.address);
                        newEntry.setEmergencyContactName(inputs.emergencyContact);
                        newEntry.setEmergencyContactNum(inputs.emergencyContactNum);
                        newEntry.setEvaluations(newEval);
                        newEntry.setSkills(newSkills);
                        newEntry.setJobHistory(newJobHistory);

                        userList.add(newEntry);
                        aFrame.dispose();
                    }
                });
                aPanel.add(commit);

                aFrame.setVisible(true);
            }
            aFrame.getContentPane().add(aPanel); // adds panel
        });
        return userList;
    }
}