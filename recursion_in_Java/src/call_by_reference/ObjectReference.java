package call_by_reference;

class Person {
    String name;
}

public class ObjectReference {

    static void changeName(Person p) {
        p.name = "John";  // This changes original object data
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";

        changeName(person);
        System.out.println("Name after method call: " + person.name);
    }
}
