package edu.hw4;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public record Animal(
    String name,
    Type type,
    Sex sex,
    int age,
    int height,
    int weight,
    boolean bites
) {

    enum Type {
        CAT, DOG, BIRD, FISH, SPIDER
    }

    enum Sex {
        M, F
    }

    public int paws() {
        return switch (type) {
            case CAT, DOG -> 4;
            case BIRD -> 2;
            case FISH -> 0;
            case SPIDER -> 8;
        };
    }

    //Task1
    public static List<Animal> sortedListByHeight(List<Animal> list) {
        return list.stream()
            .sorted(Comparator.comparingInt(Animal::height))
            .toList();

    }

    //Task2
    public static List<Animal> sortedListByWeight(List<Animal> list, int k) {
        return list.stream()
            .sorted(Comparator.comparingInt(Animal::weight)
                .reversed())
            .limit(k)
            .toList();
    }

    //Task3
    public static Map<Type, Long> mapTypeNum(List<Animal> list) {
        return list.stream()
            .collect(Collectors.groupingBy(
                Animal::type,
                Collectors.counting()
            ));
    }

    //Task4
    public static Animal maxName(List<Animal> list) {
        return list.stream()
            .max(Comparator.comparing(Animal::name))
            .orElse(null);
    }

    //Task5
    public static Animal.Sex maxSexNum(List<Animal> list) {
        return list.stream()
            .collect(Collectors.groupingBy(Animal::sex, Collectors.counting()))
            .entrySet()
            .stream().max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
    }

    //Task6
    public static Map<Animal.Type, Animal> maxWeightByEveryType(List<Animal> list) {
        return list.stream()
            .collect(Collectors.toMap(Animal::type, Function.identity(),
                BinaryOperator.maxBy(Comparator.comparing(Animal::weight))
            ));
    }

    //Task7
    public static Animal maxKAge(List<Animal> list, int k) {
        return list.stream()
            .sorted(Comparator.comparing(Animal::age)
                .reversed())
            .toList()
            .get(k - 1);
    }

    //Task8
    public static Optional<Animal> heaviestAnimal(List<Animal> list, int k) {
        return list.stream()
            .filter(animal -> animal.height < k)
            .max(Comparator.comparing(Animal::weight));
    }

    //Task9
    public static Integer pawsNum(List<Animal> list) {
        return list.stream()
            .mapToInt(Animal::paws)
            .sum();
    }

    //Task10
    public static List<Animal> listAnimalsWithNotEqualsAgeAndPaws(List<Animal> list) {
        return list.stream()
            .filter(x -> x.paws() != x.age())
            .toList();
    }

    //Task11
    public static List<Animal> listBitedAnimals(List<Animal> list) {
        return list.stream()
            .filter(x -> (x.bites() && x.height() >= 100))
            .toList();
    }

    //Task12
    public static Long numAnimalsWeightMoreHeight(List<Animal> list) {
        return list.stream()
            .filter(x -> x.weight() > x.height())
            .count();
    }

    //Task13
    public static List<Animal> listAnimalsWithPluralNames(List<Animal> list) {
        return list.stream()
            .filter(x -> (x.name().split(" ").length > 1))
            .toList();
    }

    //Task14
    public static Boolean isDogWithHeightK(List<Animal> list, int k) {
        return list.stream()
            .anyMatch(x -> (x.type() == Animal.Type.DOG && (x.height() > k)));
    }

    //Task15
    public static Map<Type, Integer> sumWeightInRangeOfKtoL(List<Animal> list, int k, int l) {
        return list.stream()
            .filter(animal -> animal.age >= k && animal.age <= l)
            .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(Animal::weight)));
    }

    //Task16
    public static List<Animal> sortedListByTypeSexName(List<Animal> list) {
        return list.stream()
            .sorted(Comparator.comparing(Animal::type)
                .thenComparing(Animal::sex)
                .thenComparing(Animal::name))
            .toList();
    }

    //Task17
    public static Boolean isSpidersBitesMoreThanDogs(List<Animal> list) {
        long bitingSpiders = list.stream().filter(animal -> animal.type == Type.SPIDER && animal.bites).count();
        long bitingDogs = list.stream().filter(animal -> animal.type == Type.DOG && animal.bites).count();
        if (bitingDogs == 0 && bitingSpiders == 0) {
            return false;
        } else {
            return bitingSpiders > bitingDogs;
        }
    }

    //Task18
    public static Animal heaviestFishInLists(List<List<Animal>> list) {
        return list.stream().flatMap(Collection::stream)
            .filter(animal -> animal.type == Type.FISH)
            .max(Comparator.comparingInt(Animal::weight))
            .orElse(null);
    }

    //Task19
    public static Map<String, Set<ValidationError>> errorsInRecords(List<Animal> list) {
        return list.stream()
            .collect(Collectors.toMap(Animal::name, Animal::validationErrors));
    }

    private static Set<ValidationError> validationErrors(Animal animal) {
        Set<ValidationError> validationErrors = new HashSet<>();
        if (animal.type == null || animal.name == null || animal.sex == null) {
            validationErrors.add(new ValidationError(
                "Type, name and sex must not be null", ValidationErrorType.NULL_VALUE));
        }
        if (animal.age <= 0 || animal.weight <= 0 || animal.height <= 0) {
            validationErrors.add(new ValidationError(
                "Age, height and weight must be more than 0", ValidationErrorType.INCORRECT_VALUE));
        }
        return validationErrors;
    }

    //Task20
    public static Map<String, String> moreReadableResult(List<Animal> list) {
        return errorsInRecords(list).entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, entry -> String.join(". ", entry.getValue().stream()
                .map(ValidationError::getMessage)
                .toList())));
    }

}
