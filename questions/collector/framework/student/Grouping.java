package interviews.questions.collector.framework.student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        students.stream()
                .collect(Collectors.groupingBy(Student::getId,
                        Collectors.mapping(Student::getName, Collectors.joining(" & "))))
                .entrySet().forEach(System.out::println);


        students.stream()
                .collect(Collectors.groupingBy(Student::getId, Collectors.toList()))
                .entrySet().forEach(System.out::println);
    }
}
