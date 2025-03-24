package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.stream.Collectors;

public class Total_Unique_Skills {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        long totalSkills = empList.stream()
                        .flatMap(emp -> emp.getTechSkills().stream())
                        .distinct().count();
        System.out.println("Total unique skills: " + totalSkills);
    }
}
