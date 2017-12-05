package algs.localsearch.bruteforce;

public class BruteForce {

    private static final double START_X = -1;
    private static final double END_X = 2;
    // interval is (START_X, END_X)

    public double f(double x) {
        return -1 * (x-1) * (x-1) + 2;
    }

    public void bruteForceSearch() {

        double startingPoint = START_X;
        double max = f(startingPoint);
        double dx = 0.01;
        double maxX = START_X;

        for (double i = startingPoint; i < END_X; i += dx) {

            if (f(i) > max) {
                max = f(i);
                maxX = i;
            }
        }

        System.out.println("The maximum value is: " + max + " and max X is " + maxX );
    }
}
