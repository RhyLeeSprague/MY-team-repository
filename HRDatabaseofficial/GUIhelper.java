package HRDatabaseofficial;

import java.util.ArrayList;

public class GUIhelper {

    public GUIhelper() {
    } // default constructor

    public String[] convertObjectArray(ArrayList<Demographics> list) {
        String[] finalList = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Demographics iterator = list.get(i);
            String name = iterator.getFirstAndLastName();
            String email = iterator.getEmailAddress();
            String address = iterator.getHomeAddress();
            String emergencyContact = iterator.getEmergencyContactName();
            String emergencyContactNum = iterator.getEmergencyContactNum();

            StringBuilder demographicInfoBuilder = new StringBuilder();
            demographicInfoBuilder.append(name).append(", ").append(email).append(", ").append(address)
                    .append(", ").append(emergencyContact).append(", ").append(emergencyContactNum).append(", ");

            Skills[] skills = iterator.getSkills();
            if (skills != null) {
                StringBuilder skillsInfo = new StringBuilder();
                for (Skills skill : skills) {
                    if (skill != null) {
                        String[] criticalSkills = skill.getCriticalSkills();
                        String[] criticalSkillLevels = skill.getCriticalSkillLevel();
                        String[] softSkills = skill.getSoftSkills();
                        String[] giftsTalents = skill.getGiftsTalents();
                        if (criticalSkills != null && criticalSkillLevels != null) {
                            for (int j = 0; j < criticalSkills.length && j < criticalSkillLevels.length; j++) {
                                skillsInfo.append(criticalSkills[j]).append(",").append(criticalSkillLevels[j])
                                        .append(",");
                            }
                        }
                        if (softSkills != null) {
                            for (String softSkill : softSkills) {
                                skillsInfo.append(softSkill).append(", ");
                            }
                        }
                        if (giftsTalents != null) {
                            for (String giftTalent : giftsTalents) {
                                skillsInfo.append(giftTalent).append(", ");
                            }
                        }
                    }
                }
                demographicInfoBuilder.append(skillsInfo.toString());
            }

            jobHistory[] jobHistory = iterator.getJobHistory();
            if (jobHistory != null) {
                StringBuilder jobHistoryInfo = new StringBuilder();
                for (jobHistory job : jobHistory) {
                    if (job != null) {
                        String companyName = job.getCompanyName();
                        String supervisor = job.getSupervisor();
                        String lengthOfJob = job.getLengthOfJob();
                        String[] teammates = job.getTeammates();
                        String[] teamRoles = job.getTeamRoles();
                        jobHistoryInfo.append(companyName).append(", ").append(supervisor).append(",")
                                .append(lengthOfJob).append(", ");
                        if (teammates != null) {
                            for (String teammate : teammates) {
                                jobHistoryInfo.append(teammate).append(", ");
                            }
                        }
                        if (teamRoles != null) {
                            for (String teamRole : teamRoles) {
                                jobHistoryInfo.append(teamRole).append(", ");
                            }
                        }
                    }
                }
                demographicInfoBuilder.append(jobHistoryInfo.toString());
            }

            Evaluations[] evaluations = iterator.getEvaluations();
            if (evaluations != null) {
                StringBuilder evaluationsInfo = new StringBuilder();
                for (Evaluations eval : evaluations) {
                    if (eval != null) {
                        String evalSupervisor = eval.getEvalSupervisor();
                        String dateOfEval = eval.getDateOfEval();
                        String[] employeeSatisfaction = eval.getEmployeeSatisfaction();
                        String[] extraNotes = eval.getExtraNotes();
                        evaluationsInfo.append(evalSupervisor).append(", ").append(dateOfEval).append(", ");
                        if (employeeSatisfaction != null) {
                            for (String satisfaction : employeeSatisfaction) {
                                evaluationsInfo.append(satisfaction).append(", ");
                            }
                        }
                        if (extraNotes != null) {
                            for (String note : extraNotes) {
                                evaluationsInfo.append(note).append(", ");
                            }
                        }
                    }
                }
                demographicInfoBuilder.append(evaluationsInfo.toString());
            }

            finalList[i] = demographicInfoBuilder.toString();
        }
        return finalList;
    }

    public String[] getNames(ArrayList<Demographics> list) {
        String[] finalList = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Demographics iterator = list.get(i); // finds object at the specified index
            String name = iterator.getFirstAndLastName(); // loops through object and returns name;
            finalList[i] = name;
        }
        return finalList;
    }

    public String[] addTo(String name, String[] list) // appends a variable to a String[]
    {
        String[] newArray = new String[list.length + 1];
        // Assign the name to the first index of newArray
        newArray[0] = name;
        // Copy existing elements from list to newArray starting from index 1
        for (int i = 0; i < list.length; i++) {
            newArray[i + 1] = list[i];
        }
        return newArray;
    }

    public Demographics returnObject(String name, ArrayList<Demographics> list) {
        for (int i = 0; i < list.size(); i++) {
            // made a temp object OF THE TARGET CLASS THAT CONTAINS THE ORIGINAL STRING
            Demographics iterator = list.get(i); // finds object at the specified index
            String found = iterator.getFirstAndLastName(); // loops through object and returns name;
            if (found == name)
                return iterator;
        }

        Demographics nullObj = new Demographics();
        return nullObj;
    }
}