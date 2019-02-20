package company.lesson6;

public class UFO implements HumanInterface {
    private int age;
    private Personality person;

    UFO (int age, Personality person){
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println( "I AM ALIAN AND I CAN TALK A LOT!");
        System.out.println("Person: " + person);

    }

    @Override
    public void walk() {
        System.out.println("I CAN WALK, HAHAHAHAHAHA");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
