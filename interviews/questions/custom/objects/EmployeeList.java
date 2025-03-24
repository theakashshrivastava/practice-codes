package interviews.questions.custom.objects;

import java.util.Arrays;
import java.util.List;

public class EmployeeList {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Aditi", 30, 10000, "F", "HR", "Mumbai"),
                new Employee(2, "Rahul", 23, 130000, "M", "BT", "Bangalore"),
                new Employee(3, "Aman", 16, 110000, "M", "IT", "Mumbai"),
                new Employee(4, "Jaya", 33, 15000, "F", "HR", "Chennai"),
                new Employee(5, "Rashmi", 27, 15000, "F", "HR", "Pune"),
                new Employee(6, "Rani", 56, 110000, "F", "IT", "Gwalior"),
                new Employee(7, "Arti", 32, 230000, "F", "ME", "Goa"),
                new Employee(8, "Ajay", 32, 420000, "F", "CS", "Bhopal"),
                new Employee(9, "Vijay", 23, 510000, "F", "BT", "Mumbai"),
                new Employee(10, "Ram", 11, 670000, "M", "ME", "Hyderabad"),
                new Employee(11, "Shyam", 23, 780000, "F", "ME", "Delhi"),
                new Employee(12, "Rupa", 17, 190000, "F", "ME", "Bangalore"),
                new Employee(12, "Rupa", 27, 17000, "F", "CM", "Indore")
        );
    }
}
