package test.DSA;

import main.DSA.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game game;

    @Before
    public void setUp() throws Exception{
        game = new Game();
    }

    private void roller(int pins, int n) {
        for (int i = 0; i < 20; i++) {
            game.roll(pins);
        }
    }


    @Test
    public void gutterGame(){
        roller(0, 20 );
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes(){
        roller(1, 20 );
        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare(){
        game.roll(5);
        game.roll(5);
        game.roll(3);
        roller(0, 17 );
        assertEquals(20, game.score());
    }



}

