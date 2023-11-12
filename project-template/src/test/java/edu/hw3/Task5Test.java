package edu.hw3;

import edu.hw3.Task5.Contact;
import edu.hw3.Task5.Task5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {

    @Test
    @DisplayName("Список контактов")
    void parseContactsTest1() {
        // given
        List<String> list = List.of("John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes");

        // when
        List<Contact> contacts = Task5.parseContacts(list, "ASC").stream().toList();

        // then
        assertThat(contacts.toString())
            .isEqualTo("[Thomas Aquinas, Rene Descartes, David Hume, John Locke]");
    }

    @Test
    @DisplayName("Список контактов")
    void parseContactsTest2() {
        // given
        List<String> list = List.of("Paul Erdos", "Leonhard Euler", "Carl Gauss");

        // when
        List<Contact> contacts = Task5.parseContacts(list, "DESC").stream().toList();

        // then
        assertThat(contacts.toString())
            .isEqualTo("[Carl Gauss, Leonhard Euler, Paul Erdos]");
    }
    @Test
    @DisplayName("Список контактов")
    void parseContactsTest3() {
        // given
        List<String> list = List.of();

        // when
        List<Contact> contacts = Task5.parseContacts(list, "DESC").stream().toList();

        // then
        assertThat(contacts.toString())
            .isEqualTo("[]");
    }

    @Test
    @DisplayName("Список контактов")
    void parseContactsTest4() {
        // when
        List<Contact> contacts = Task5.parseContacts(null, "DESC").stream().toList();

        // then
        assertThat(contacts.toString())
            .isEqualTo("[]");
    }
}
