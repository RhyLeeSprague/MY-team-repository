package HRDatabaseofficial;

import java.lang.Object;
import java.time.LocalDateTime;
import java.time.Duration;

public class Person {
    private boolean loggedIn, loggedOut;
    private LocalDateTime clockedIn, clockedOut;
    Demographics employee1 = new Demographics();

    //Goes through the arrays for emails and passwords looking for an match
    //If gets a match logIn equals successful if fails to find a match then invalid login message pops up

    //Unfinished code needs proper parameters, 
    //along with a better delegated for loop as the current list is incorrect.
    /*
    public void logIn(String emailAddress, String password, ArrayList<Demographics> userList){
        boolean found = false;
        for(Employee employee : userList){
            if(employee.getPassword().equals(password) 
            && employee.getEmailAddress().equals(emailAddress)){
                found = true;
                break;
            }
        }
        if(!found){
            throw new RuntimeException("Log in info is incorrect. Please try again slower.");
        }
        else{
            throw new RuntimeException("You are now successfully logged in.");
        }
    }  
    */

    public void logOut(){
        //If not logged in at all just tells the user they can't log out until logged in
        if(loggedIn != true){
            throw new RuntimeException("You have to be logged in before you can log out.");
        } 
        else{
            //If everything is good simply sets loggedIn to false and throws logged out message
            loggedIn = false;
            throw new RuntimeException("You are logged out.");
        }
        
    }

    public void clockIn() {
        // When clocked in takes that specific instance in time
        clockedIn = LocalDateTime.now();
    }

    public void clockOut() {
        // When clocked out it takes that specific instance in time.
        clockedOut = LocalDateTime.now();

    }

    public Duration totalTime() {

        // Takes the instances of time between clockedIn and Out
        // and takes the difference to return total time worked
        return Duration.between(clockedIn, clockedOut);
    }

}
