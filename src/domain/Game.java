package domain;

/**
 * Created by jordiadan on 3/5/17.
 */
public class Game {
    private int score = 0;
    public void roll(int pins) {
        score += pins;
    }
    public int score() {
        return score;
    }
}
