package sequenced.collection;

import java.util.*;

public class SequenceDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> navDemo = new TreeSet<>();
        navDemo.add(11);
        navDemo.add(10);
        navDemo.add(42);

        Iterator it = navDemo.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        navDemo.pollFirst();
        System.out.println(navDemo.size());

        NavigableMap<Character,Integer> m1 = new TreeMap<>();
        m1.put('R',10);
        m1.put('O',21);
        m1.put('Q',34);

        System.out.println(m1.descendingMap());

        Map<Integer,Character> m2 = new HashMap<>();
        m2.put(11,'A');
        m2.put(21,'E');
        m2.put(13,'V');
        System.out.println(m2.entrySet());
    }
}
