package edu.hw2;

import edu.hw2.Task3.Connection;
import edu.hw2.Task3.ConnectionManager;
import edu.hw2.Task3.DefaultConnectionManager;
import edu.hw2.Task3.FaultyConnection;
import edu.hw2.Task3.FaultyConnectionManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {
    @Test
    @DisplayName("Установка соединения по умолчанию")
    void getConnectionDefaultConnectionTest() {
        //given
        ConnectionManager connectionManager = new DefaultConnectionManager();

        //when
        Connection connection = connectionManager.getConnection();

        //then
        assertThat(connection).isInstanceOf(Connection.class);
    }

    @Test
    @DisplayName("Установка проблемного соединения")
    void getConnectionFaultyConnectionTest() {
        //given
        ConnectionManager connectionManager = new FaultyConnectionManager();

        //when
        Connection connection = connectionManager.getConnection();

        //then
        assertThat(connection).isInstanceOf(FaultyConnection.class);
    }
}
