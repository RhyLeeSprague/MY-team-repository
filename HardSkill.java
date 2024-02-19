public class HardSkill {
    String title;
    String level;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTitle() {
        return this.level;
    }

    public String getLevel() {
        return this.level;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Level: " + this.level);
    }
}
