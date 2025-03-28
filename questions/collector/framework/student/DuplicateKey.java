package interviews.questions.collector.framework.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateKey {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        students.stream()
                .collect(Collectors.toMap(Student::getId,
                        Student::getName,
                        (oldValue, newValue) -> newValue))
                .entrySet()
                .forEach(System.out::println);
    }
}

