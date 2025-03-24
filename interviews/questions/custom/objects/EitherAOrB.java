package interviews.questions.custom.objects;

import java.util.List;
import java.util.stream.Collectors;

public class EitherAOrB {
    public static void main(String[] args) {
        List<Employee> e = EmployeeList.getEmployees();

        List<Employee> e1;

        e1 = e.stream().filter(x-> x.getCity()=="Mumbai"||x.getCity().equals("Pune")).collect(Collectors.toList());
        Employee e3 = e.stream().filter(x-> x.getCity()=="Mumbai"||x.getCity().equals("Pune"))
                .findFirst().get();
        System.out.println(e1);
        System.out.println(e3);
    }
}
