package hashbench;

public class BadTester extends Tester {
	private final int mSize;

	public BadTester(final int aSize) {
		mSize = aSize;
	}

	@Override
	protected MyEntry createEntry(final int aValue) {
		return new MyEntry(aValue) {
			@Override
			public int hashCode() {
				return aValue % mSize;
			}
		};
	}
}
