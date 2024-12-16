package com.erraoucha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data // Génère automatiquement les getters, setters, equals, hashCode, et toString
@AllArgsConstructor // Génère un constructeur avec tous les champs
@NoArgsConstructor // Génère un constructeur sans arguments
public class Person {
    private int id;
    private String name;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id; // Comparaison basée uniquement sur l'attribut `id`
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Génération d'un hashCode basé sur `id`
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}
