package edu.hw4;

import java.util.ArrayList;
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

        //Examples
        Animal.sortedListByHeight(list).forEach(System.out::println);
        System.out.println();

        Animal.sortedListByWeight(list, 2).forEach(System.out::println);
        System.out.println();

        System.out.println(Animal.mapTypeNum(list));
        System.out.println();

        System.out.println(Animal.maxName(list) + "\n");

        System.out.println(Animal.pawsNum(list) + "\n");

        Animal.listAnimalsWithNotEqualsAgeAndPaws(list).forEach(System.out::println);
        System.out.println();

        Animal.listBitedAnimals(list).forEach(System.out::println);
        System.out.println();

        System.out.println(Animal.numAnimalsWeightMoreHeight(list) + "\n");

        Animal.listAnimalsWithPluralNames(list).forEach(System.out::println);
        System.out.println();

        int k_14 = 100;
        System.out.println(Animal.isDogWithHeightK(list, k_14) + "\n");

        Animal.sortedListByTypeSexName(list).forEach(System.out::println);
        System.out.println();
    }
}
