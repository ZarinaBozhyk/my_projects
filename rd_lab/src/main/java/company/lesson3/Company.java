package company.lesson3;

import java.util.ArrayList;

public class Company {
    private String nameCompany;
    private ArrayList<Person> employees;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Company(String nameCompany, ArrayList<Person> employees) {
        this.nameCompany = nameCompany;
        this.employees = employees;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

//    public void checkFirstName(String name) {
//        for (Person empl : employees) {
//            if (empl.getName().equals(name)) {
//                System.out.println(empl.getLastName());
//                break;
//            } else {
//                System.out.println("No");
//            }
//        }
//    }

    public void checkFirstName(String firstname) {
        for (Person emp : employees) {
            if (emp.getFirstName().equals("Alex")) {
                System.out.println(emp.getLastName());
                break;
            } else {
                System.out.println("no");
            }

        }
    }
}
