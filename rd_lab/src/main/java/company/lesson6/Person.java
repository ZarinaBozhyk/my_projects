package company.lesson6;

public class Person implements HumanInterface {
    private int age;
    private Personality person;

    Person (int age, Personality person){
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println( "I CAN TALK!");
        System.out.println("Person: " + person);

    }

    @Override
    public void walk() {
        System.out.println("I CAN WALK");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
