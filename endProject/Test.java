package endProject;

public class Test {
    public static void main(String[] args) {
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

        // System.out.println(person1);

        System.out.println(person1.getSkills());
        System.out.println(person1.getJobHistory());
        System.out.println(person1.getEvaluations());

    }
}
