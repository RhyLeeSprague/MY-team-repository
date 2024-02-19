import java.util.Scanner;

public class Person {
    static Scanner scn = new Scanner(System.in);
    private String name;
    private int age;

    public Person() {

    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    } 

    public void displayDetails(){
        System.out.println("--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age " + age);
    }

}
