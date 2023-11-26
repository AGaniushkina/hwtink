package edu.hw7.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Task3 implements PersonDatabase {

    private final Map<Integer, Person> database = new HashMap<>();
    private final ReadWriteLock locker = new ReentrantReadWriteLock();

    @Override
    public void add(Person person) {
        locker.writeLock().lock();

        try {
            database.put(person.id(), person);

        } finally {
            locker.writeLock().unlock();
        }
    }

    @Override
    public void delete(int id) {

        locker.writeLock().lock();

        try {
            database.remove(id);

        } finally {
            locker.writeLock().unlock();
        }

    }

    @Override
    public List<Person> findByName(String name) {
        locker.readLock().lock();

        try {
            return database.values()
                .stream()
                .parallel()
                .filter(person -> person.name() != null
                    && person.address() != null
                    && person.phoneNumber() != null
                    && person.name().equals(name))
                .toList();
        } finally {
            locker.readLock().unlock();
        }
    }

    @Override
    public List<Person> findByAddress(String address) {
        locker.readLock().lock();

        try {
            return database.values()
                .stream()
                .parallel()
                .filter(person -> person.name() != null
                    && person.address() != null
                    && person.phoneNumber() != null
                    && person.address().equals(address))
                .toList();
        } finally {
            locker.readLock().unlock();
        }
    }

    @Override
    public List<Person> findByPhone(String phone) {
        locker.readLock().lock();

        try {
            return database.values()
                .stream()
                .parallel()
                .filter(person -> person.name() != null
                    && person.address() != null
                    && person.phoneNumber() != null
                    && person.phoneNumber().equals(phone))
                .toList();
        } finally {
            locker.readLock().unlock();
        }
    }
}
