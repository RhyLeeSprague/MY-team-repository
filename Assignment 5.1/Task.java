public class Task {
    // Unique variables to each task needed here
    public String taskName;
    public int taskDuration;
    public boolean completionStatus;

    // Constructor to initialize Task object with a name and duration
    public Task(String name, int duration) {
        taskName = name;
        taskDuration = duration;
        // Initially, the task is not completed
        completionStatus = false;
    }
}
