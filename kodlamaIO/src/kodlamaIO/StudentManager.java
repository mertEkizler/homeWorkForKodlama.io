package kodlamaIO;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirtName()+ " " + user.getLastName() + " eklendi.");
	}
}
