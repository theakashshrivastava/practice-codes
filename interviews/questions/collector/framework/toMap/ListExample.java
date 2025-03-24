package interviews.questions.collector.framework.toMap;

import collections.practice.streams.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        Map<String,Integer> m1 = names.stream().collect(Collectors.toMap(String::toString, String::length));
        System.out.println(m1);
        m1.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        List<String> employees = List.of("HR", "Finance", "HR", "IT", "Finance", "HR");
        Map<String, Integer> m2 = employees.stream().collect(Collectors.toMap(
                String::toString,
                String->1,
                Integer::sum,
                LinkedHashMap::new));
        System.out.println(m2);
        m2.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        List<Person> pList = List.of(
                new Person(23, "Alice"),
                new Person(25, "Bob"),
                new Person(34, "Charlie")
        );

        Map<String,Integer> m3 = pList.stream().
                collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(m3);
        m3.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);
    }
}
