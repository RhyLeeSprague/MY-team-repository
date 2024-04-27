import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class DataValidation {
    boolean fileOpen = false;
    boolean saved = true;

    public static Boolean validateEmail(String emailAddress) {
        //Email address standards from the RFC 5322
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(emailAddress);
        
        if(m.find()){
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean validatePassword(String password){
        //Password requirements Minimum eight and maximum 10 characters, 
        //at least one uppercase letter, one lowercase letter, one number and one special character:
        String regexPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\n)(?=.*[@$!%*?&])[A-Za-z\n@$!%*?&]{8,10}$";
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean validatePhoneNumber(String phoneNumber){
        //This regex pattern allows for dynamic formatting across 
        //multiple countries allowing international employees to be accomdated for.
        String regexPattern = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\./0-9]*$";
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(phoneNumber);
        if(m.find()){
            return true;
        }
        else{
            return false;
        }
    }
    public void saveChanges(Employee employee){
        //Needs to create a way to take info that is being inputted and save it.
        //Such as passwords/demographic info
        if (employee.loggedIn() && fileOpen && !saved){
            PrintWriter pw = new PrintWriter("employees.txt");
            for(int i = 0; i < employee.size(); i++){
                employee.get(i).writeToFile(pw);
            }
            pw.close();
            saved = true;
        }
        else if(saved){
            throw new RuntimeException("File is already saved.");
        }
        else if(!employee.loggedIn()){
            throw new RuntimeException("You must be logged in before you can make/save changes.");
        }
    }
    public void accessCheck(accessLevel){
        //Checks the employee's access level when trying to click something that requires higher clearance
        if(accessLevel != 'a'){
            throw new RuntimeException("You do not have the access level required to do this action.");
        }
        else{
        }
    }
}

