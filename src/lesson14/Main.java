package lesson14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Smith", "John", 25),
                new Person("Smith", "Alice", 30),
                new Person("Brown", "Michael", 25),
                new Person("Smith", "John", 20),
                new Person("Adams", "John", 30)
        );

        List<Person> filtered = people.stream()
                .filter(person -> person.getAge() >= 30)
                .collect(Collectors.toList());

//        filtered.forEach(System.out::println);


        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getLastName)
                        .thenComparing(Person::getFirstName)
                        .thenComparingInt(Person::getAge))
                .collect(Collectors.toList());

//        sorted.forEach(System.out::println);

        Map<Integer, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));


        groupedByAge.forEach((age, group) -> {
            System.out.println("Age: " + age);
            group.forEach(System.out::println);
        });












//        System.out.println(people);
//
//        people.sort(Comparator.comparing(Person::getAge));
//        people.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(people);

        // Поток из массива
        String[] names = {"Smith", "Brown", "Adams"};
        Stream<String> streamFromArray = Arrays.stream(names);

        // Поток из коллекции
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Stream<Integer> streamFromList = numbers.stream();

        // Бесконечный поток
        Stream<Integer> infinityStream = Stream.iterate(1, n -> n + 2).limit(10);
//        infinityStream.forEach(System.out::println);

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenNumbers = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

//        System.out.println(evenNumbers);

        List<String> strings = List.of("apple", "banana", "cherry");
        List<Integer> lengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
//        System.out.println(lengths);

        List<String> sentences = List.of("hello world", "java stream");
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

//        System.out.println(words);
//        System.out.println(sentences);

    }
}
