package super_keyword.example;

public class SuperClass {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.printSubValue();
    }
    protected int field;

    protected int getField() {
        return field;
    }

    protected void printBaseValue() {
        System.out.println(field);
    }
}

class SubClass extends SuperClass {

    protected int field;

    public SubClass() {
        this.field = 30;  // It initializes the field of SubClass
        field = 30;       // It also initializes the field of SubClass
        super.field = 20; // It initializes the field of SuperClass
    }

    /**
     * It prints the value of SuperClass and then the value of SubClass
     * In the body of the method printSubValue , the superclass method printBaseValue is invoked.
     * Here, the keyword super is optional.
     * It is required when a subclass method has the same name as a method in the base class.
     * This case will be considered in the topic concerning overriding.
     */
    public void printSubValue() {
        super.printBaseValue(); // It invokes the method of SuperClass, super is optional here
        System.out.println(field);
    }
}
