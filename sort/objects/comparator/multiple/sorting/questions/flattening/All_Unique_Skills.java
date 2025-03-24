package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.stream.Collectors;

public class All_Unique_Skills {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        empList.stream().flatMap(emp -> emp.getTechSkills().stream()).collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
