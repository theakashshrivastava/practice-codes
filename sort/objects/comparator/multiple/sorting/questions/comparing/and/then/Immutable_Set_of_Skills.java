package sort.objects.comparator.multiple.sorting.questions.comparing.and.then;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Immutable_Set_of_Skills {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Set<String> unique_Skills = empList.stream()
                .flatMap(emp -> emp.getTechSkills().stream())
                .collect(Collectors.collectingAndThen(
                        Collectors.toSet(),
                        Collections::unmodifiableSet
                ));
        System.out.println("Immutable Set of Unique Skills: ");
        unique_Skills.forEach(System.out::println);
    }
}
