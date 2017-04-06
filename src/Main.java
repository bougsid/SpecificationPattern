
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Ayoub");
		user.setAge(18);
		user.setActive(true);

		MajorSpecification majorSpecification = new MajorSpecification();
		ActiveSpecification activeSpecification = new ActiveSpecification();

		if (majorSpecification.or(activeSpecification).isSatisfiedBy(user))
			System.out.println("User Active or Major or both");

		if(majorSpecification.not().isSatisfiedBy(user))
			System.out.println("Not Major");
		
	}

}
