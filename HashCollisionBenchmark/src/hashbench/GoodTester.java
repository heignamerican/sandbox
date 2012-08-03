package hashbench;

public class GoodTester extends Tester {
	@Override
	protected MyEntry createEntry(final int aValue) {
		return new MyEntry(aValue) {
			@Override
			public int hashCode() {
				return aValue;
			}
		};
	}
}
