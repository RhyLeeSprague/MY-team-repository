public class main{
public static void main(String[] args) {
 Job job = new Job();
 Person person = new Person();
 HardSkill hskill = new HardSkill();

 job.setTitle("Employee");
 job.setExperience(8);
 hskill.setTitle("Programming");
 hskill.setLevel("Intermediate");
 person.setName("Billy Joe");
 person.setAge(37);

 person.displayDetails();
 System.out.println("");
 job.displayDetails();
 System.out.println("");
 hskill.displayDetails();

}
}
