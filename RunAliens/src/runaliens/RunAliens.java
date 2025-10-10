package runaliens;

import java.util.Locale;
import java.util.Scanner;

public class RunAliens {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.useLocale(Locale.ENGLISH);

        Creature[] aliens = new Creature[10];
        aliens[0] = new Creature();
        aliens[1] = new Martian(5, 4, 6, 3);
        aliens[2] = new Venusian(6, 2, 2, true);
        aliens[3] = new Venusian(4, 4, 4, false);
        aliens[4] = new Martian(12, 4, 2, 3);
        int nrAliens = 5;

        System.out.println("All aliens in array");
        System.out.println("-------------------");
        for (int i = 0; i < nrAliens; i++) {
            if (aliens[i] instanceof Venusian) {
                System.out.println((i + 1) + ") VENUSIAN:");
            } else if (aliens[i] instanceof Martian) {
                System.out.println((i + 1) + ") MARTIAN");
            } else {
                System.out.println((i + 1) + ") CREATURE");
            }
            System.out.println(aliens[i]);
            aliens[i].speak();
            aliens[i].move();
            System.out.println("");
        }
        System.out.
                println("===================================================");

        System.out.println("Only the Venusians");
        System.out.println("------------------");
        for (int i = 0; i < nrAliens; i++) {
            if (aliens[i] instanceof Venusian) {
                System.out.println(aliens[i]);
                aliens[i].speak();
                aliens[i].move();
                System.out.println("");
            }
        }
        System.out.
                println("===================================================");

        // determining WHICH Martian has the MOST appendages
        int pos = -1; // initialize the position "keeper"
        int max = -1; // initialize the max to very small value 
        int appendages;
        for (int i = 0; i < nrAliens; i++) { // step through every filled element
            if (aliens[i] instanceof Martian) { //We have a Martian, need to cast
                Martian mart = (Martian) aliens[i];  //Cast the Creature element as a Martian. 
                appendages = mart.totalAppendages(); // After the casting only use mart not aliens[i]
                if (appendages > max) {
                    max = appendages;
                    pos = i;
                }
            }
        }

        if (pos > -1) {
            System.out.println(
                    "The Martian with index " + pos + " has the most appendages, namely " + max);
        } else {
            System.out.println(
                    "There are no Martians in the array of aliens");
        }

    }// end of main

}// end of class
