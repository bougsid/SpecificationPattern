
public class NotSpecification<T> extends AbstractSpecification<T> {

	private ISpecification<T> one;

	public NotSpecification(ISpecification<T> one) {
		super();
		this.one = one;
	}

	@Override
	public boolean isSatisfiedBy(T condidate) {
		return !this.one.isSatisfiedBy(condidate);
	}

}
