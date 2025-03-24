package sort.objects.comparator.multiple.sorting.questions.toMap;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_ID_With_Employee {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<Integer,Employee> eMap = empList.stream()
                .collect(Collectors.toMap(Employee::getId, Employee -> Employee));

        System.out.println("Employee Map: ");
        eMap.forEach((k,v) -> System.out.println(k + " : " + v.getName()));
    }
}
