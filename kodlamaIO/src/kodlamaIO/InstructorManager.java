package kodlamaIO;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirtName()+ " " + user.getLastName() + " eklendi.");
	}
	
	public void addCourse() {
		System.out.println("kurs eklendi.");
	}
}
