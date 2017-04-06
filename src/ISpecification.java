
public interface ISpecification<T> {
	boolean isSatisfiedBy(T condidate);
	ISpecification<T> and(ISpecification<T> specification);
	ISpecification<T> or(ISpecification<T> specification);
	ISpecification<T> not();
}
