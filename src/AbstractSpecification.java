
public abstract class AbstractSpecification<T> implements ISpecification<T> {

	@Override
	public abstract boolean isSatisfiedBy(T condidate);

	@Override
	public ISpecification<T> and(ISpecification<T> specification) {
		return new AndSpecification<>(this, specification);
	}

	@Override
	public ISpecification<T> or(ISpecification<T> specification) {
		return new OrSpecification<>(this, specification);
	}

	@Override
	public ISpecification<T> not() {
		return new NotSpecification<>(this);
	}

}
