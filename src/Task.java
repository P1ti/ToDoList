import java.util.Date;

public class Task {
	private int id;
	private String name;
	private Date deadline;
	private Boolean isDone;
	
	public Task(int id, String name, Date deadline, Boolean isDone) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.isDone = isDone;
	}
	
	public void setNewName(String name) {
		this.name = name;
	}
	
	public void setAsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getDeadLine() {
		return deadline;
	}
	
	public boolean isDone() {
		return isDone;
	}
}
