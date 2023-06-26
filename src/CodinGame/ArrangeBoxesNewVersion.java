package CodinGame;

import java.util.Arrays;

public class ArrangeBoxesNewVersion {
    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
        int totalBoxes = 0;
        int maxBoxes = 0;

        // Calculer le nombre total de boîtes et le nombre maximum de boîtes sur un tas
        for (int box : boxes) {
            totalBoxes += box;
            maxBoxes = Math.max(maxBoxes, box);
        }

        int targetBoxes = totalBoxes / boxes.length; // Nombre cible de boîtes par tas

        // Distribuer les boîtes en excès sur les tas de gauche à droite
        for (int i = 0; i < boxes.length; i++) {
            int diff = boxes[i] - targetBoxes; // Différence entre le nombre actuel de boîtes et le nombre cible

            // Déplacer le bras robotique à la position du tas
            while (clawPos < i) {
                clawPos++;
                return "RIGHT";
            }
            while (clawPos > i) {
                clawPos--;
                return "LEFT";
            }

            // Distribuer les boîtes en excès
            if (diff > 0) {
                boxes[i] = targetBoxes; // Mettre à jour le nombre de boîtes sur le tas
                return "PICK";
            }
            // Ajouter les boîtes manquantes
            else if (diff < 0) {
                boxes[i] = targetBoxes; // Mettre à jour le nombre de boîtes sur le tas
                return "PLACE";
            }
        }

        // Déplacer le bras robotique à la position initiale s'il transporte une boîte
        if (boxInClaw) {
            while (clawPos > 0) {
                clawPos--;
                return "LEFT";
            }
            return "PLACE";
        }

        return ""; // Retourner une chaîne vide si aucune action n'est requise
    }


    public static void main(String[] args) {
        int[] boxes = {2, 2, 2, 4, 3, 2, 1};

        String command1 = solve(0, boxes, true); // PLACE, origin 2(index 0), target 3(return target index 0)
        System.out.println("Command 1 = " + command1);

        String command2 = solve(3,boxes, true); // LEFT origin 4(index 3), target 2(return target index 0))
        System.out.println("Command 2 = " + command2);

        String command3 = solve(4, boxes, true); // LEFT origin 3(index 4), target 2(return target index 0)
        System.out.println("Command 3 = " +command3);

        String command4 = solve(0, boxes, false); // RIGHT origin 2(index 0), target 3(return target index 3)
        System.out.println("Command 4 = " + command4);

        String command5 = solve(4, boxes, false); // LEFT origin 3, target 2(return target index 3)
        System.out.println("Command 5 = " + command5);

        String command6 = solve(3, boxes, false); // PICK, origin 4, target 3(return target index 3)
        System.out.println("Command 6 = " + command6);

        int random1 = (int) (Math.random()*7);
        System.out.println("Random number1 = " + random1);
        String commandRandomTrue = solve( random1, boxes, true); // generate random numbers within 0 to 5
        System.out.println("Command random 1 box in claw = " + commandRandomTrue);


        int random2 = (int) (Math.random() * 7);
        System.out.println("Random number2 = " + random2);
        String commandRandomFalse = solve(random2, boxes, false); // generate random numbers within 0 to 5
        System.out.println("Command random  no box in claw = " + commandRandomFalse);

    }
}
