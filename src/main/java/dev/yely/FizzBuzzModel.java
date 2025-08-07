package dev.yely;

public class FizzBuzzModel {

    public String checkNumber(int numb) {

        boolean isDivisibleBy3 = numb % 3 == 0;
        boolean isDivisibleBy5 = numb % 5 == 0;
        boolean isContainsBy3 = String.valueOf(numb).contains("3");

        if ((isDivisibleBy3 || isContainsBy3) && isDivisibleBy5) {
            return "FizzBuzz";
        }

        if (isDivisibleBy3 || isContainsBy3) {
            return "Fizz";
        }

        if (isDivisibleBy5) {
            return "Buzz";
        }

        return String.valueOf(numb);

    }
}
