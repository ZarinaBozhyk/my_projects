package company.lesson6;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person(35, Personality.MALE);
        System.out.println(bob.getAge());
        bob.talk();
        bob.walk();

        UFO alien = new UFO(935, Personality.ALIEN);
        System.out.println(alien.getAge());
        alien.talk();
        alien.walk();

    }
}
