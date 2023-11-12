package edu.hw3.Task5;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Task5 {

    public static Collection<Contact> parseContacts(Collection<String> contacts, String way) {
        Comparator<Contact> sortOrder = createSortOrder(way);

        return contacts == null || contacts.isEmpty() ? List.of() : contacts.stream()
            .map(Task5::createContactFromString)
            .sorted(sortOrder)
            .toList();
    }

    public static Contact createContactFromString(String str) {

        if (str == null) {
            //throw new NullPointerException("Contact params are null!");
            return new Contact("", "");
        }

        if (str.contains(" ")) {
            String[] contactData = str.split(" ");

            return new Contact(contactData[0], contactData[1]);
        }

        return new Contact(str, "");
    }

    private static Comparator<Contact> createSortOrder(String way) {
        return switch (way) {
            case "ASC" -> Comparator.naturalOrder();
            case "DESC" -> Comparator.reverseOrder();
            default -> throw new IllegalArgumentException("Parameter must be only `ASC` or `DESC`!");
        };
    }
}
