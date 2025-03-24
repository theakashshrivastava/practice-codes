package equals.hashcode;

import java.util.HashSet;
import java.util.Set;

public class CustomTeacher {
    public static void main(String[] args) {
        Set<Teacher> tSet = new HashSet<>();
        tSet.add(new Teacher("John","Bio"));
        tSet.add(new Teacher("John","Bio"));
        tSet.add(new Teacher("Johnny","Social"));
        tSet.add(new Teacher("Johnny","Social"));
        tSet.add(new Teacher("Adam","Maths"));
        tSet.add(new Teacher("Adam","Hindi"));

        System.out.println("Total teachers : " + tSet.size());
        System.out.println(tSet);
    }
}
