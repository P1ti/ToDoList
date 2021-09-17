import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
	public String topic;
	public static List<Task> tasks = new ArrayList<Task>();
	
	public void createTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter task id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter task name");
		String taskName = sc.nextLine();
		System.out.println("Please enter due date dd/MM/yyyy");
		Date d = null;
		try {
			d = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Task t = new Task(id, taskName, d, false);
		tasks.add(t);
		System.out.println(" \n New entry added! \n");
	}
	
	public void display() {
		System.out.println("\n");
		for (int i=0;i<tasks.size();i++) {
			System.out.println("Task id: " + tasks.get(i).getId() +  ". Task name: " + tasks.get(i).getName() + ". Task due date: " + tasks.get(i).getDeadLine() + ". " + tasks.get(i).isDone());
		}
		System.out.println("\n");
	}
	
	public void rename() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSelect an item by entering his id");
		int id = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<tasks.size();i++) {
			if (tasks.get(i).getId() == id) {
				String name = sc.nextLine();
				tasks.get(i).setNewName(name);
			}
		}
		System.out.println("\nTask renamed\n");
	}
	
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSelect an item by entering his id");
		int id = sc.nextInt();
		for (int i=0;i<tasks.size();i++) {
			if (tasks.get(i).getId() == id) {
				tasks.remove(i);
			}
		}
		System.out.println("\nTask removed\n");
	}
	
	public void isDone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSelect an item by entering his id");
		int id = sc.nextInt();
		for (int i=0;i<tasks.size();i++) {
			if (tasks.get(i).getId() == id) {
				tasks.get(i).setAsDone(true);;
			}
		}
		System.out.println("\nTask done\n");
	}
}
