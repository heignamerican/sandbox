package heignamerican.benchmark.hashcollision;

public class DamedameTester extends Tester {
	@Override
	protected MyEntry createEntry(final int aValue) {
		return new MyEntry(aValue) {
			@Override
			public int hashCode() {
				return 1;
			}
		};
	}
}
