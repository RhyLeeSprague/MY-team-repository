import java.util.ArrayList;

public class TempArrays {
    // An object array list to contain an employee that holds their demographics info and accessLevel
    ArrayList<Object[]> myEmployees = new ArrayList<>();
    // An object array list to contain an evaluation over an employee's performance
    ArrayList<Object> Evalutions = new ArrayList<>();
    // An object array list to contain a jobHistory overview on an employee's past jobs.
    ArrayList<Object> jobHistory = new ArrayList<>();

    //Skills are multidimensonal arrays to contain the skill then the level of said skill.
    String[][] softSkills = new String[250][250];
    String[][] hardSkills = new String[250][250];
    //Emergency contact goes Name, Number
    String[][] emergencyContact = new String[250][250];
    //String about what the single/hypenated gift is.
    String[] gifts = new String[250];
    
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String passwords;

    //edit
    public void editArrayObject(int arrayIndex, int objectIndex, Object newObject) {
        if (arrayIndex >= 0 && arrayIndex < myEmployees.size()) {
            if (objectIndex >= 0 && objectIndex < myEmployees.get(arrayIndex).length) {
                myEmployees.get(arrayIndex)[objectIndex] = newObject;
            } else {
                System.err.println("Object's index out of bounds");
            }
        } else {
            System.err.println("The chosen index is out of bounds");
        }
    }

    //add

    //and delete methods


    public void innerArrays(Object[] newArray) {
        myEmployees.add(newArray);
    }


}
