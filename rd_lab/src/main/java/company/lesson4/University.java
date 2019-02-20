package company.lesson4;
//Создать класс University с полями Название, Список студентов переопределить метод toString()

import java.util.ArrayList;

public class University {
    private String nameOfUniversity;
    private ArrayList<Student> students;

    public University(String nameOfUniversity, ArrayList<Student> students) {
        this.nameOfUniversity = nameOfUniversity;
        this.students = students;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", students=" + students +
                '}';
    }

    public ArrayList<Student> getStudent (String nameOfFaculty){
        ArrayList<Student> newStudent =new ArrayList<>();
        for (Student i: students ) {
            if (i.getFaculty().equals(nameOfFaculty)){
                newStudent.add(i);
            }

        }
        return newStudent;
    }



    }



