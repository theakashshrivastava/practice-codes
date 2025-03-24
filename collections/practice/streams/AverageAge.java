package collections.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class AverageAge {
    public static void averageAge(List<Person> p)
    {
        p.stream().mapToInt(Person::getAge).average().ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        List<Person> pList = new ArrayList<Person>();
        Person p1 = new Person(31,"Akash");
        Person p2 = new Person(41,"Ankur");
        Person p3 = new Person(51,"Abhijeet");
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        averageAge(pList);
    }
}
