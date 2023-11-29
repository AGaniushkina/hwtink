package edu.hw7;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class Task4 {

    private static final AtomicLong totalCount = new AtomicLong(0);

    public double calculatePISingleThread(long simulation) {
        if (simulation < 1) {
            throw new IllegalArgumentException("Simulation count must be more then 0");
        }

        long circleCount1 = 0L;
        long totalCount1 = 0L;

        Random random = new Random();

        for (int i = 0; i < simulation; i++) {

            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <= 1) {
                circleCount1++;
            }
            totalCount1++;
        }

        return 4 * (circleCount1 / (double) totalCount1);
    }

    public static double calculatePIMultipleThread(int simulation, int numThreats) throws Exception {
        //int totalCount;
        if (simulation < 1) {
            throw new IllegalArgumentException("Simulation count must be more then 0");
        }
        if (numThreats < 1) {
            throw new IllegalArgumentException("Threats number must be more then 0");
        }
        try (
            ExecutorService executorService = Executors.newFixedThreadPool(numThreats)) {
            Future<Integer>[] future = new Future[numThreats];
            for (int i = 0; i < numThreats; i++) {
                future[i] = executorService.submit(() -> simulatePoints(simulation / numThreats));
            }

            for (int i = 0; i < numThreats; i++) {
                totalCount.addAndGet(future[i].get());
            }
            executorService.shutdown();
        }

        return 4.0 * totalCount.get() / simulation;
    }

    private static int simulatePoints(int iterations) {
        int circleCount = 0;
        for (int i = 0; i < iterations; i++) {
            double x = ThreadLocalRandom.current().nextDouble(-1, 1);
            double y = ThreadLocalRandom.current().nextDouble(-1, 1);

            if (x * x + y * y <= 1) {
                circleCount++;
            }
        }
        return circleCount;
    }
}
