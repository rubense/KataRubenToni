package KataRubenToni.GameOne;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ruben on 26/11/2015.
 */
public class GameColors {
    private ArrayList<Color> colors;

    public GameColors(){
        this.colors = new ArrayList<Color>();
        this.colors.add(new Color("Rojo"));
        this.colors.add(new Color("Verde"));
        this.colors.add(new Color("Azul"));
        this.colors.add(new Color("Amarillo"));
    }

    public void game() {
        boolean correct = false;
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        while (!correct) {
            System.out.println("Pon un color");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.nextLine();
            Color color = new Color(name);
            int j = (int) (Math.random() * colors.size()) + 1;
            if (colors.get(j).equals(color)) correct = true;
            if (correct) System.out.println("Error :( Prueba otra vez");
            else {
                System.out.println("Si! :) Es ese color");
                System.out.print("¿Probar otra vez? s/n");
                Scanner sc2 = new Scanner(System.in);
                if (sc2.nextLine().equals("s")) correct = false;
            }
        }
    }

}
