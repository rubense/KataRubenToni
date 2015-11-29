package KataRubenToni.GameOne;

import KataRubenToni.validator.BetterCallFirstIsValidMethodException;
import KataRubenToni.validator.NumberValidator;
import KataRubenToni.validator.ValidatorManager;
import KataRubenToni.kata.Game;
import KataRubenToni.validator.YesNoValidator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ruben on 26/11/2015.
 */
public class GameColors implements Game {
    private NumberValidator numberValidator;
    private YesNoValidator yesNoValidator;
    private ArrayList<Color> colors;

    public GameColors() {
        this.colors = new ArrayList<Color>();
        this.numberValidator = new NumberValidator();
        this.yesNoValidator = new YesNoValidator();
        loadColors();
    }

    public void loadColors() {
        this.colors.add(new Color("Rojo"));
        this.colors.add(new Color("Verde"));
        this.colors.add(new Color("Azul"));
        this.colors.add(new Color("Amarillo"));
    }

    public void game() {
        try {
            boolean correct = false;
            for (int i = 0; i < colors.size(); i++) {
                System.out.println(i + ". " + colors.get(i).toString());
            }
            while (!correct) {
                Scanner sc1 = new Scanner(System.in);
                numberValidator = (NumberValidator) ValidatorManager.valid(numberValidator,
                        "Guess the color (choose a number) : ",
                        "Please, put a number :D", sc1);
                int numColor = numberValidator.getValid();
                int numRandom = (int) (Math.random() * colors.size());
                if (numColor == numRandom) correct = true;
                if (!correct) System.out.println("Error :( Try again");
                else {
                    System.out.println("Great! :) You guess the color");
                    Scanner sc2 = new Scanner(System.in);
                    yesNoValidator = (YesNoValidator) ValidatorManager.valid(yesNoValidator,
                            "¿Try again? yes/no: ",
                            "Please, only yes or no", sc2);
                    correct = !yesNoValidator.getIsYes();
                }
            }
        } catch (BetterCallFirstIsValidMethodException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void play() {
        game();
    }

    @Override
    public void exit() {

    }

    @Override
    public String toString() {return "Color Game";}
}
