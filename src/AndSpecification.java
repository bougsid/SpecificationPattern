
public class AndSpecification<T> extends AbstractSpecification<T> {

	private ISpecification<T> one;
	private ISpecification<T> other;

	public AndSpecification(ISpecification<T> one, ISpecification<T> other) {
		super();
		this.one = one;
		this.other = other;
	}

	@Override
	public boolean isSatisfiedBy(T condidate) {
		return this.one.isSatisfiedBy(condidate) && this.other.isSatisfiedBy(condidate);
	}

}
