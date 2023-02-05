package inheritance.referencing_subclass.test.animal;

public class Pet extends Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
