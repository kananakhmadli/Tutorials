
public class Car {
    private int suit;

    public Car(int suit) {
        if (suit < 0)
            throw new IllegalArgumentException("invalid value");
        this.suit = suit;
    }

    public Car() {
    }

    public int getSuit() {
        if (suit < 4 && suit > 1) {
            throw new IllegalStateException("invalid state");

        }
        return suit;
    }

}
