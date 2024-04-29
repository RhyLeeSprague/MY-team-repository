package HRDatabaseofficial;

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
    String password;

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

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return this.password;
    }

}

class jobHistory {
    String companyName;
    String supervisor;
    String[] teammates;
    String lengthOfJob;
    String[] teamRoles;

    // Getter and setter methods for companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Getter and setter methods for supervisor
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    // Getter and setter methods for teammates
    public String[] getTeammates() {
        return teammates;
    }

    public void setTeammates(String[] teammates) {
        this.teammates = teammates;
    }

    // Getter and setter methods for lengthOfJob
    public String getLengthOfJob() {
        return lengthOfJob;
    }

    public void setLengthOfJob(String lengthOfJob) {
        this.lengthOfJob = lengthOfJob;
    }

    // Getter and setter methods for teamRoles
    public String[] getTeamRoles() {
        return teamRoles;
    }

    public void setTeamRoles(String[] teamRoles) {
        this.teamRoles = teamRoles;
    }
}

class Skills {
    String[] criticalSkills;
    String[] criticalSkillLevel;
    String[] softSkills;
    String[] giftsTalents;

    // Getter and setter methods for criticalSkills
    public String[] getCriticalSkills() {
        return criticalSkills;
    }

    public void setCriticalSkills(String[] criticalSkills) {
        this.criticalSkills = criticalSkills;
    }

    // Getter and setter methods for criticalSkillLevel
    public String[] getCriticalSkillLevel() {
        return criticalSkillLevel;
    }

    public void setCriticalSkillLevel(String[] criticalSkillLevel) {
        this.criticalSkillLevel = criticalSkillLevel;
    }

    // Getter and setter methods for softSkills
    public String[] getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String[] softSkills) {
        this.softSkills = softSkills;
    }

    // Getter and setter methods for giftsTalents
    public String[] getGiftsTalents() {
        return giftsTalents;
    }

    public void setGiftsTalents(String[] giftsTalents) {
        this.giftsTalents = giftsTalents;
    }
}

class Evaluations {
    String evalSupervisor;
    String dateOfEval;
    String[] employeeSatisfaction;
    String[] extraNotes;

    // Getter and setter methods for evalSupervisor
    public String getEvalSupervisor() {
        return evalSupervisor;
    }

    public void setEvalSupervisor(String evalSupervisor) {
        this.evalSupervisor = evalSupervisor;
    }

    // Getter and setter methods for dateOfEval
    public String getDateOfEval() {
        return dateOfEval;
    }

    public void setDateOfEval(String dateOfEval) {
        this.dateOfEval = dateOfEval;
    }

    // Getter and setter methods for employeeSatisfaction
    public String[] getEmployeeSatisfaction() {
        return employeeSatisfaction;
    }

    public void setEmployeeSatisfaction(String[] employeeSatisfaction) {
        this.employeeSatisfaction = employeeSatisfaction;
    }

    // Getter and setter methods for extraNotes
    public String[] getExtraNotes() {
        return extraNotes;
    }

    public void setExtraNotes(String[] extraNotes) {
        this.extraNotes = extraNotes;
    }
}
