package heignamerican.benchmark.hashcollision;

public class TestProgram {
	public static void main(final String[] args) {
		new GoodTester().execute();
		new BadTester(100).execute();
		new BadTester(10).execute();
		new DamedameTester().execute();
	}
}
