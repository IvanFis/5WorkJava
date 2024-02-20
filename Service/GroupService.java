package Seminar5HW.Service;



import Seminar5HW.Model.StudeGroup;
import Seminar5HW.Model.Student;
import Seminar5HW.Model.Teacher;

import java.util.ArrayList;


public class GroupService {

    public StudeGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudeGroup(num, teacher, listStudents);
    }
}

