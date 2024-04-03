import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class TaskTracker{
    // List to store Task objects
    List<Task> taskList;

    // Constructor to initialize TaskTracker object with an empty task list
    public TaskTracker() {
        taskList = new ArrayList<>(); 
    }

    // Method to add a new task to the task list
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Method to mark a task as completed based on its index in the list
    public void markTaskAsComplete(int index) {
        taskList.get(index).completionStatus = true;
    }

    // Method to display all tasks in the task list
    public void displayTasks() {
        for(int i = 0; i < taskList.size(); i++){
            System.out.println((i + 1) + ". " + taskList.get(i).taskName + " - " + "Duration: " + taskList.get(i).taskDuration + " minutes");
        }
    }

    // Method to calculate the total duration of completed tasks
    public int calculateTotalDuration() {
        int totalDuration = 0;
        // loop logic goes here
        for(int i = 0; i < taskList.size(); i++){
            if(taskList.get(i).completionStatus == true){
                totalDuration += taskList.get(i).taskDuration;
            }
        }
        return totalDuration;
    }

    // Method to calculate the average duration of completed tasks
    public double calculateAverageDuration() {
        double sum = 0;
        for(int i = 0; i < taskList.size(); i++){
            sum += taskList.get(i).taskDuration;
        }
        double average = sum / taskList.size();
        return average;
    }

    // Method to find the maximum duration among completed tasks
    public int findMaxDuration() {
       int max = taskList.get(0).taskDuration;
        for(int i = 0; i < taskList.size(); i++){
            max = Math.max(max, taskList.get(i).taskDuration);
        }
        return max;
    }
}

