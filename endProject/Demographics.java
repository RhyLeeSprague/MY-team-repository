package endProject;

import java.util.Arrays;

public class Demographics {
    String firstAndLastName;
    String emailAddress;
    String homeAddress;
    String phoneNumber;
    String emergencyContactNum;
    String emergencyContactName;
    jobHistory[] jobHistories;
    Skills[] skills;
    Evaluations[] evaluations;

    public Demographics() {
        jobHistories = new jobHistory[5];
        skills = new Skills[5];
        evaluations = new Evaluations[5];
    }

    void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    String getFirstAndLastName() {
        return this.firstAndLastName;
    }

    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    String getEmailAddress() {
        return this.emailAddress;
    }

    void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    String getHomeAddress() {
        return this.homeAddress;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    void setEmergencyContactNum(String emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;
    }

    String getEmergencyContactNum() {
        return emergencyContactNum;
    }

    void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    String getEmergencyContactName() {
        return this.emergencyContactName;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First and Last Name: ").append(firstAndLastName).append("\n");
        sb.append("Email Address: ").append(emailAddress).append("\n");
        sb.append("Home Address: ").append(homeAddress).append("\n");
        sb.append("Emergency Contact Number: ").append(emergencyContactNum).append("\n");
        sb.append("Emergency Contact Name: ").append(emergencyContactName).append("\n");

        // Print job history
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

        // Print skills
        sb.append("\nSkills:\n");
        for (Skills skill : skills) {
            if (skill != null) {
                sb.append("Critical Skills: ").append(Arrays.toString(skill.criticalSkills)).append("\n");
                sb.append("Critical Skill Levels: ").append(Arrays.toString(skill.criticalSkillLevel)).append("\n");
                sb.append("Soft Skills: ").append(Arrays.toString(skill.softSkills)).append("\n");
                sb.append("Gifts and Talents: ").append(Arrays.toString(skill.giftsTalents)).append("\n");
            }
        }

        // Print evaluations
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
}

class jobHistory {
    String companyName;
    String supervisor;
    String[] teammates;
    String lengthOfJob;
    String[] teamRoles;

}

class Skills {
    String[] criticalSkills;
    String[] criticalSkillLevel;
    String[] softSkills;
    String[] giftsTalents;
}

class Evaluations {
    String evalSupervisor;
    String dateOfEval;
    String[] employeeSatisfaction;
    String[] extraNotes;
}
