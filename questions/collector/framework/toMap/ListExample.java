package interviews.questions.collector.framework.toMap;

import collections.practice.streams.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        names.stream().collect(Collectors.toMap(Function.identity(), String::length))
                        .entrySet().forEach(System.out::println);

        names.stream().collect(Collectors.toMap(Function.identity(), String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        List<String> employees = List.of("HR", "Finance", "HR", "IT", "Finance", "HR");
                employees.stream().collect(Collectors.toMap(Function.identity(),
                String->1,
                Integer::sum,
                LinkedHashMap::new))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .ifPresent(System.out::println);

        List<Person> pList = List.of(
                new Person(23, "Alice"),
                new Person(25, "Bob"),
                new Person(34, "Charlie")
        );

        pList.stream().
                collect(Collectors.toMap(Person::getName, Person::getAge))
                .entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
    }
}
