package com.erraoucha;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonClass() {
        // Création d'un ensemble avec les objets Person
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, " Alice "));
        people.add(new Person(2, "Bob "));
        people.add(new Person(3, " Charlie "));

        // Test : suppression sans Iterator doit lever une exception
        assertThrows(java.util.ConcurrentModificationException.class, () -> {
            for (Person person : people) {
                if (person.getName().equals("Bob")) {
                    people.remove(person); // Provoque l'exception
                }
            }
        } );
    }

}
