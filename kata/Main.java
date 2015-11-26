package kata;


import GameOne.GameOne;
import GameTwo.GameTwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ruben on 26/11/2015.
 */
public class Main {

    public static void main(String args[]) {
        ArrayList<Game> games = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //games.add(new GameOne());
        games.add(new GameTwo());

        System.out.println(" ##### Games ##### ");
        for (int i = 0; i < games.size(); i++){
            System.out.println(games.get(i).toString());
        }

        int number = Integer.parseInt(sc.nextLine());

        games.get(number).play();
    }
}
