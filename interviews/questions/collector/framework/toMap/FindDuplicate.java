package interviews.questions.collector.framework.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 2, 3, 6, 3, 6, 1);

        Map<Integer,Integer> map =
        aList.stream().collect(Collectors.toMap(i->i, i->1,Integer::sum));

        map.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);

        map.forEach((k,v) -> {
            if (v > 1){
                System.out.println("Duplicate key: "+k+" value: "+v);
            }
        });
    }
}
