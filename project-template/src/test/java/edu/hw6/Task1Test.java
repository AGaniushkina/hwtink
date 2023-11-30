package edu.hw6;

import edu.hw6.Task1.DiskMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test {
    @Test
    @DisplayName("Сохранение файла")
    public void saveToDiskTest1() {
        //given
        DiskMap diskMap = new DiskMap("task1test.txt");

        //when
        diskMap.put("testKey", "testValue");

        //the
        assertTrue(diskMap.saveToDisk());
    }

    @Test
    @DisplayName("Загрузка файла")
    public void loadFromDiskTest1() {
        //given
        DiskMap diskMap = new DiskMap("task1test.txt");

        //when
        diskMap.loadFromDisk();

        //then
        assertEquals("testValue", diskMap.get("testKey"));
    }
}
