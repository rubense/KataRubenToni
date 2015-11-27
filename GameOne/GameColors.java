package KataRubenToni.GameOne;

import KataRubenToni.GameTwo.validator.NumberValidator;
import KataRubenToni.GameTwo.validator.ValidatorManager;
import KataRubenToni.kata.Game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ruben on 26/11/2015.
 */
public class GameColors implements Game {
    private NumberValidator numberValidator;
    private ArrayList<Color> colors;

    public GameColors() {
        this.colors = new ArrayList<Color>();
        this.numberValidator = new NumberValidator();
        loadColors();
    }

    public void loadColors() {
            this.colors.add(new Color("Rojo"));
            this.colors.add(new Color("Verde"));
            this.colors.add(new Color("Azul"));
            this.colors.add(new Color("Amarillo"));
    }

    public void game() {
        boolean correct = false;
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(i + ". " + colors.get(i).toString());
        }
        while (!correct) {
            System.out.print("Guess the color (choose a number) : ");
            Scanner sc1 = new Scanner(System.in);
            ValidatorManager.valid(numberValidator, "Please, put a number :D", sc1);
            String name = sc1.nextLine();
            Color color = new Color(name);
            int j = (int) (Math.random() * colors.size()) + 1;
            if (colors.get(j).equals(color)) correct = true;
            if (!correct) System.out.println("Error :( Try again");
            else {
                System.out.println("Great! :) You guess the color");
                System.out.print("¿Try again? y/n ");
                Scanner sc2 = new Scanner(System.in);
                if (sc2.nextLine().equals("y")) correct = false;
            }
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
