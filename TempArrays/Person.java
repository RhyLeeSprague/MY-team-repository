<<<<<<<< HEAD:HRDatabaseofficial/Person.java
package endProject;
========
package TempArrays;
>>>>>>>> 9b8571f56003021ae7dd72aabeffdf11bc7ab9ed:TempArrays/Person.java

import java.lang.Object;
import java.time.LocalDateTime;
import java.time.Duration;

public abstract class Person {
    private boolean loggedIn, loggedOut;
    private LocalDateTime clockedIn, clockedOut;
<<<<<<<< HEAD:HRDatabaseofficial/Person.java

    // Goes through the arrays for emails and passwords looking for an match
    // If gets a match logIn equals successful if fails to find a match then invalid
    // login message pops up
    public void logIn(emailAddress, password){
========
    
    //Goes through the arrays for emails and passwords looking for an match
    //If gets a match logIn equals successful if fails to find a match then invalid login message pops up
    public void logIn( String emailAddress, String password){
>>>>>>>> 9b8571f56003021ae7dd72aabeffdf11bc7ab9ed:TempArrays/Person.java
        boolean found = false;
        for(Employee employee : Demographics){
            if(employee.getPassword().equals(password) 
            && employee.getEmailAddress().equals(emailAddress)){
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Log in info is incorrect. Please try again slower.");
        }
        else{
            System.out.println("You are now successfully logged in.");
        }
    }

    public void logOut() {
        // If not logged in at all just tells the user they can't log out until logged
        // in
        if (loggedIn != true) {
            System.out.println("You have to be logged in before you can log out");
        } else if (changesSaved != true) {
            // Checks to see if changes were saved.

            System.out.println("Please save changes before logging out.");
        } else {
            // If everything is good simply sets loggedIn to false and prints logged out
            // message
            loggedIn = false;
            System.out.println("You are logged out.");
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
