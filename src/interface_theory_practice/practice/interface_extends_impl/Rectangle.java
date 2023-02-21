package interface_theory_practice.practice.interface_extends_impl;

// to implement the new interface in rectangle class;
public class Rectangle implements MutableShape {

    /**
     * Defines the X coordinate of the upper-left corner of the rectangle.
     */
    private float x;

    /**
     * Defines the Y coordinate of the upper-left corner of the rectangle.
     */
    private float y;

    /**
     * Defines the width of the rectangle.
     */
    private float width;

    /**
     * Defines the height of the rectangle.
     */
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    // move should add dx and dy to the upper-left corner of a rectangle.
    @Override
    public void move(float dx, float dy) {
        this.x = dx + this.x;
        this.y = dy + this.y;
    }

    // scale should multiply width and height of a rectangle by the specified factor;
    @Override
    public void scale(float factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;
    }
}
