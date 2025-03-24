package sort.objects.comparator.multiple.sorting.questions.comparing.and.then;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Immutable_Emp_List_Sort_Salary {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        List<Employee>  empSortedList = empList
                .stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                                .collect(Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        Collections::unmodifiableList
                                ));
        System.out.println("Immutable Sorted Employee List based on Salary: ");
        empSortedList.forEach(System.out::println);
    }
}
