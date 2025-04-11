import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner jas = new Scanner(System.in);
        try {
            manager.addTask("Do laundry");
            manager.addTask("Write homework");
            manager.addTask("Buy milk");
            manager.addTask("Sell milk");
            manager.addTask("Mopping");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        manager.sortTasks();
        manager.showTasks();
        // 1. Search for a task
        System.out.print("\nEnter a task to search: ");
        String userSearch = jas.nextLine();
        manager.searchTask(userSearch);
        // 2. Remove a task
        System.out.print("\nEnter a task to remove: ");
        String userRemove = jas.nextLine();
        manager.removeTask(userRemove);
        // 4. Get task by index
        System.out.print("\nEnter an index to view a task: ");
        int userIndex = -1;
        try {
            userIndex = Integer.parseInt(jas.nextLine());
            manager.getTaskByIndex(userIndex);
        } catch (NumberFormatException e) {
            System.out.println("Error: You must enter a number.\n");
        }
        // 3. Show longest task
        manager.findLongestTask();
        manager.showTasks();
        System.out.println("\nThanks for being with me !!");
        jas.close();
    }
}
