package collections.practice.map;

import java.util.*;

public class CreateMap {
    public static void main(String[] args) {
        //HashMap
        Map<Character,Integer> h1 = new HashMap<>();
        h1.put('R',11);
        h1.put('B',51);
        h1.put('P',31);
        h1.put('A',21);
            //Iteration using forEach
        System.out.println("Iterating HashMap using forEach");
        h1.forEach((key,value)->{
            System.out.println(key + "::" + value);
        });

        //TreeMap
        Map<Character,Integer> t1 = new TreeMap<>();
        t1.put('U',33);
        t1.put('A',54);
        t1.put('Z',22);
            //Iteration using Map.Entry
        System.out.println("Iterating TreeMap using Map.Entry");
        for(Map.Entry<Character,Integer> x : t1.entrySet())
        {
            System.out.println(x.getKey() + "::" + x.getValue());
        }

        //LinkedHashMap
        Map<Character,Integer> l1 = new LinkedHashMap<>();
        l1.put('B',56);
        l1.put('A',34);
        l1.put('D',55);
        l1.put('C',79);
            //Iteration using iterator
        Iterator it = l1.keySet().iterator();
        System.out.println("Iterating keys of LinkedHashMap using Iterator");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        Iterator it1 = l1.values().iterator();
        System.out.println("Iterating values of LinkedHashMap using Iterator");
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}
