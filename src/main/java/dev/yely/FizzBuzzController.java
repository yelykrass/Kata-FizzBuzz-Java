package dev.yely;

import java.util.ArrayList;

public class FizzBuzzController {

    private final FizzBuzzModel model;
    private final FizzBuzzView view;

    public FizzBuzzController(FizzBuzzModel model, FizzBuzzView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            String result = model.checkNumber(i);
            numbers.add(result);
        }

        view.print(numbers);
        // System.out.println(numbers);
    }
}
