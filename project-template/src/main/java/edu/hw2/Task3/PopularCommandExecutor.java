package edu.hw2.Task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;
    private static final Logger LOGGER = LogManager.getLogger();
    private final ConnectionException exception;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
        exception = null;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) {
        for (int i = 0; i < maxAttempts; i++) {
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                return;
            } catch (Exception e) {
                LOGGER.info(e);
                assert exception != null;
                exception.addSuppressed(e);
            }
        }
        assert exception != null;
        throw exception;
    }
}



