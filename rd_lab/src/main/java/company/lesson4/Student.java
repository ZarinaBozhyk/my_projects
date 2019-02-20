package company.lesson4;

public class Student extends Person {
    private String faculty;
    private String group;
    private int course;




    public Student(String surname, String name, String patronymic, int dayOfBirth, int phonenumder, String faculty, String group, int course) {
        super(surname, name, patronymic, dayOfBirth, phonenumder);
        this.faculty = faculty;
        this.group = group;
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }
}
