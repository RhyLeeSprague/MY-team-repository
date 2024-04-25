package endProject;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Demographics> employeeList = new ArrayList<>();

        Demographics person1 = new Demographics();
        person1.firstAndLastName = "Joe Schmoe";
        person1.emailAddress = "JoeSchmoe@gmail.com";
        person1.homeAddress = "123 Apple Drive, Murray KY 42071";
        person1.emergencyContactNum = "1-800-555-1234";
        person1.emergencyContactName = "Jane Schmoe";

        Evaluations eval1 = new Evaluations();
        eval1.evalSupervisor = "Manager A";
        eval1.dateOfEval = "2023-05-10";
        eval1.employeeSatisfaction = new String[] { "Not Satisfied" };
        eval1.extraNotes = new String[] { "Not a hard worker" };

        jobHistory job1 = new jobHistory();
        job1.companyName = "ABC Company";
        job1.supervisor = "Manager A";
        job1.teammates = new String[] { "Teammate 1", "Teammate 2" };
        job1.lengthOfJob = "2 years";
        job1.teamRoles = new String[] { "Role 1", "Role 2" };

        Skills skill1 = new Skills();
        skill1.criticalSkills = new String[] { "Java", "Python" };
        skill1.criticalSkillLevel = new String[] { "Intermediate", "Advanced" };
        skill1.softSkills = new String[] { "Communication", "Teamwork" };
        skill1.giftsTalents = new String[] { "Problem-solving", "Creativity" };

        person1.setJobHistory(job1);
        person1.setSkills(skill1);
        person1.setEvaluations(eval1);

        // stores instance of demographics to arraylist employeelist

        employeeList.add(person1);

        // Shows how to call the arrays inside an instance of demographics

        System.out.println(person1.getEvaluations()[0].evalSupervisor);
        System.out.println(person1.getJobHistory()[0].companyName);
        System.out.println(person1.getSkills()[0].criticalSkillLevel[0]);

        // shows that employeeList stores every instance of demographics

        System.out.println(employeeList.toString());
    }
}

/*
 * 
 * This code below shows how to use a button to create a new instance of
 * demographics, which creates a new employee
 * This doesn't include any code to add information to the variables
 * 
 * addButton.addActionListener(new ActionListener() {
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * // Create a new instance of Demographics
 * Demographics newEmployee = new Demographics();
 * // Add the new instance to the employeeList
 * employeeList.add(newEmployee);
 * 
 * // Optionally, you can do something with the new employee,
 * // such as displaying it in a dialog or updating a UI component.
 * // For example:
 * JOptionPane.showMessageDialog(TestGUI.this, "New employee added!");
 * }
 * });
 * 
 * This code below creates an instance of Skills and attaches it to whatever
 * instance of Demographics is passed
 * The individual variables will need to be changed to whatever user input is
 * 
 * private static void attachNewSkills(Demographics person) {
 * // Create a new instance of Skills
 * Skills newSkills = new Skills();
 * newSkills.criticalSkills = new String[]{"Java", "Python"};
 * newSkills.criticalSkillLevel = new String[]{"Intermediate", "Advanced"};
 * newSkills.softSkills = new String[]{"Communication", "Teamwork"};
 * newSkills.giftsTalents = new String[]{"Problem-solving", "Creativity"};
 * 
 * // Set the new instance of Skills to the provided Demographics object
 * person.setSkills(newSkills);
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
