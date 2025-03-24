package sort.objects.comparator.multiple.sorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataList {
    public static List<Employee> getEmployeeData(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Mark", 25, 23000, "IT", List.of("Java", "Python","C#", "Angular","SAP"), List.of("Google", "Amazon","Accenture"), 3));
        empList.add(new Employee(2, "Steve", 26, 45000, "HR", List.of("SAP", "QA", "Java", "Angular","SQL","NO-SQL"), List.of("IBS", "Facebook","Flipkart"), 2));
        empList.add(new Employee(3, "Glenn", 21, 55650, "Tech", List.of("C++", "C#", "Java", "Angular"), List.of("Amazon", "Walmart","PWC"), 5));
        empList.add(new Employee(4, "Shaun", 32, 54545, "ME", List.of("JavaScript"), List.of("Expedia", "Google","KPMG"), 5));
        empList.add(new Employee(5, "Shane", 34, 52235, "CS", List.of("React", "JSP"), List.of("Facebook", "IBS","Barclays"), 3));
        empList.add(new Employee(6, "Rahul", 35, 34454, "Bio", List.of("Java", "QA","Python"), List.of("Amazon", "Walmart"), 7));
        empList.add(new Employee(7, "Shane", 29, 35455, "CE", List.of("Python", "C++"), List.of("Google", "Expedia"), 8));
        empList.add(new Employee(8, "Kane", 39, 23345, "Finance", List.of("SAP", "React", "Angular"), List.of("IBS", "Facebook"), 2));
        empList.add(new Employee(9, "Rock", 35, 56664, "IT", List.of("JavaScript", "JSP", "HTML"), List.of("Amazon", "Google"), 10));
        empList.add(new Employee(10, "Pat", 35, 53453, "ME", List.of("C#", "Python", "HTML"), List.of("Expedia", "Walmart"), 15));
        empList.add(new Employee(11, "Travis", 22, 50034, "CE", List.of("Java", "Angular", "JavaScript"), List.of("Google", "Facebook"), 13));
        empList.add(new Employee(12, "Alex", 24, 23422, "CS", List.of("SAP", "JSP"), List.of("IBS", "Expedia"), 12));
        empList.add(new Employee(13, "Rahul", 36, 12234, "HR", List.of("QA", "C++","C","SQL","DBMS","Java","Spring Boot",".Net"), List.of("Amazon", "Google"), 7));
        empList.add(new Employee(14, "Rahul", 37, 56658, "HR", List.of("JavaScript", "React", "Java", "Angular"), List.of("EY", "Walmart"), 2));
        empList.add(new Employee(15, "Alex", 31, 76754, "IT", List.of("Java", "SAP"), List.of("IBS", "Expedia"), 3));
        return empList;
    }
}
