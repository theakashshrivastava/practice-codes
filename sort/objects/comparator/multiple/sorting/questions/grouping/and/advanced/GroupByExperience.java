package sort.objects.comparator.multiple.sorting.questions.grouping.and.advanced;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExperience {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String, List<Employee>> m1 = empList.stream()
                .collect(Collectors.groupingBy(emp -> {
                    int exp = emp.getWorkEx();
                    if (exp<=5) return "0-5 Years";
                    else if (exp<=10) return "6-10 Years";
                    else return "10+ Years";
                }));
        m1.forEach((k,v) -> {
            System.out.println("Experience Range: " + k);
            v.forEach(System.out::println);
            System.out.println();
        });
    }
}
