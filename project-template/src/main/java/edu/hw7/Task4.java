package edu.hw7;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Task4 {

    private static final AtomicLong circleCount = new AtomicLong(0);

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

    public double calculatePIMultipleThread(long simulation, int numThreats) {
        if (simulation < 1) {
            throw new IllegalArgumentException("Simulation count must be more then 0");
        }
        if (numThreats < 1) {
            throw new IllegalArgumentException("Threats number must be more then 0");
        }

        List<Thread> threads = IntStream.range(0, numThreats)
            .mapToObj(i -> new Thread(() -> circleCount.addAndGet(LongStream.range(
                    i * simulation / numThreats,
                    (i + 1) * simulation / numThreats
                )
                .filter(l -> {
                    double dx = ThreadLocalRandom.current().nextDouble();
                    double dy = ThreadLocalRandom.current().nextDouble();
                    double distance = Math.sqrt(dx * dx + dy * dy);

                    return distance <= 1;
                }).count())))
            .toList();

        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException ignored) {
            }
        });

        return 4 * (circleCount.get() / (double) simulation);
    }
}
