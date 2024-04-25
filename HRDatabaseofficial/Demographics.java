package HRDatabaseofficial;

import java.util.Arrays;
import java.util.ArrayList;

public class Demographics {
    String firstAndLastName;
    String emailAddress;
    String homeAddress;
    String phoneNumber;
    String emergencyContactNum;
    String emergencyContactName;
    String[] jobHistories = new String[5];
    String[] skillSet = new String[5];
    String[] evaluations = new String[5];

    ArrayList list = new ArrayList() {}; //temp

    public Demographics(){}

    public Demographics(String name, String email, String address, String number, 
    String ecnum, String ecname, Evaluations eval, jobHistory jobHist, Skills skills) {
        firstAndLastName = name;
        emailAddress = email;
        homeAddress = address;
        phoneNumber = number;
        emergencyContactNum = ecnum;
        emergencyContactName = ecname;

    }

    public ArrayList getList()
    {
        return list;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    public String getFirstAndLastName() {
        return this.firstAndLastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmergencyContactNum(String emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;
    }

    public String getEmergencyContactNum() {
        return emergencyContactNum;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactName() {
        return this.emergencyContactName;
    }

<<<<<<< HEAD:endProject/Demographics.java
    public void setJobHistory(jobHistory job) {
        this.jobHistories[0] = job;
    }

    jobHistory[] getJobHistory() {
        return this.jobHistories;
    }

    public void setSkills(Skills skills) {
        this.skills[0] = skills;
    }

    Skills[] getSkills() {
        return this.skills;
    }

    public void setEvaluations(Evaluations eval) {
        this.evaluations[0] = eval;
    }

    Evaluations[] getEvaluations() {
        return this.evaluations;
    }
=======
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First and Last Name: ").append(firstAndLastName).append("\n");
        sb.append("Email Address: ").append(emailAddress).append("\n");
        sb.append("Home Address: ").append(homeAddress).append("\n");
        sb.append("Emergency Contact Number: ").append(emergencyContactNum).append("\n");
        sb.append("Emergency Contact Name: ").append(emergencyContactName).append("\n");

        // Job History Object
        sb.append("\nJob History:\n");
        for (jobHistory job : jobHistories) {
            if (job != null) {
                sb.append("Company Name: ").append(job.companyName).append("\n");
                sb.append("Supervisor: ").append(job.supervisor).append("\n");
                sb.append("Teammates: ").append(Arrays.toString(job.teammates)).append("\n");
                sb.append("Length of Job: ").append(job.lengthOfJob).append("\n");
                sb.append("Team Roles: ").append(Arrays.toString(job.teamRoles)).append("\n");
            }
        }

        // Skills Object
        sb.append("\nSkills:\n");
        for (Skills skill : skills) {
            if (skill != null) {
                sb.append("Critical Skills: ").append(Arrays.toString(skill.criticalSkills)).append("\n");
                sb.append("Critical Skill Levels: ").append(Arrays.toString(skill.criticalSkillLevel)).append("\n");
                sb.append("Soft Skills: ").append(Arrays.toString(skill.softSkills)).append("\n");
                sb.append("Gifts and Talents: ").append(Arrays.toString(skill.giftsTalents)).append("\n");
            }
        }

        // Evaluations Object
        sb.append("\nEvaluations:\n");
        for (Evaluations eval : evaluations) {
            if (eval != null) {
                sb.append("Evaluation Supervisor: ").append(eval.evalSupervisor).append("\n");
                sb.append("Date of Evaluation: ").append(eval.dateOfEval).append("\n");
                sb.append("Employee Satisfaction: ").append(Arrays.toString(eval.employeeSatisfaction)).append("\n");
                sb.append("Extra Notes: ").append(Arrays.toString(eval.extraNotes)).append("\n");
            }
        }

        return sb.toString();
    }


    public void makeAPerson()
    {
        
    /* TEST */
    Evaluations persone1 = new Evaluations("Guy Fieri", "1/2/03",
     "Unsatisfied", "fire soon");

     String[] teammates = new String[]{"oneguy", "twoguy"};
    jobHistory personj1 = new jobHistory("ABC Comp", "Gordon Ramsay", teammates,
     "2 years", "role");

     String[] skillList = new String[] {"java", "python"};
     String[] softSkills = new String[] {"Friendly", "Cool"};
     String[] giftsTalents = new String[] {"Creative", "megamind"};
    Skills persons1 = new Skills(skillList, "Advanced", softSkills, giftsTalents);

    Demographics person1 = new Demographics("Joe Schmoe", "JoeSchmoe@g.com", "123 Apple Dr", 
    "000-000-0000", "001-000-0011", "Jane Schmoe", persone1, personj1, persons1);
>>>>>>> 9b8571f56003021ae7dd72aabeffdf11bc7ab9ed:HRDatabaseofficial/Demographics.java

}

class jobHistory {
    String companyName;
    String supervisor;
    String[] teammateList;
    String lengthOfJob;
<<<<<<< HEAD:endProject/Demographics.java
    String[] teamRoles;
=======
    String teamRole;

    public jobHistory(){}

    public jobHistory(String name, String superv, String[] teammates, String jobLength, String role)
    {
        companyName = name;
        supervisor = superv;
        teammateList = teammates;
        lengthOfJob = jobLength;
        teamRole = role;
    }
>>>>>>> 9b8571f56003021ae7dd72aabeffdf11bc7ab9ed:HRDatabaseofficial/Demographics.java
}

class Skills {
    String[] criticalSkills;
    String criticalSkillLevel;
    String[] softSkills;
    String[] giftsTalents;

    public Skills(){}

    public Skills(String[] skills, String skillLevel, String[] softSk, String[] talents)
    {
        criticalSkills = skills;
        criticalSkillLevel = skillLevel;
        softSkills = softSk;
        giftsTalents = talents;
    }
}

class Evaluations {
    String evalSupervisor;
    String dateOfEval;
    String employeeSatisfaction;
    String extraNotes;

    public Evaluations(){}

    public Evaluations(String supervisor, String date, String satisfaction, String notes)
    {
        evalSupervisor = supervisor;
        dateOfEval = date;
        employeeSatisfaction = satisfaction;
        extraNotes = notes;
    }
}

