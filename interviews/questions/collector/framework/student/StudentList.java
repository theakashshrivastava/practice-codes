package interviews.questions.collector.framework.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static List<Student> getStudentList() {
        List<Student> sList = new ArrayList<>();

        sList.add(new Student(1, "Jam"));
        sList.add(new Student(2, "Ram"));
        sList.add(new Student(3, "Tam"));
        sList.add(new Student(3, "Tom"));
        sList.add(new Student(4, "Pam"));
        sList.add(new Student(5, "Ham"));
        sList.add(new Student(5, "Ham"));
        sList.add(new Student(6, "Eam"));
        sList.add(new Student(6, "Eam"));
        sList.add(new Student(7, "Wam"));
        sList.add(new Student(7, "Wam"));
        return sList;
    }
}


