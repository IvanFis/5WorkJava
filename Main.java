package Seminar5HW;


import Seminar5HW.Controller.Controller;
import Seminar5HW.Model.StudeGroup;
import Seminar5HW.Model.Student;
import Seminar5HW.Model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Student student1 = controller.createStudent(new Student("Алёша", "Патриков", 1999,1));
        Student student2 = controller.createStudent(new Student("Акакий", "Тархунов", 2000,2));
        Student student3 = controller.createStudent(new Student("Багратион", "Шарпов", 2001,3));
        Student student4 = controller.createStudent(new Student("Иван", "Рыбкин", 2002,4));
        Teacher teacher1 = controller.createTeacher(new Teacher("Борис", "Консолев", 1978,1));
        Teacher teacher2 = controller.createTeacher(new Teacher("Морис", "Консолев", 1979,2));
        StudeGroup group666 = controller.createGroup(666, teacher1, student1, student2);
        StudeGroup group999 = controller.createGroup(999, teacher2, student3, student4);
        System.out.println(group666.toString());
        System.out.println(group999.toString());
    }
}
