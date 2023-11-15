package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnimalClassTest {

    @Test
    @DisplayName("Отсортировать животных по росту от самого маленького к самому большому")
    void sortedListByHeightTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        list.add(dog);
        list.add(cat);

        // when
        List<Animal> sortedList = Animal.sortedListByHeight(list);

        // then
        assertThat(sortedList.toString())
            .isEqualTo(
                "[Animal[name=Kitten, type=CAT, sex=F, age=8, height=20, weight=5, bites=false]," +
                    " Animal[name=Doggy, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]]");
    }

    @Test
    @DisplayName("Отсортировать животных по весу от самого тяжелого к самому легкому, выбрать k первых")
    void sortedListByWeightTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);

        int k = 2;

        // when
        List<Animal> sortedList = Animal.sortedListByWeight(list, k);

        // then
        assertThat(sortedList.toString())
            .isEqualTo(
                "[Animal[name=Doggy, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]," +
                    " Animal[name=Kitten, type=CAT, sex=F, age=8, height=20, weight=5, bites=false]]");
    }

    @Test
    @DisplayName("Сколько животных каждого вида")
    void mapTypeNumTest1() {
        // given
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

        // when
        Map<Animal.Type, Long> map = Animal.mapTypeNum(list);

        // then
        assertThat(map.toString())
            .isEqualTo("{SPIDER=1, DOG=3, CAT=2}");
    }

    @Test
    @DisplayName("У какого животного самое длинное имя")
    void maxNameTest1() {
        // given
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

        // when
        Animal name = Animal.maxName(list);

        // then
        assertThat(name.toString())
            .isEqualTo(
                "Animal[name=Spiky, type=SPIDER, sex=M, age=8, height=3, weight=1, bites=true]");
    }

    @Test
    @DisplayName("Каких животных больше: самцов или самок")
    void maxSexNumTest1() {
        // given
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

        // when
        Animal.Sex sex = Animal.maxSexNum(list);

        // then
        assertThat(sex.toString())
            .isEqualTo(
                "M");
    }

    @Test
    @DisplayName("Самое тяжелое животное каждого вида")
    void maxWeightByEveryTypeTest1() {
        // given
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

        // when
        Map<Animal.Type, Animal> map = Animal.maxWeightByEveryType(list);

        // then
        assertThat(map.toString())
            .isEqualTo(
                "{SPIDER=Animal[name=Spiky, type=SPIDER, sex=M, age=8, height=3, weight=1, bites=true]," +
                    " DOG=Animal[name=Eny Son, type=DOG, sex=M, age=3, height=30, weight=40, bites=false]," +
                    " CAT=Animal[name=Doggy, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]}");
    }

    @Test
    @DisplayName("K-е самое старое животное")
    void maxKAgeTest1() {
        // given
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

        int k = 3;

        // when
        Animal mAge = Animal.maxKAge(list, k);

        // then
        assertThat(mAge.toString())
            .isEqualTo(
                "Animal[name=Doggy, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]");
    }

    @Test
    @DisplayName("Самое тяжелое животное среди животных ниже k см")
    void heaviestAnimalTest1() {
        // given
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

        int k = 30;

        // when
        Optional<Animal> heaviest = Animal.heaviestAnimal(list, k);

        // then
        assertThat(heaviest.toString())
            .isEqualTo(
                "Optional[Animal[name=Doggy, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]]");
    }

    @Test
    @DisplayName("Сколько в сумме лап у животных в списке")
    void pawsNumTest1() {
        // given
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

        // when
        Integer count = Animal.pawsNum(list);

        // then
        assertThat(count)
            .isEqualTo(28);
    }

    @Test
    @DisplayName("Список животных, возраст у которых не совпадает с количеством лап")
    void listAnimalsWithNotEqualsAgeAndPawsTest1() {
        // given
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

        // when
        List<Animal> lst = Animal.listAnimalsWithNotEqualsAgeAndPaws(list);

        // then
        assertThat(lst.toString())
            .isEqualTo(
                "[Animal[name=Doggy, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]," +
                    " Animal[name=Kitten, type=CAT, sex=F, age=8, height=20, weight=5, bites=false]," +
                    " Animal[name=Bat, type=DOG, sex=F, age=1, height=15, weight=4, bites=false]," +
                    " Animal[name=Bully, type=DOG, sex=M, age=3, height=110, weight=25, bites=true]," +
                    " Animal[name=Eny Son, type=DOG, sex=M, age=3, height=30, weight=40, bites=false]]");
    }

    @Test
    @DisplayName("Список животных, которые могут укусить (bites == true) и рост которых превышает 100 см")
    void listBitedAnimalsTest1() {
        // given
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

        // when
        List<Animal> lst = Animal.listBitedAnimals(list);

        // then
        assertThat(lst.toString())
            .isEqualTo(
                "[Animal[name=Bully, type=DOG, sex=M, age=3, height=110, weight=25, bites=true]]");
    }

    @Test
    @DisplayName("Сколько в списке животных, вес которых превышает рост")
    void numAnimalsWeightMoreHeightTest1() {
        // given
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

        // when
        Long count = Animal.numAnimalsWeightMoreHeight(list);

        // then
        assertThat(count)
            .isEqualTo(1);
    }

    @Test
    @DisplayName("Список животных, имена которых состоят из более чем двух слов")
    void listAnimalsWithPluralNamesTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        Animal spider = new Animal("Spiky Freddy", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal bulldog = new Animal("Bully", Animal.Type.DOG, Animal.Sex.M, 3, 110, 25, true);
        Animal engbulldog = new Animal("Eny Son", Animal.Type.DOG, Animal.Sex.M, 3, 30, 40, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);
        list.add(spider);
        list.add(bulldog);
        list.add(engbulldog);

        // when
        List<Animal> lst = Animal.listAnimalsWithPluralNames(list);

        // then
        assertThat(lst.toString())
            .isEqualTo(
                "[Animal[name=Doggy Boss, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]," +
                    " Animal[name=Spiky Freddy, type=SPIDER, sex=M, age=8, height=3, weight=1, bites=true]," +
                    " Animal[name=Eny Son, type=DOG, sex=M, age=3, height=30, weight=40, bites=false]]");
    }

    @Test
    @DisplayName("Есть ли в списке собака ростом более k см")
    void isDogWithHeightKTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        Animal spider = new Animal("Spiky Freddy", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal bulldog = new Animal("Bully", Animal.Type.DOG, Animal.Sex.M, 3, 110, 25, true);
        Animal engbulldog = new Animal("Eny Son", Animal.Type.DOG, Animal.Sex.M, 3, 30, 40, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);
        list.add(spider);
        list.add(bulldog);
        list.add(engbulldog);

        int k = 100;

        // when
        boolean res = Animal.isDogWithHeightK(list, k);

        // then
        assertThat(res)
            .isEqualTo(true);
    }

    @Test
    @DisplayName("Найти суммарный вес животных каждого вида, которым от k до l лет")
    void sumWeightInRangeOfKtoLTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        Animal spider = new Animal("Spiky Freddy", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal bulldog = new Animal("Bully", Animal.Type.DOG, Animal.Sex.M, 3, 110, 25, true);
        Animal engbulldog = new Animal("Eny Son", Animal.Type.DOG, Animal.Sex.M, 3, 30, 40, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);
        list.add(spider);
        list.add(bulldog);
        list.add(engbulldog);

        int k = 8;
        int l = 10;

        // when
        Map<Animal.Type, Integer> res = Animal.sumWeightInRangeOfKtoL(list, k, l);

        // then
        assertThat(res)
            .isEqualTo("{CAT=5, SPIDER=1}");
    }

    @Test
    @DisplayName("Список животных, отсортированный по виду, затем по полу, затем по имени")
    void sortedListByTypeSexNameTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);

        list.add(dog);
        list.add(cat);
        list.add(puppy);

        // when
        List<Animal> lst = Animal.sortedListByTypeSexName(list);

        // then
        assertThat(lst.toString())
            .isEqualTo("[Animal[name=Doggy Boss, type=CAT, sex=M, age=5, height=25, weight=10, bites=false]," +
                " Animal[name=Kitten, type=CAT, sex=F, age=8, height=20, weight=5, bites=false]," +
                " Animal[name=Bat, type=DOG, sex=F, age=1, height=15, weight=4, bites=false]]");
    }

    @Test
    @DisplayName("Правда ли, что пауки кусаются чаще, чем собаки")
    void isSpidersBitesMoreThanDogsTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        Animal spider = new Animal("Spiky Freddy", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal bulldog = new Animal("Bully", Animal.Type.DOG, Animal.Sex.M, 3, 110, 25, true);
        Animal engbulldog = new Animal("Eny Son", Animal.Type.DOG, Animal.Sex.M, 3, 30, 40, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);
        list.add(spider);
        list.add(bulldog);
        list.add(engbulldog);

        // when
        boolean res = Animal.isSpidersBitesMoreThanDogs(list);

        // then
        assertThat(res)
            .isEqualTo(false);
    }

    @Test
    @DisplayName("Животные, в записях о которых есть ошибки: вернуть имя и список ошибок")
    void errorsInRecordsTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        list.add(dog);
        list.add(cat);

        // when
        Map<String, Set<ValidationError>> res = Animal.errorsInRecords(list);

        // then
        assertThat(res)
            .isEqualTo(Map.of("Doggy Boss", Set.of(),
                "Kitten", Set.of()
            ));
    }

    @Test
    @DisplayName("Найти самую тяжелую рыбку в 2-х или более списках")
    void heaviestFishInListsTest1() {
        // given
        List<Animal> list = new ArrayList<>();
        List<Animal> list2 = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, 8, 20, 5, false);
        Animal puppy = new Animal("Bat", Animal.Type.DOG, Animal.Sex.F, 1, 15, 4, false);
        Animal spider = new Animal("Spiky Freddy", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal bulldog = new Animal("Bully", Animal.Type.DOG, Animal.Sex.M, 3, 110, 25, true);
        Animal fish = new Animal("Eny Son", Animal.Type.FISH, Animal.Sex.M, 1, 3, 1, false);
        Animal fishA = new Animal("Spik", Animal.Type.FISH, Animal.Sex.M, 2, 3, 1, true);
        Animal fishB = new Animal("Bill", Animal.Type.FISH, Animal.Sex.M, 3, 7, 2, true);
        Animal fishC = new Animal("Son", Animal.Type.FISH, Animal.Sex.M, 1, 2, 0, false);
        list.add(dog);
        list.add(cat);
        list.add(puppy);
        list.add(spider);
        list.add(bulldog);
        list.add(fish);
        list2.add(fishB);
        list2.add(fishC);
        list2.add(fishA);

        // when
        Animal res = Animal.heaviestFishInLists(List.of(list, list2));

        // then
        assertThat(res.toString())
            .isEqualTo("Animal[name=Bill, type=FISH, sex=M, age=3, height=7, weight=2, bites=true]");
    }

    @Test
    @DisplayName("вернуть имя и названия полей с ошибками, объединенные в строку")
    void moreReadableResultTest1() {
        // given
        List<Animal> list = new ArrayList<>();

        Animal dog = new Animal("Doggy Boss", Animal.Type.CAT, Animal.Sex.M, 5, 25, 10, false);
        Animal cat = new Animal("Kitten", Animal.Type.CAT, Animal.Sex.F, -8, 20, 5, false);
        list.add(dog);
        list.add(cat);

        // when
        Map<String, String> res = Animal.moreReadableResult(list);

        // then
        assertThat(res.toString())
            .isEqualTo("{Doggy Boss=, Kitten=Age, height and weight must be more than 0}");
    }
}
