import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;

//To validate all forms of login data along with sensitive info.
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
/*
 * public void saveAccounts(Account currentAcct) throws IOException { // Written
 * for you
 * if (currentAcct.getLoggedIn() && fileOpen && !saved) {
 * PrintWriter pw = new PrintWriter("accounts.txt");
 * for (int i = 0; i < allAccounts.size(); i++) {
 * allAccounts.get(i).writeToFile(pw);
 * }
 * pw.close();
 * saved = true;
 * } else if (saved) {
 * System.out.println("File is already saved.");
 * } else if (!currentAcct.getLoggedIn()) {
 * System.out.println("Must be logged in.");
 * }
 * }
 */

/*
 * private boolean validEmailAddress(String emailCheck) {
 * boolean passes = true;
 * int i = 0;
 * char c;
 * int numberOfAtSigns = 0;
 * boolean numberOfCharactersAfterDotPasses = false;
 * int dotLocation = 0;
 * while (i < emailCheck.length() && passes) {
 * c = emailCheck.charAt(i);
 * if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' &&
 * c <= '9') || c == '@' || c == '.')) {
 * passes = false;
 * }
 * if (c == '@') {
 * numberOfAtSigns++;
 * if (i == 0) {
 * passes = false;
 * }
 * } else if (c == '.') {
 * dotLocation = i;
 * if (i == 0) {
 * passes = false;
 * }
 * }
 * i++;
 * }
 * int numberOfCharactersAfterLastDot = (emailCheck.length() - 1) - dotLocation;
 * if (numberOfCharactersAfterLastDot == 3 || numberOfCharactersAfterLastDot ==
 * 2) {
 * numberOfCharactersAfterDotPasses = true;
 * }
 * if (!(numberOfAtSigns == 1 && numberOfCharactersAfterDotPasses == true)) {
 * passes = false;
 * }
 * return passes;
 * }
 * 
 * private boolean validNumber(String stringNumber) {
 * boolean passes = true;
 * boolean digitsFound = false;
 * int i = 0;
 * char c;
 * int numDigitsAfterComma;
 * while (i < stringNumber.length() && passes) {
 * c = stringNumber.charAt(i);
 * if (c == '$' && i != 0) // $ not first char - no leading spaces
 * {
 * passes = false;
 * System.out.println(c + " if there's a $ sign, it must be first.");
 * }
 * if (c >= '0' && c <= '9') {
 * digitsFound = true;
 * }
 * if (!((c >= '0' && c <= '9') || c == '.' || c == ',' || c == '$')) {
 * //System.out.println(c + " Unacceptable character");
 * passes = false;
 * }
 * if (c == ',') // 567,234,
 * {
 * numDigitsAfterComma = 0;
 * i++;
 * if (i == stringNumber.length()) // number ends with a comma
 * {
 * //System.out.println(c + " ends with comma ");
 * passes = false;
 * }
 * while (i < stringNumber.length() && numDigitsAfterComma < 3 && passes) {
 * c = stringNumber.charAt(i);
 * if (c >= '0' && c <= '9') {
 * numDigitsAfterComma++;
 * //WriteLine(numDigitsAfterComma);
 * } else {
 * //System.out.println(c + " non numeric char after comma");
 * passes = false;
 * }
 * i++;
 * }
 * // i was incremented to next char after third numeric digit after ,
 * if (i < stringNumber.length() && passes) {
 * c = stringNumber.charAt(i); // ck following char
 * if (!(c == ',' || c == '.')) {
 * //System.out.println(c + " not a , or . after last dig after ,");
 * passes = false;
 * }
 * }
 * i--;
 * c = stringNumber.charAt(i);
 * if (numDigitsAfterComma != 3) {
 * passes = false; // there has to be 3 digits after comma
 * }
 * }
 * if (c == '.') {
 * i++;
 * c = stringNumber.charAt(i);
 * if (c >= '0' && c <= '9') {
 * digitsFound = true;
 * }
 * while (i < stringNumber.length() && passes) {
 * c = stringNumber.charAt(i);
 * if (!(c >= '0' && c <= '9')) {
 * //System.out.println(c + " non-numeric after decimal");
 * passes = false;
 * }
 * i++;
 * }
 * }
 * i++;
 * }
 * if (digitsFound && passes) {
 * return true;
 * } else {
 * return false;
 * }
 * }
 * 
 * private boolean validPassword(String checkPassword) {
 * boolean uppercaseExists = false, lowercaseExists = false,
 * numericCharacterExists = false, specialCharacterExists = false;
 * boolean pass = false;
 * char c = ' ';
 * int ascii;
 * int i = 0;
 * if (checkPassword.length() < 8) {
 * pass = false;
 * } else {
 * while ((i < checkPassword.length()) &&
 * !(specialCharacterExists && uppercaseExists &&
 * numericCharacterExists && lowercaseExists)) {
 * c = checkPassword.charAt(i);
 * ascii = (int)c;
 * if ((ascii > 122 && ascii < 127) || (ascii > 90 && ascii < 97) || (ascii > 57
 * && ascii < 65) || (ascii > 31 && ascii < 48)) {
 * specialCharacterExists = true;
 * } else if (ascii > 64 && ascii < 91) {
 * uppercaseExists = true;
 * } else if (ascii > 96 && ascii < 123) {
 * lowercaseExists = true;
 * } else if (ascii > 47 && ascii < 58) {
 * numericCharacterExists = true;
 * }
 * i++;
 * }
 * }
 * if (specialCharacterExists && uppercaseExists && lowercaseExists &&
 * numericCharacterExists) {
 * pass = true;
 * }
 * return pass;
 * }
 * 
 * 
 * 
 * 
 * int i = 0;
 * boolean found = false;
 * while(i < Demographics.size() && !found){
 * if(Demographics.get(i).getEmailAddress().equals(emailAddress)
 * && Demographics.get(i).getPassword().equals(password)){
 * 
 * employee.loggedIn = true;
 * 
 * found = true;
 * }
 * i++;
 * 
 * }
 * if(!found){
 * System.out.println("Invalid creditinals. Please try slower.");
 * }
 * }
 * else{
 * System.out.
 * println("You are already logged in please logout before trying again.");
 * }
 */