package pholymorphism.theory.super_animal;

/**
 * A reminder: method overriding is when a subclass redefines a method of the superclass with the same signature.
 * <p>
 * Run-time polymorphism relies on two principles:
 * <p>
 * a reference variable of the superclass can refer to any subtype object;
 * a superclass method can be overridden in a subclass.
 * Run-time polymorphism works when an overridden method is called through the reference variable of a superclass.
 * Java determines at runtime which version of the method (superclass/subclasses) is to be executed based on the type of the object being referred,
 * not the type of reference. It uses a mechanism known as dynamic method dispatching.
 * <p>
 * Example. Here, you can see a class hierarchy.
 * The superclass MythicalAnimal has two subclasses: Chimera and Dragon. The base class has a method hello. Both subclasses override this method.
 */
public class MythicalAnimal {
    public static void main(String[] args) {
        // create a reference to the class MythicalAnimal and assign the subclass object to it:
        // Java determines at runtime which version of the method (superclass/subclasses) is to be executed based on the type of the object being referred,
        // not the type of reference.
        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal animal = new MythicalAnimal();

        // invoke overridden methods through the base class references:
        chimera.hello(); // Hello! Hello!
        dragon.hello(); // Rrrr...
        animal.hello(); // Hello, I'm an unknown animal

        // the result of a method call depends on the actual type of instance, not the reference type.
        // It's a polymorphic feature in Java. The JVM calls the appropriate method for the object that is referred to in each variable.
    }

    public void hello() {
        System.out.println("Hello, I'm an unknown animal");
    }
}

class Chimera extends MythicalAnimal {
    @Override
    public void hello() {
        System.out.println("Hello! Hello!");
    }
}

class Dragon extends MythicalAnimal {
    @Override
    public void hello() {
        System.out.println("Rrrr...");
    }
}