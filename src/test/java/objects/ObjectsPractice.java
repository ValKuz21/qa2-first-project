package objects;

import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void workingWithObjects() {
        Student pavel = new Student("Pavel", "Ivanov");
        pavel.setFirstName("Pavel");
        pavel.setLastName("Ivanov");
        pavel.setAge(80);

        Student nadja = new Student("Nadezhda", "Petrova");
        nadja.setFirstName("Nadezhda");
        nadja.setLastName("Petrova");
        nadja.setAge(69);
        nadja.setPhone("37125698");

        System.out.println("First student: " + nadja.getFirstName() + " " + nadja.getLastName());
        System.out.println("Second student: " + pavel.getFirstName() + " " + pavel.getLastName());
        System.out.println("First student: " + nadja.getFullName());
        System.out.println("Second student: " + pavel.getFullName());
    }
}
