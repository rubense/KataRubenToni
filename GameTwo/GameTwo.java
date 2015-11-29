package KataRubenToni.GameTwo;

import KataRubenToni.kata.Game;
import KataRubenToni.validator.BetterCallFirstIsValidMethodException;

/**
 * Created by toni on 26/11/15.
 */
public class GameTwo implements Game {

    private GameFigures gameFigures;

    public GameTwo() {
        gameFigures = new GameFigures();
    }

    @Override
    public void play() {
        try {
            gameFigures.play();
        } catch (BetterCallFirstIsValidMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exit() {

    }

    @Override
    public String toString() {
        return gameFigures.toString();
    }
}
