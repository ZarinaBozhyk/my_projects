package company.lesson4;

import java.util.ArrayList;


public class Test {
    public  void someString(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", "Ivan", "Ivanovich",
                1999, 222222, "FAKSY", "KS-1", 2 ));
        students.add(new Student("Ivanova", "Anna", "Petrovna",
                1998, 020202, "FITKI", "FI-4", 1 ));
        students.add(new Student("Sidorov", "Anton", "Victorovich",
                1999, 224422, "FBTE", "B-1", 3 ));
        students.add(new Student("Fedorova", "Elena", "Alexandrovna",
                2002, 278782, "FAKSY", "KS-2", 1 ));
        students.add(new Student("Gudkova", "Irina", "Ivanovna",
                1997, 111111, "FITKI", "KSS-4", 5 ));
        students.add(new Student("Popov", "Fedor", "Ivanovich",
                1999, 227872, "FAKSY", "KS-5", 3 ));

    }

    }


