package main.DSA;

public class Game {
    private int sum =0;
    public void roll(int pins) {
        sum+=pins;
    }

    public int score() {
        return sum;
    }
}
