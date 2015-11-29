package KataRubenToni.GameOne;

import KataRubenToni.validator.*;
import KataRubenToni.kata.Game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ruben on 26/11/2015.
 */
public class GameColors implements Game {
    //private NumberValidator numberValidator;
    private RangeNumberValidator rangeNumberValidator;
    private YesNoValidator yesNoValidator;
    private ArrayList<Color> colors;

    public GameColors() {
        this.colors = new ArrayList<Color>();
        loadColors();
        this.rangeNumberValidator = new RangeNumberValidator(0,colors.size()-1);
        this.yesNoValidator = new YesNoValidator();
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
            int numRandom = (int) (Math.random() * colors.size());
            while (!correct) {
                Scanner sc1 = new Scanner(System.in);
                rangeNumberValidator = (RangeNumberValidator) ValidatorManager.valid(rangeNumberValidator,
                        "Guess the color (choose a number) : ",
                        "Please, put a number of a color :D", sc1);
                int numColor = rangeNumberValidator.getValid();
                if (numColor == numRandom) correct = true;
                if (!correct) System.out.println("Error :( Try again");
                else {
                    System.out.println("Great! :) You guess the color");
                    Scanner sc2 = new Scanner(System.in);
                    yesNoValidator = (YesNoValidator) ValidatorManager.valid(yesNoValidator,
                            "¿Try again? yes/no: ",
                            "Please, only yes or no", sc2);
                    correct = !yesNoValidator.getIsYes();
                    if(!correct) numRandom = (int) (Math.random() * colors.size());
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
