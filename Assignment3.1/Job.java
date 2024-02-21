public class Job {
/*
-Whoever finishes last and pushes their code will then write a driver (main) program 
 to create objects based on the three classes and perform relevant operations.
-Merge that new driver code and create a pull request
-The other two team members will then review the code, comment on it in 
 GitHub and if ready, approve the merge. 
-The last person to approve is the one who physically merges the code

 Attributes:
     - Title (String): Stores the past or current job title.
     - Experience (int): Stores the number of months in the job.
   - Methods:
     - setTitle(String): Sets the job title
     - setExperience(int): Sets the number of months on the job.
     - getTitle(): Retrieves the job title
     - getExperiencel(): Retrieves the number of months on the job
     - displayDetails(): Displays the jobs and lengths of time in months on the job
*/ 
private String Title;
private int Experience;

public void setTitle(String title)
{
    Title = title;  //set method to set the title
}

public void setExperience(int exp)
{
    Experience = exp;  //set method to set the experience of months on the job
}

public String getTitle()
{
    return Title;  //finds the title of job
}

public int getExperience1()
{
    return Experience;  //finds the # of months on job
}

public void displayDetails()
{
    System.out.println("--- Job ---");
    System.out.println("Title: " + this.Title);
    System.out.println("Experience: " + this.Experience + " months");
    //prints the selected title and exp
}

}
