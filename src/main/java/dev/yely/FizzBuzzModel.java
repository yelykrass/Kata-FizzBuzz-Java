package dev.yely;

public class FizzBuzzModel {

    public String checkNumber(int numb) {

        boolean isDivisibleBy3 = numb % 3 == 0;

        if (isDivisibleBy3) {
        return "Fizz";
        }
        return String.valueOf(numb);
    }

}
