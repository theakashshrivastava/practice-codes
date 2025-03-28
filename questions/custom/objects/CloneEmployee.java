package interviews.questions.custom.objects;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CloneEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(11,"Akash",33,80000,"M","IT","Gwalior");

        Employee e2 = Stream.of(e1).
                map(e -> new Employee(0,e1.getName(),e1.getAge(),0,e1.getGender(),e1.getDeptName(),"null"))
                        .findAny().orElse(null);
        System.out.println(e2);
    }
}
