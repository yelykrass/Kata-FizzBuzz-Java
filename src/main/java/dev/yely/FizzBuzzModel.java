package dev.yely;

public class FizzBuzzModel {

    public String checkNumber(int numb) {

        boolean isDivisibleBy3 = numb % 3 == 0;
        boolean isDivisibleBy5 = numb % 5 == 0;

        if (isDivisibleBy3) {
            return "Fizz";
        } else if (isDivisibleBy5) {
            return "Buzz";
        }
        return String.valueOf(numb);
    }

}
