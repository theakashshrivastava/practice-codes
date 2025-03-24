package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class All_Unique_Companies {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();
        Set<String> companiesList =
        empList.stream().flatMap(emp -> emp.getPreviousEmployers().stream()).collect(Collectors.toSet());
        System.out.println(companiesList);
    }
}
