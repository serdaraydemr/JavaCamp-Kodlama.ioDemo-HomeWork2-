package kodlama.IoDemo;


public class Main {

	public static void main(String[] args) {
		Student student = new Student ();
		student.id = 395234;
		student.firstName = "Fatih Serdar";
		student.lastName = "Aydemir";
		
		Instructor ınstructor = new Instructor ();
		ınstructor.id = 0001;
		ınstructor.firstName = "Engin";
		ınstructor.lastName = "Demiroğ";
	
		
		UserManager userManager = new UserManager ();
		User [] users = {student, ınstructor};
		userManager.addMultiple(users);
		
		LogManager logManager = new LogManager();
		logManager.add(new DataBaseLogger());
		logManager.add(new EmailLogger());
		
		
		System.out.println("******************************");
		
		userManager.delete(student);
		userManager.delete(ınstructor);
		
		logManager.add(new DataBaseLogger());
		logManager.add(new EmailLogger());
		
		System.out.println("******************************");
		
		userManager.upDate(student);
		userManager.upDate(ınstructor);
		
		logManager.add(new DataBaseLogger());
		logManager.add(new EmailLogger());
		
		
		
		
		
		
		
		
		
		
		

	}

}
