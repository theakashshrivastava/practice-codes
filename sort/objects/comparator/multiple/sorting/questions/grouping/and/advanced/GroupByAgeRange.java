package sort.objects.comparator.multiple.sorting.questions.grouping.and.advanced;

import sort.objects.comparator.multiple.sorting.Employee;
import sort.objects.comparator.multiple.sorting.EmployeeDataList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAgeRange {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataList.getEmployeeData();

        Map<String,List<Employee>> m1 = empList.stream()
                .collect(Collectors.groupingBy(emp ->{
                    var age = emp.getAge();
                    if(age<25) return "20-24 Age Group";
                    else if (age<30) { return "25-29 Age group";
                    } else if (age<35) { return "30-34 Age group";
                    } else { return "35+ Age group";
                    }
                }));
        m1.forEach((k,v) -> {
            System.out.println("Age Range: " + k);
            v.forEach(System.out::println);
            System.out.println();
        });
    }
}
