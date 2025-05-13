package cat.itacademy.s04.t02.n01.exceptions;

public class FruitaNotFoundException extends RuntimeException {
    public FruitaNotFoundException(String message) {
        super(message);
    }
}
