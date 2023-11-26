package hw7;

import edu.hw7.task3.Person;
import edu.hw7.task3.Task3;
import edu.hw7.task3.Task3Synchronized;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    @DisplayName("Поиск людей по атрибутам")
    void calculatePISingleThreadTest1() {
        // given
        Person person1 = new Person(1, null, "SSU", "89455550124");
        Person person2 = new Person(2, "Petr", null, "88456795810");
        Person person3 = new Person(3, "Ivan", "SSU 12", null);
        Person person4 = new Person(4, "Olga", null, "89253461879");

        Task3 service = new Task3();
        Task3Synchronized serviceSynchronized = new Task3Synchronized();

        // when
        service.add(person1);
        service.add(person2);
        service.add(person3);
        service.add(person4);
        serviceSynchronized.add(person1);
        serviceSynchronized.add(person2);
        serviceSynchronized.add(person3);
        serviceSynchronized.add(person4);

        // then
        assertEquals(0, service.findByAddress("SSU").size());
        assertEquals(0, service.findByName("Olga").size());
        assertEquals(0, service.findByPhone("89253461879").size());

        assertEquals(0, serviceSynchronized.findByAddress("SSU").size());
        assertEquals(0, serviceSynchronized.findByName("Olga").size());
        assertEquals(0, serviceSynchronized.findByPhone("89253461879").size());
    }

    @Test
    @DisplayName("Поиск людей по атрибутам")
    void calculatePISingleThreadTest2() {
        // given
        Person person1 = new Person(1, "Julia", "SSU", "89455550124");
        Person person2 = new Person(2, "Petr", "SSU 8", "88456795810");
        Person person3 = new Person(3, "Ivan", "SSU 12", "89674502856");
        Person person4 = new Person(4, "Olga", "SSU 9", "89253461879");

        Task3 service = new Task3();
        Task3Synchronized serviceSynchronized = new Task3Synchronized();

        // when
        service.add(person1);
        service.add(person2);
        service.add(person3);
        service.add(person4);
        serviceSynchronized.add(person1);
        serviceSynchronized.add(person2);
        serviceSynchronized.add(person3);
        serviceSynchronized.add(person4);

        // then
        assertEquals(1, service.findByAddress("SSU").size());
        assertEquals(1, service.findByName("Olga").size());
        assertEquals(1, service.findByPhone("89253461879").size());

        assertEquals(1, serviceSynchronized.findByAddress("SSU").size());
        assertEquals(1, serviceSynchronized.findByName("Olga").size());
        assertEquals(1, serviceSynchronized.findByPhone("89253461879").size());
    }

}
