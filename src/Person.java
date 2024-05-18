public class Person implements Comparable<Person> {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Person other) {
        // Compare birth years
        return Integer.compare(this.birthYear, other.birthYear);
    }

    @Override
    public String toString() {
        return name + " (" + birthYear + ")";
    }

    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("Dmytro", 2006);
        Person person2 = new Person("Andrew", 2005);
        Person person3 = new Person("Alex", 2006);

        // Demonstrate comparison
        System.out.println(person1 + " compared to " + person2 + ": " + person1.compareTo(person2)); // Positive if greater
        System.out.println(person1 + " compared to " + person3 + ": " + person1.compareTo(person3)); // Equal if same
        System.out.println(person2 + " compared to " + person3 + ": " + person2.compareTo(person3)); // Negative if less
    }
}
