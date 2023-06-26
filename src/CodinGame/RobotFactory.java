package CodinGame;

import java.util.ArrayList;
import java.util.List;

public class RobotFactory {

    public static void main(String[] args) {
        int[] boxes = {2, 2, 2, 4, 3, 2, 1};
        System.out.println(solve(0, boxes, false));
    }
    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
        int targetBoxes = sum(boxes) / boxes.length; // Nombre de boîtes cible par tas

        List<String> commands = new ArrayList<>();

        // Si le bras porte une boîte, on commence par la poser
        if (boxInClaw) {
            commands.add("PLACE");
        }

        int currentPos = clawPos;
        int currentBoxCount = boxes[clawPos];

        while (!isTargetDistribution(boxes, targetBoxes)) {
            if (currentBoxCount > targetBoxes) {
                int excess = currentBoxCount - targetBoxes;
                commands.add("PICK");
                commands.add("LEFT");
                commands.add("PLACE");
                commands.add("RIGHT");
                for (int i = 0; i < excess; i++) {
                    commands.add("PICK");
                    commands.add("LEFT");
                    commands.add("PLACE");
                    commands.add("RIGHT");
                }
            } else if (currentBoxCount < targetBoxes) {
                commands.add("PICK");
                commands.add("RIGHT");
                commands.add("PLACE");
                commands.add("LEFT");
            }

            // Mettre à jour la position et le nombre de boîtes courants
            currentPos = (currentPos + 1) % boxes.length;
            currentBoxCount = boxes[currentPos];
        }

        return String.join(",", commands);
    }

    // Vérifie si la distribution des boîtes est conforme à la cible
    private static boolean isTargetDistribution(int[] boxes, int targetBoxes) {
        for (int count : boxes) {
            if (count != targetBoxes) {
                return false;
            }
        }
        return true;
    }

    // Calcule la somme des éléments d'un tableau
    private static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
