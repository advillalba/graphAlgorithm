package bruteForceSearch;

public class BruteForce {

	private static final double START_X = -1;
	private static final double END_X = 2;

	// interval is [START_X, END_X]
	public double y(double x) {
		return (x - 1) * (x - 1);
	}

	public void bruteForceSearch() {
		double startingPointX = START_X;
		double min = y(startingPointX);
		double dx = 0.01;
		double minX = START_X;

		for (double i = startingPointX; i < END_X; i += dx) {
			if (y(i) < min) {
				min = y(i);
				minX = i;
			}
			
		}
		System.out.println("The minimum value is  f(x) = "+min+" and x = "+minX);

	}
}
