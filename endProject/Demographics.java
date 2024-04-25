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
