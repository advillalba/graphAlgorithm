package randomSearch;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StochasticSearch {

	private Random random = new Random();
	private static final double START_X = -2;
	private static final double END_X = 2;

	private double y(double x) {
		return (x + 1) * (x + 1) - 3;
	}

	public void stochastiSearch() {
		double startPointX = START_X;
		double min = y(startPointX);
		double minX = START_X;

		for (int i = 0; i < 100000; i++) {
			double randomX = ThreadLocalRandom.current().nextDouble(START_X, END_X);

			if (y(randomX) < min) {
				min = y(randomX);
				minX = randomX;

			}
		}
		System.out.println("The minimum is y(x) = " + min + " the x point is = " + minX);
	}
}
