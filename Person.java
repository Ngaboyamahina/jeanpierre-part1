class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 35)
        };

        // Searching for a person by name
        String targetName = "Charlie";
        searchPerson(people, targetName);
    }

    // Method to search for a person by name and break the loop when found
    public static void searchPerson(Person[] people, String targetName) {
        System.out.println("Searching for " + targetName + ":");

        for (Person person : people) {
            System.out.println("Checking: " + person.getName());

            // Check if the current person's name matches the target name
            if (person.getName().equals(targetName)) {
                System.out.println("Person found! Breaking the loop.");
                break; // Exit the loop if the person is found
            }
        }

        System.out.println("Search finished.");
    }
}