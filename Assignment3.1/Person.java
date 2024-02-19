import java.util.Scanner;

public class Person {
    static Scanner scn = new Scanner(System.in);
    private String name;
    private int age;

    // Default constructor 
    public Person() {

    }
    //Grabs instance of name and sets it as name allows change later on.
    public void setName(String name){
        this.name = name;
    }
    //Grabs instance of age and sets it as age allows change later on.
    public void setAge(int age){
        this.age = age;
    }
    //Grabs name from specific instance.
    public String getName(){
        return this.name;
    }
    //Grabs age from specific instance.
    public int getAge(){
        return this.age;
    } 
    //Displays name and age of specific instance of person.
    public void displayDetails(){
        System.out.println("--- Person Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("Age " + this.age);
    }

}
