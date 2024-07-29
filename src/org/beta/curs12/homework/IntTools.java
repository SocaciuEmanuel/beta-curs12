package org.beta.curs12.homework;

public class IntTools {
    private int number;

    public IntTools(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfDigits() {
        int digits = 0, temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        return digits;
    }

    public int digitSum() {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public int lastDigit() {
        return number % 10;
    }

    public int digitAt(int position) throws NumberException {
        int temp = number;
        String numberString = Integer.toString(number);
        if (position < 1 || position > numberString.length()) {
            throw new NumberException("Invalid position " + position);
        }
        return Character.getNumericValue(numberString.charAt(position - 1));
    }
}
