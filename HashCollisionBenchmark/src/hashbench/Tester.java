package hashbench;

import java.util.HashSet;
import java.util.Set;

public abstract class Tester {
	protected static final int TEST_COUNT = 10000;

	protected abstract MyEntry createEntry(final int aValue);

	protected void execute() {
		MyEntry.CALLED_COUNT = 0;
		final Set<MyEntry> tList = new HashSet<>();
		final long tStart = System.currentTimeMillis();
		for (int i = 0; i < TEST_COUNT; i++) {
			tList.add(createEntry(i));
		}
		final long tFinish = System.currentTimeMillis();

		System.out.println(this.getClass().getName());
		System.out.println((tFinish - tStart) + " (ms)");
		System.out.println("equals called count = " + MyEntry.CALLED_COUNT);
		System.out.println();
	}
}
