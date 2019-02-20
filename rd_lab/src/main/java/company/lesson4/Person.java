package company.lesson4;

//import java.time.LocalDate;

//Создать класс Person: Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон.
//        переопределить метод toString()
public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private int dayOfBirth;
    private int phonenumder;

    public Person(String surname, String name, String patronymic, int dayOfBirth, int phonenumder) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dayOfBirth = dayOfBirth;
        this.phonenumder = phonenumder;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getPhonenumder() {
        return phonenumder;
    }

    public void setPhonenumder(int phonenumder) {
        this.phonenumder = phonenumder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", phonenumder=" + phonenumder +
                '}';
    }
}
