package HRDatabaseofficial;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

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

    //Needs an accesslevel getter and setter in main
    //and then needs to be called in the parameter then good to go.
/*
    public void accessCheck(accessLevel){
        //Checks the employee's access level when trying to click something that requires higher clearance
        if(accessLevel != 'a'){
            throw new RuntimeException("You do not have the access level required to do this action.");
        }
        else{
        }
    }
*/
}

