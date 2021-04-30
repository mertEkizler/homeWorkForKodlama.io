package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirtName("Mert");
		instructor.setLastName("Ekizler");
		instructor.setNumberOfTrainingsGiven(2);
		
		Student student = new Student();
		student.setId(1);
		student.setFirtName("Sinan");
		student.setLastName("Taþkýnlar");
		student.setNumberOfCoursesTaken(2);
		
		UserManager userManager = new UserManager();
		
		User[] users = {student, instructor};
		
		for(User user:users) {
			System.out.println(user.getFirtName()+ " " + user.getLastName());
		}
		
		userManager.add(student);
		System.out.println(student.getFirtName());

	}

}