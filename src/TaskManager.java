import java.util.ArrayList;
import java.util.Collections;

public class TaskManager {
    // List to store tasks
    ArrayList<String> tasks = new ArrayList<>();
    // 1. Add a task
    public void addTask(String task) {
        // Check if task is empty or null
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Invalid task! Task cannot be empty.");
        }
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
    // 2. Sort tasks alphabetically
    public void sortTasks() {
        Collections.sort(tasks);
        System.out.println("\nTasks sorted successfully.");
    }
    // 3. Search for a task
    public void searchTask(String task) {
        int index = tasks.indexOf(task);
        if (index != -1) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found.");
        }
    }
    // 4. Remove a task
    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Unable to remove task. Task not found.");
        }
    }
    // 5. Find the longest task
    public void findLongestTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        String longest = tasks.get(0);
        for (String task : tasks) {
            if (task.length() > longest.length()) {
                longest = task;
            }
        }
        System.out.println("\nThe longest task is: " + longest);
    }
    // 6. Get a task by its index
    public void getTaskByIndex(int index) {
        try {
            String task = tasks.get(index);
            System.out.println("Task at index " + index + " is : " + task);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! No task at that position.");
        } finally {
            System.out.println("Finished checking index.\n");
        }
    }
    // 7. Show all tasks
    public void showTasks() {
        System.out.println("\nAll tasks: " + tasks);
        System.out.println("Task count: " + tasks.size());
    }
}
