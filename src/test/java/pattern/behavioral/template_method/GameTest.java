package pattern.behavioral.template_method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void playersAmountChessTest() {
        Game game = new Chess();
        assertEquals("Kirill", game.playOneGame());
    }

    @Test
    public void playersAmountMonopolyTest() {
        Game game = new Monopoly();
        assertEquals("Vladimir", game.playOneGame());
    }

}
