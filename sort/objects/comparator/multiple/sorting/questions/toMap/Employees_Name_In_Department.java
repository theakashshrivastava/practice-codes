package sort.objects.comparator.multiple.sorting.questions.toMap;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employees_Name_In_Department {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String, List<String>> m1 = empList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartmentName
                                , Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("Employee Names in each Department: ");
        m1.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
