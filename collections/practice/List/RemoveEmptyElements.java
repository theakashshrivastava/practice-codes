package collections.practice.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEmptyElements {
    public static void main(String[] args) {
        List<String> iL = new ArrayList<>();
        iL.add("A");
        iL.add("");
        iL.add("");
        iL.add("D");
        System.out.println(iL);

        List<Integer> iL1 = new ArrayList<>();
        iL1.add(1);
        iL1.add(null);
        iL1.add(null);
        iL1.add(11);

        List<Character> iL2 = new ArrayList<>();
        iL2.add('X');
        iL2.add('Y');
        iL2.add('\0');

        //Remove empty elements from List
        iL.removeIf(String::isEmpty);
        System.out.println(iL);

        iL1.removeIf(i->i==null);
        System.out.println(iL1);

        iL2.removeIf(Character::isDefined);
        System.out.println(iL2);

    }
}
