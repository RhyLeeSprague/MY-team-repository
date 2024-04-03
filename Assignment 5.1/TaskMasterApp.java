public class TaskMasterApp {
    public static void main(String[] args) {
        // Create Task objects
        Task task1 = new Task("Complete Assignment", 30);
        //more tasks go here
        Task task2 = new Task("Read a Book", 45);
        Task task3 = new Task("Exercise", 60);
        // Create TaskTracker object called "tracker"
        TaskTracker tracker = new TaskTracker();

        // Add tasks to the task list
        tracker.addTask(task1);
        tracker.addTask(task2);
        tracker.addTask(task3);

        // Display tasks in the task list
        tracker.displayTasks();

        // Mark tasks as completed
        tracker.markTaskAsComplete(0);
        tracker.markTaskAsComplete(2);

        // Display calculated statistics
        System.out.println("Total Duration of Completed Tasks: " + tracker.calculateTotalDuration() + " minutes");
        System.out.println("Average Duration of Completed Tasks: " + tracker.calculateAverageDuration() + " minutes");
        System.out.println("Maximum Duration among Completed Tasks: " + tracker.findMaxDuration() + " minutes");
    }
}
