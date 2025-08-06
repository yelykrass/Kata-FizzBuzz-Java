package dev.yely;

public class FizzBuzzControler {

    private final FizzBuzzModel model;
    private final FizzBuzzView view;

    public FizzBuzzControler(FizzBuzzModel model, FizzBuzzView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            String result = model.checkNumber(i);
            view.print(result);
        }
    }
}
