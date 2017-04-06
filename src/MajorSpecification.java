
public class MajorSpecification extends AbstractSpecification<User> {

	@Override
	public boolean isSatisfiedBy(User condidate) {
		return condidate.getAge() > 18;
	}

}
