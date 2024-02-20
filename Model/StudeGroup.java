package Seminar5HW.Model;


import java.util.ArrayList;
import java.util.List;

    public class StudeGroup {
        private Integer numberGroup;
        private Teacher teacher;
        private List<Student> students;

        public StudeGroup(Integer numberGroup, Teacher teacher, ArrayList<Student> students) {
            this.numberGroup = numberGroup;
            this.teacher = teacher;
            this.students = students;
        }

        @Override
        public String toString() {
            return "Учебная группа номер - " + numberGroup +
                    ", преподаватель учебной группы - " + teacher +
                    ", студентов в группе - " + students +
                    '}';
        }
    }

