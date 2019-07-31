package behavioral.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void play() throws Exception {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}