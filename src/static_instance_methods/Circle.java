package static_instance_methods;

/**
 * getLength that returns the double representing the length of the circumference of this circle;
 * getArea that returns the double representing the area of this circle.
 * the special constant Math.PI.
 */
public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 3;
        System.out.println(circle.getLength());
        System.out.println(circle.getArea());
    }

    double radius;

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
