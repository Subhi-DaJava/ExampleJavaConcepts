package interface_theory_practice.practice.interface_extends_impl;

// to implement the new interface in Circle class;
public class Circle implements MutableShape {

    /**
     * Defines the horizontal position of the center of the circle
     */
    private float centerX;

    /**
     * Defines the vertical position of the center of the circle
     */
    private float centerY;

    /**
     * Defines the radius of the circle
     */
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    // move should add dx and dy to the center of a circle;
    @Override
    public void move(float dx, float dy) {
        this.centerX = dx + this.centerX;
        this.centerY = dy + this.centerY;
    }

    // scale should multiply the radius of a circle by the specified factor;
    @Override
    public void scale(float factor) {
        this.radius = this.radius * factor;
    }
}
