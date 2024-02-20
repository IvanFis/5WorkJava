package Seminar5HW.Model;


public class Teacher extends User {
    private Integer id;

    public Teacher(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }

    public Teacher(String name, String secondName, Integer year) {
        super(name, secondName, year);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Учитель: ID - '" + this.id + '\'' +
                ", Имя - '" + getName() + '\'' +
                ", Фамилия - '" + getSecondName() + '\'' +
                ", Год рождения - " + getYear()
                ;
    }
}

