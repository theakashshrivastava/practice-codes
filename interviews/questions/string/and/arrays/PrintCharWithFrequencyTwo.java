package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintCharWithFrequencyTwo {
    public static void main(String[] args) {
        List<String> num = Arrays.asList("a","b","s","a","p","o","a","p");

        Map<String,Integer> m2 = num.stream().collect(Collectors.toMap(String::toString,String->1,Integer::sum));
        m2.forEach((k,v)->{
            if(v==2){
                System.out.println(k);
            }
        });
    }
}
