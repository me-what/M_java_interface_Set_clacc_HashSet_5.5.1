import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);

        System.out.printf("Set contains %d elements \n", states.size());
        System.out.println();

        for(String state : states){
            System.out.println(state);
        }
        System.out.println();
        states.remove("Germany");

        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}