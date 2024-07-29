package org.beta.curs12.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //EX 1
        try {
            BirthYearCalculator calculator = new BirthYearCalculator(900);
            System.out.println(calculator.getAge());
            System.out.println(calculator.getBirthYear());
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------");

        //EX2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age ");
        int age = scanner.nextInt();
        try {
            BirthYearCalculator calculator = new BirthYearCalculator(age);
            System.out.println("Your birth year is " + calculator.getBirthYear());
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------");

        //EX 3
        IntTools number = new IntTools(329943);
        try {
            System.out.println("Number is " + number.getNumber());
            System.out.println("Digit sum of number is " + number.digitSum());
            System.out.println("Number of digits is " + number.getNumberOfDigits());
            System.out.println("Last digit of number is " + number.lastDigit());
            System.out.println("Digit at position specified is " + number.digitAt(3));
        } catch (NumberException e) {
            throw new NumberException(e.getMessage());
        }
    }
}
