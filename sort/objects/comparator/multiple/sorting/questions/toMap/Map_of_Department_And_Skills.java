package sort.objects.comparator.multiple.sorting.questions.toMap;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Map_of_Department_And_Skills {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String, Set<String>> m1 = empList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartmentName,
                                Collectors.flatMapping(emp -> emp.getTechSkills().stream(),
                                        Collectors.toSet())));
        System.out.println("Department and Skills Map: ");
        m1.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
