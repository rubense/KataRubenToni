package KataRubenToni.GameTwo;

import KataRubenToni.GameTwo.figures.Triangle;
import KataRubenToni.GameTwo.validator.NumberValidator;
import KataRubenToni.GameTwo.validator.Validator;
import KataRubenToni.GameTwo.validator.ValidatorManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by toni on 26/11/15.
 */
public class GameFigures {

    private NumberValidator numberValidator;
    private ArrayList<Figure> figures;

    public GameFigures() {
        this.figures = new ArrayList<Figure>();
        this.numberValidator = new NumberValidator();
        loadFigures();
    }

    private void loadFigures() {
        this.figures.add(new Triangle(10, 10));
        this.figures.add(new Triangle(20, 20));
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < figures.size(); i++){
            System.out.println(i + ". "+ figures.get(i).toString());
        }

        System.out.print("What figure would you most like to play? (choose a number): ");
        ValidatorManager.valid(numberValidator, "Please, put a number :D", sc);

        String[][] canvas = figures.get(0).draw();
        draw(canvas);

    }

    private void draw(String [][] canvas){
        for (int i = 0; i < canvas.length; i++){
            for (int j = 0; j < canvas[i].length; j++){
                System.out.print(canvas[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Figure Game";
    }
}
