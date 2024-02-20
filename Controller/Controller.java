package Seminar5HW.Controller;


import Seminar5HW.Model.StudeGroup;
import Seminar5HW.Model.Student;
import Seminar5HW.Model.Teacher;
import Seminar5HW.Model.User;
import Seminar5HW.Service.GroupService;
import Seminar5HW.Service.UserService;
import Seminar5HW.View.StudentView;

import java.util.List;

public class Controller {
    private UserService userService;
    private GroupService groupService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
        this.groupService = new GroupService();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudeGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}

