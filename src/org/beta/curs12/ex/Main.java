package org.beta.curs12.ex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService persons = new PersonService(
                List.of(
                        new Person("Mihai", 17, PersonHair.BLONDE),
                        new Person("Maria", 22, PersonHair.BLACK),
                        new Person("Gheorghe", 11, PersonHair.BLACK),
                        new Person("Marcel", 91, PersonHair.BROWN),
                        new Person("Sara", 45, PersonHair.BLONDE)
                )
        );
        try {
            System.out.println(persons.getPersonsOlderThan(-30));
        } catch (PersonBusinessException pbe) {
            System.out.println(pbe.getMessage());
        }

        System.out.println(persons.groupByHair());
    }
}