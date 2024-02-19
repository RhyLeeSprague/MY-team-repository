public class HardSkill {
    private String title; // class variables
    private String level;

    public HardSkill() { // default constructor
    }

    public void setTitle(String title) { // setter for Title
        this.title = title;
    }

    public void setLevel(String level) { // setter for Level
        this.level = level;
    }

    public String getTitle() { // getter for Title
        return this.level;
    }

    public String getLevel() { // getter for Level
        return this.level;
    }

    public void displayDetails() { // displays details for HardSkill
        System.out.println("--- Hard Skills ---");
        System.out.println("Title: " + this.title);
        System.out.println("Level: " + this.level);
    }
}
