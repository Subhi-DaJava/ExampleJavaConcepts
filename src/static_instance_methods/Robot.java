package static_instance_methods;

/**
 * Robot for representing walking robots.
 * The robot can take some steps in any of the four directions: left, right, forward (up) and backward (down), but its coordinates are always limited: x >= 0, y >=0
 * Where will the robot be after the following code is executed? Select a pair (x, y).
 * ben.moveRight(3);
 * ben.moveUp(2);
 * ben.moveLeft(4);
 * ben.moveUp(2);
 * ben.moveRight(1);
 * Response :
 *
 * Look at main class fot the right answer.
 */
public class Robot {
    int x, y;

    public void moveRight(int steps) {
        x += steps;
    }

    public void moveUp(int steps) {
        y += steps;
    }

    public void moveLeft(int steps) {
        x -= steps;
        if (x < 0) {
            x = 0;
        }
    }

    public void moveDown(int steps) {
        y -= steps;
        if (y < 0) {
            y = 0;
        }
    }
}
