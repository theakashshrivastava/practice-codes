package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepChar {
    public static void printFirstNonRepChar(String s)
    {
       Arrays.stream(s.split(""))
               .collect(Collectors.toMap(Function.identity(),
                       v->1,
                       Integer::sum,
                       LinkedHashMap::new))
               .entrySet()
               .stream()
               .filter(e->e.getValue()==1).findFirst()
               .ifPresent(e->System.out.println("First non-repeating character: "+e.getKey()));
    }

    public static void main(String[] args) {
        String s = "Java articles are awesome";
        printFirstNonRepChar(s);
    }
}
