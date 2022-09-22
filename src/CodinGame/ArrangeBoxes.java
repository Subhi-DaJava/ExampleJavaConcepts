package CodinGame;

import java.util.Arrays;

public class ArrangeBoxes {
    public static int[] createStack(int arrLength, int totalBoxes) {
        int boxPerStack = totalBoxes / arrLength;
        int[] newStack = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            newStack[i] = boxPerStack;
        }

        int remainder = totalBoxes % arrLength;
        if(remainder != 0) {
            for (int i = 0; i < remainder; i++) {
                newStack[i]++;
            }
        }

        return newStack;
    }

    public static int totalBoxes(int[] boxes){
        int sum = 0;
        for (int elt : boxes) {
            sum += elt;
        }
        return sum;
    }

    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
        int totalBoxes = totalBoxes(boxes);
        int targetPos = 0;

        if(boxInClaw) {
            int[] targetStack = createStack(boxes.length, totalBoxes + 1);
            for (int i = 0; i < boxes.length; i++) {
                if(boxes[i] < targetStack[i]) {
                    targetPos = i;
                    break;
                }
            }
            if(clawPos == targetPos){
                return "PLACE";
            }
            else if(clawPos < targetPos) {
                return "RIGHT";
            }
            else {
                return "LEFT";
            }
        } else {
            int[] targetStack = createStack(boxes.length, totalBoxes);
            for (int i = 0; i < boxes.length; i++) {
                if(boxes[i] > targetStack[i]) {
                    targetPos = i;
                    break;
                }
            }
            if(clawPos == targetPos) {
                return "PICK";
            }
            else if(clawPos < targetPos) {
                return "RIGHT";
            }
            else {
                return "LEFT";
            }
        }
    }

    public static void main(String[] args) {
        int[] boxes = {2, 2, 2, 4, 3, 2, 1};
        int sum = totalBoxes(boxes);
        System.out.println(sum); // 15
        int[] newStack = createStack(boxes.length,sum);
        System.out.println(Arrays.toString(newStack)); // [3, 3, 2, 2, 2, 2, 2]

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

        int random1 = (int) (Math.random()*6);
        System.out.println("Random number1 = " + random1);
        String commandRandomTrue = solve( random1, boxes, true); // generate random numbers within 0 to 5
        System.out.println("Command random 1 box in claw = " + commandRandomTrue);


        int random2 = (int) (Math.random() * 6);
        System.out.println("Random number2 = " + random2);
        String commandRandomFalse = solve(random2, boxes, false); // generate random numbers within 0 to 5
        System.out.println("Command random  no box in claw = " + commandRandomFalse);

    }
}
