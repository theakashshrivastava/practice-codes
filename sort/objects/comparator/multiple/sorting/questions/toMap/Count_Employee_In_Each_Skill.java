package sort.objects.comparator.multiple.sorting.questions.toMap;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_Employee_In_Each_Skill {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String,Long> m1 = empList.stream()
                .flatMap(emp -> emp.getTechSkills().stream())
                .collect(Collectors.groupingBy(
                        skill->skill,
                        Collectors.counting()
                ));
        System.out.println("Count of Employees in each Skill: ");
        m1.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
