package interface_theory_practice.practice.interface_extends_impl;

public class Main {
    public static void main(String[] args) {
        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
        MutableShape rectangle = new Rectangle(2.0f, 3.5f, 10.1f, 5.6f);

        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);
        rectangle.move(10.1f, 20.2f);
        rectangle.scale(2.2f);

        ((Circle) circle).getRadius();
        System.out.println(((Circle) circle).getRadius());
        System.out.println(((Rectangle) rectangle).getX());


    }
}
