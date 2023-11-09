package edu.hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        Animal spider = new Animal("Spiky", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal bulldog = new Animal("Bully", Animal.Type.DOG, Animal.Sex.M, 3, 110, 25, true);
        Animal engbulldog = new Animal("Eny Son", Animal.Type.DOG, Animal.Sex.M, 3, 30, 40, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);
        list.add(spider);
        list.add(bulldog);
        list.add(engbulldog);

        //Tast1
        List<Animal> sortedListByHeight =
            list.stream().sorted(Comparator.comparingInt(Animal::height)).toList();
        sortedListByHeight.forEach(System.out::println);
        System.out.println();

        //Task2
        int k = 2;
        List<Animal> sortedListByWeight =
            list.stream().sorted(Comparator.comparingInt(Animal::weight).reversed()).limit(k)
                .toList();
        sortedListByWeight.forEach(System.out::println);
        System.out.println();

        //Task3
        //Map<Animal.Type, Integer> mapTypeNum = list.stream().collect(Collectors.toMap(Animal::type, value -> 1, Integer::sum));

        //Task4
        Animal maxName = list.stream().max(Comparator.comparing(Animal::name)).get();
        System.out.println(maxName + "\n");

        //Task5
        //Animal.Sex maxSexNum = list.stream();

        //Task6
        //Map<Animal.Type, Animal> maxWeightByEveryType = list.stream().collect(Collectors.toMap(Animal::type, Collectors.counting()));

        //Task7
        k = 3;
        Animal maxKAge =
            list.stream().sorted(Comparator.comparing(Animal::age).reversed()).toList().get(k - 1);
        System.out.println(maxKAge + "\n");

        //Task8

        //Task9
        Integer pawsNum = list.stream().mapToInt(Animal::paws).sum();
        System.out.println(pawsNum + "\n");

        //Task10
        List<Animal> listAnimalsWithNotEqualsAgeAndPaws =
            list.stream().filter(x -> x.paws() != x.age()).toList();
        listAnimalsWithNotEqualsAgeAndPaws.forEach(System.out::println);
        System.out.println();

        //Task11
        List<Animal> listBitedAnimals =
            list.stream().filter(x -> (x.bites() && x.height() >= 100)).toList();
        listBitedAnimals.forEach(System.out::println);
        System.out.println();

        //Task12
        Long numAnimalsWeightMoreHeight =
            list.stream().filter(x -> x.weight() > x.height()).count();
        System.out.println(numAnimalsWeightMoreHeight + "\n");

        //Task13
        List<Animal> listAnimalsWithPluralNames =
            list.stream().filter(x -> (x.name().split(" ").length > 1)).toList();
        listAnimalsWithPluralNames.forEach(System.out::println);
        System.out.println();

        //Task14
        int k_14 = 100;
        Boolean isDogWithHeightK = list.stream().anyMatch(x -> (x.type() == Animal.Type.DOG && (x.height() > k_14)));
        System.out.println(isDogWithHeightK + "\n");

        //Task15
//        int k_15 = 1;
//        int l_15 = 5;
//        Map<Animal.Type, Integer> mapSummerWeight =
//            list.stream()
//                .filter(x -> (x.age() > k_15 && x.age() < l_15))
//                .collect(Collectors.toMap());

        //Task16
        List<Animal> sortedListByTypeSexName =
            list.stream()
                .sorted(Comparator.comparing(Animal::type).thenComparing(Animal::sex).thenComparing(Animal::name))
                .toList();
        sortedListByTypeSexName.forEach(System.out::println);
        System.out.println();

        //Task17

    }
}
