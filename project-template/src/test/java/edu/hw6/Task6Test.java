package edu.hw6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Arrays;
import static edu.hw6.Task6.checkPort;
import static edu.hw6.Task6.getPopularPortsInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task6Test {
    @Test
    @DisplayName("Проверка свободы порта")
    public void checkPortTest1() {
        //when
        int port = 49123;

        //then
        assertTrue(checkPort(port));
    }

    @Test
    @DisplayName("Проверка свободы порта")
    public void checkPortTest2() {
        //when
        int port = 49123;

        //then
        try (ServerSocket ignored = new ServerSocket(port)) {
            assertFalse(checkPort(port));
        } catch (IOException ignored) {
        }
    }
    @Test
    @DisplayName("Проверка свободы порта")
    public void checkPortTest3() {
        //when
        int port = 49123;

        //then
        try (DatagramSocket ignored = new DatagramSocket(port)) {
            assertFalse(checkPort(port));
        } catch (IOException ignored) {
        }
    }

    @Test
    @DisplayName("Проверка свободы порта")
    public void checkPortTest4() {
        assertThrows(IllegalArgumentException.class, () -> checkPort(Integer.MAX_VALUE));
        assertThrows(IllegalArgumentException.class, () -> checkPort(-1));
    }

    @Test
    @DisplayName("Вывод списка известных портов")
    public void getPopularPortsInfoTest1() {
        //when
        String portsInfo = getPopularPortsInfo();

        //then
        assertEquals(10, Arrays.stream(portsInfo.split("\n")).toArray().length);
        assertTrue(portsInfo.contains("Protocol") && portsInfo.contains("Port") && portsInfo.contains("Service"));
        assertTrue(portsInfo.contains("UDP") && portsInfo.contains("1900"));
    }
}
