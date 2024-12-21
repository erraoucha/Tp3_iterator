package com.erraoucha;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonConstructorAndSetterAndGettegrTest {

    @Test
    public void testGettersAndSetters() {
        Person person = new Person();
        person.setId(1);
        person.setName("John");

        assertEquals(1, person.getId());
        assertEquals("John", person.getName());
    }

    @Test
    public void testConstructorWithArguments() {
        Person person = new Person(2, "Jane");

        assertEquals(2, person.getId());
        assertEquals("Jane", person.getName());
    }

    @Test
    public void testEqualsAndHashCode() {
        Person person1 = new Person(1, "John");
        Person person2 = new Person(1, "Jane");
        Person person3 = new Person(2, "Doe");

        // Test de l'égalité
        assertEquals(person1, person2);
        assertNotEquals(person1, person3);

        // Test du hashCode
        assertEquals(person1.hashCode(), person2.hashCode());
        assertNotEquals(person1.hashCode(), person3.hashCode());
    }

    @Test
    public void testToString() {
        Person person = new Person(3, "Charlie");

        String expected = "Person{id=3, name='Charlie'}";
        assertEquals(expected, person.toString());
    }
}
