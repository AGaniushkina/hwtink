package edu.hw3.Task5;

import org.jetbrains.annotations.NotNull;

public class Contact implements Comparable<Contact> {
    private final String name;
    private final String surname;

    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(@NotNull Contact o) {
        if (this.surname.isEmpty() || o.surname.isEmpty()) {
            return this.name.compareTo(o.name);
        } else {
            return this.surname.compareTo(o.surname);
        }
    }

    public String toString() {
        return name + " " + (!surname.isEmpty() ? surname : "");
    }
}
