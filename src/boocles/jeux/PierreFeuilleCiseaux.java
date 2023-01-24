package boocles.jeux;

import java.util.Random;
import java.util.Scanner;

public class PierreFeuilleCiseaux {

    public static void main(String[] args) {

        jeuxPierreFeuilleCiseaux();
    }

    public static void jeuxPierreFeuilleCiseaux() {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int totalUser = 0;
        int totalSystem = 0;

        System.out.println("Bonjour, bienvenu au jeux, tentez votre chance, choisissez une parmi ces trois atouts : Pierre, Feuille, Ciseaux");
        String choix ;
        int random ;

        while (totalUser < 3 && totalSystem < 3) {
            choix = input.nextLine();
            random = r.nextInt(3) + 1;

            switch (choix) {
                case "Pierre":
                    if (random == 2) {
                        totalSystem++;
                        System.out.println("Programme gagne cette fois-ci.");
                    } else if (random == 3) {
                        totalUser++;
                        System.out.println("Félicitation, vous avez gagné ce tour.");
                    } else {
                        System.out.println("Vous ête égale.");
                    }
                    break;
                case "Feuille":
                    if (random == 1) {
                        totalUser++;
                        System.out.println("Félicitation, vous avez gagné ce tour.");
                    } else if (random == 3) {
                        totalSystem++;
                        System.out.println("Programme gagne cette fois-ci.");
                    } else {
                        System.out.println("Vous ête égale");
                    }
                    break;
                case "Ciseaux":
                    if (random == 1) {
                        totalSystem++;
                        System.out.println("Programme gagne cette fois-ci.");
                    } else if (random == 2) {
                        totalSystem++;
                    } else {
                        System.out.println("Félicitation, vous avez gagné ce tour.");
                    }
                    break;
                default:
                    System.out.println("Respectez la consigne du jeux, svp!");
                    System.out.println("Retapez votre choix...");
                    break;
            }
                System.out.println("Continuez à choisir...");
        }

        if(totalUser > totalSystem) {
            System.out.println("Bravo vous avez gagné, jeux est terminé. Votre score : " + totalUser + ", celui de programme: " + totalSystem);
        }
        if(totalUser < totalSystem) {
            System.out.println("System a gagné, jeux est terminé, " +
                    "relancez le programme pour retenter votre chance. Votre score : " + totalUser + ", celui de programme: " + totalSystem);
        }
    }
}

