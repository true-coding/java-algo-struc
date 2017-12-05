package algs.localsearch.stochastic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StochasticSearch {

    private Random random;
    private static final double START_X = -1;
    private static final double END_X = 2;

    public StochasticSearch() {
        this.random = new Random();
    }

    private double f(double x) {
        return (x-1) * (x-1) -1;
    }

    public void stochasticSearch() {

        double startingPointX = START_X;
        double min = f(startingPointX);
        double minX = START_X;

        for (int i = 0; i < 1000; i++) {

            double randomX = ThreadLocalRandom.current().nextDouble(START_X, END_X);

            if (f(randomX) < min) {
                min = f(randomX);
                minX = randomX;
            }
        }

        System.out.println("Min value found: " + min + " minX is: " + minX);
    }
}
