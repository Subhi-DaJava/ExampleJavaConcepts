package inheritance.referencing_subclass.test.animal;

public class Cat extends Pet {
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
