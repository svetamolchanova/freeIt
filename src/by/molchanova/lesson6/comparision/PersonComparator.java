package by.molchanova.lesson6.comparision;

import java.util.*;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getAge() == person2.getAge()) {
            return person1.getName().length() - person2.getName().length();
        }
        return person1.getAge() - person2.getAge();
    }
}
