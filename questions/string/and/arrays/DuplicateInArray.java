package interviews.questions.string.and.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInArray {
    public static void printDuplicate(int[] a)
    {
        Arrays.stream(a).boxed().collect(Collectors.toMap(x->x, x->1, Integer::sum))
                .entrySet().stream().filter(e->e.getValue()>1)
                .forEach(e-> System.out.println(e.getKey()));
    }
    public static void main(String[] args) {
        int[] a = {5, 5, 6, 7, 8, 8, 9};
        printDuplicate(a);
    }
}
