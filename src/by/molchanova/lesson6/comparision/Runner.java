package by.molchanova.lesson6.comparision;

import by.molchanova.lesson6.comparision.Person.*;
import java.util.*;
import javax.security.auth.login.*;

public class Runner {

    public static void main(String[] args) {
        Person person = new Person("Anna", 19);
        Person person1 = new Person("William", 15);
        Person person2 = new Person("Tom", 15);
        //System.out.println(person1.compareTo(person));
        Person[] persons = {person, person1, person2};
//        Arrays.sort(persons);
//        System.out.println(Arrays.toString(persons));

//        String[] strings = {"new", "all", "test"};
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));

//        person.getAccount();
        sortArrays(persons);
    }

    public static Person[] sortArrays(Person[] persons) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getAge() == person2.getAge()) {
                    return person1.getName().length() - person2.getName().length();
                }
                return person1.getAge() - person2.getAge();
            }
        };
        Arrays.sort(persons, comparator);
        System.out.println(Arrays.toString(persons));
        return persons;
    }
}
