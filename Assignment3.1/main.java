import TempArrays.Person;

public class main{
public static void main(String[] args) {
    //Creates new instances of job person and hardskill classes.
    Job job = new Job();
    Person person = new Person();
    HardSkill hskill = new HardSkill();

    //Sets the variables such as titles, experiemces, levels, name, and age for the instances.
    job.setTitle("Employee");
    job.setExperience(8);
    hskill.setTitle("Programming");
    hskill.setLevel("Intermediate");
    person.setName("Billy Joe");
    person.setAge(37);

    //Calls the display methods from each class and displays them
    person.displayDetails();
    System.out.println("");
    job.displayDetails();
    System.out.println("");
    hskill.displayDetails();

}
}
