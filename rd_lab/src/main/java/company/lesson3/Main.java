package company.lesson3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Alex", "Ostapchuk", 30));
        personArrayList.add(new Person("Victor", "Ivanov", 51));
        personArrayList.add(new Person("Victor", "Ivanov", 50));
        personArrayList.add(new Person("Yarik", "Gorodnik", 49));
        personArrayList.add(new Person("Olena", "Petruk", 42));
        personArrayList.add(new Person("Artur", "Pagasian", 36));
        personArrayList.add(new Person("Nata", "Egorova", 22));
        personArrayList.add(new Person("Katerina", "Vlasyuk", 38));
        personArrayList.add(new Person("Dmitro", "Sologub", 57));
        personArrayList.add(new Person("Valentina", "Nesteruk", 36));
        personArrayList.add(new Person("Alex", "Fayniy", 33));

        Company company = new Company("Fornova");

        company.setEmployees(personArrayList);
        System.out.println(personArrayList.size());


        for (Person emp:company.getEmployees())
        {
            System.out.println(emp.getLastName()+" " + emp.getAge());
        }





    }

    }
