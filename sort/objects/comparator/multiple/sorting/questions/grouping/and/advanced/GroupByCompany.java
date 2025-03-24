package sort.objects.comparator.multiple.sorting.questions.grouping.and.advanced;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByCompany {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String, List<Employee>> employeesByCompany = empList.stream()
                .flatMap(e->e.getPreviousEmployers().stream())
                .collect(Collectors.toSet())
                .stream()
                        .collect(Collectors.toMap(
                                company -> company,
                                company -> empList.stream()
                                        .filter(e -> e.getPreviousEmployers().contains(company))
                                        .collect(Collectors.toList()))
                        );
        employeesByCompany.forEach((company, employees) -> {
            System.out.println(company + " : " + employees);
        });
    }
}

