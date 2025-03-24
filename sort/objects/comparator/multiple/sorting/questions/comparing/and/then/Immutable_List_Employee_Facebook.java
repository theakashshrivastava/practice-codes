package sort.objects.comparator.multiple.sorting.questions.comparing.and.then;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Immutable_List_Employee_Facebook {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        List<Employee> empInFacebook = empList.stream()
                .filter(emp -> emp.getPreviousEmployers().contains("Facebook"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        System.out.println("Immutable List of Employees who worked in Facebook: ");
        empInFacebook.forEach(System.out::println);
    }
}
