package edu.hw7.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3Synchronized implements PersonDatabase {
    private final Map<Integer, Person> database = new HashMap<>();
    private final Object locker = new Object();

    @Override
    public void add(Person person) {

        synchronized (locker) {
            database.put(person.id(), person);
        }
    }

    @Override
    public void delete(int id) {

        synchronized (locker) {
            database.remove(id);
        }
    }

    @Override
    public List<Person> findByName(String name) {
        synchronized (locker) {
            return database.values()
                .stream()
                .parallel()
                .filter(person -> person.name() != null
                    && person.address() != null
                    && person.phoneNumber() != null
                    && person.name().equals(name))
                .toList();
        }
    }

    @Override
    public List<Person> findByAddress(String address) {
        synchronized (locker) {
            return database.values()
                .stream()
                .parallel()
                .filter(person -> person.name() != null
                    && person.address() != null
                    && person.phoneNumber() != null
                    && person.address().equals(address))
                .toList();
        }
    }

    @Override
    public List<Person> findByPhone(String phone) {
        synchronized (locker) {
            return database.values()
                .stream()
                .parallel()
                .filter(person -> person.name() != null
                    && person.address() != null
                    && person.phoneNumber() != null
                    && person.phoneNumber().equals(phone))
                .toList();
        }
    }
}
