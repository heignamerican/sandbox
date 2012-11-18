package heignamerican.benchmark.hashcollision;

public abstract class MyEntry {
	public static int CALLED_COUNT = 0;

	protected final int mId;

	public MyEntry(final int aId) {
		mId = aId;
	}

	@Override
	public boolean equals(final Object aObj) {
		CALLED_COUNT++;
		if (!(aObj instanceof MyEntry))
			return false;
		return mId == ((MyEntry) aObj).mId;
	}

	public abstract int hashCode();
}
