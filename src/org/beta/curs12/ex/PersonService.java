package org.beta.curs12.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        persons.addAll(persons);
    }

    public List<Person> getPersonsOlderThan(int age) throws PersonBusinessException {
        if (age > 120 || age < 0) {
            throw new PersonBusinessException("Age should be (0,120)");
        }
        List<Person> personOlder = new ArrayList<>();
        for (Person person : persons) {
            if (person.age() > age) {
                personOlder.add(person);
            }
        }
        return personOlder;
    }

    public Map<PersonHair, List<Person>> groupByHair() {
        Map<PersonHair, List<Person>> result = new HashMap<>();
        for (Person person : persons) {
            if (!result.containsKey(person.hair())) {
                result.put(person.hair(), new ArrayList<>());
            }
            result.get(person.hair()).add(person);
        }
        return result;
    }
}
