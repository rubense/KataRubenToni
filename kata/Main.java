package KataRubenToni.kata;

import KataRubenToni.GameOne.GameColors;
import KataRubenToni.GameOne.GameOne;
import KataRubenToni.GameTwo.GameTwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ruben on 26/11/2015.
 */
public class Main {

    public static void main(String args[]) {
        ArrayList<Game> games = new ArrayList<Game>();
        Scanner sc = new Scanner(System.in);

        games.add(new GameColors());
        games.add(new GameTwo());

        System.out.println(" ##### Games ##### \n\n");

        for (int i = 0; i < games.size(); i++){
            System.out.println(i + ". " + games.get(i).toString());
        }

        System.out.print("\n\nChoose one: ");
        int number = Integer.parseInt(sc.nextLine());

        games.get(number).play();
    }
}
