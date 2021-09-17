import java.util.Scanner;

public class Menu {	
	
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		boolean quit = false;
		String menu = "" + "1. Create a task \n" + "2. Mark as done\n" + "3. Remove task \n" + "4. Rename task\n"
				+ "5. Display\n\n" + "6. Quit\n\n";
		while (!quit) {
			Scanner sc = new Scanner(System.in);
			System.out.println(menu);
			int choice = sc.nextInt();
			ToDoList todo = new ToDoList();
			switch (choice) {
				case 1:
					todo.createTask();
					break;
				case 2:
					todo.isDone();
					break;
				case 3: 
					todo.remove();
					break;
				case 4:
					todo.rename();
					break;
				case 5:
					todo.display();
					break;
				case 6:
					quit=true;
					System.out.println("\nHave a nice day!");
					break;
					default: 
						System.out.println("Invalid entry try again");
			}
		}
		System.exit(0);
	}
}