package interviews.questions.collector.framework.student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortViaNameAndId {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        List<Student> sortList = students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        System.out.println(sortList);
    }
}
