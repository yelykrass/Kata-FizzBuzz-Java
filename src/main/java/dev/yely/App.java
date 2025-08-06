package dev.yely;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        FizzBuzzModel model = new FizzBuzzModel();
        FizzBuzzView view = new FizzBuzzView();
        FizzBuzzControler controler = new FizzBuzzControler(model, view);

        controler.run();
    }
}
