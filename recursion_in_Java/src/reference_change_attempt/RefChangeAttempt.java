package reference_change_attempt;

class Person {
    String name;
}

public class RefChangeAttempt {

    static void changeObject(Person p) {
        p = new Person();  // Creating new object
        p.name = "Soumya";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";

        changeObject(person);
        System.out.println("Name after method call: " + person.name);
    }
}

