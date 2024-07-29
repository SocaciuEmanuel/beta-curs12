package org.beta.curs12.homework;

import java.time.Year;
import java.util.Objects;

public class BirthYearCalculator {
    private final int age;

    public BirthYearCalculator(int age) {
        if (age < 0 || age > 120) {
            throw new AgeException("Age " + age + " is invalid");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return Year.now().getValue() - age;
    }

    @Override
    public String toString() {
        return "BirthYearCalculator{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BirthYearCalculator that = (BirthYearCalculator) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }
}
