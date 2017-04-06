
public class ActiveSpecification extends AbstractSpecification<User> {

	@Override
	public boolean isSatisfiedBy(User condidate) {
		return condidate.isActive();
	}

}
