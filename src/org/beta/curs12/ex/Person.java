package org.beta.curs12.ex;

public record Person(
        String name,
        int age,
        PersonHair hair
) {
    public Person {
        if (name == null || name.isBlank()) {
            throw new NameException();
        }
        if (age < 0 || age > 120) {
            throw new AgeException();
        }
        if (hair == null) {
            throw new HairException();
        }
    }
}