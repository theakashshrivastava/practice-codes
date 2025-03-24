package sort.objects.comparator.multiple.sorting.questions.flattening;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Most_Commonly_Used_Skills {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        String skillCount =
                empList.stream()
                                .flatMap(emp -> emp.getTechSkills().stream())
                                        .collect(Collectors.groupingBy(s->s, Collectors.counting()))
                                                .entrySet().stream()
                                .max(Map.Entry.comparingByValue())
                                        .map(Map.Entry::getKey)
                                                .orElse("No skills found");
        System.out.println("Most commonly used skill is: "+ skillCount);
    }
}
