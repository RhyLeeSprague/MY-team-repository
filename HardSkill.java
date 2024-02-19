public class HardSkill {
    String title;
    String level;

    static void setTitle(String title) {
        this.title = title;

    }

    static void setLevel(String level) {
        this.level = level;
    }

    static String getTitle() {
        return this.level;
    }

    static String getLevel() {
        return this.level;
    }

    static void displayDetails() {
        System.out.println("Title: " + this.title);
        system.out.println("Level: " + this.level);
    }
}
