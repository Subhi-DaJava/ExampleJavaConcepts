package constructor;

/**
 * Sometimes we need to initialize all fields of an object when creating it,
 * but there are cases in which it might be appropriate to initialize only one or several fields.
 * Fortunately, for this purpose, a class can have several constructors that assign values to the fields in different ways.
 * <p>
 * Multiple constructors and define the way they interact with each other: Constructor overloading
 * You can define as many constructors as you need. Each constructor should have a name that matches the class name but the parameters should be different.
 * The situation when a class contains multiple constructors is known as constructor overloading.
 * <p>
 * Invoking constructors from other constructors:
 * We can also invoke a constructor from another one.
 * It allows you to initialize one part of an object by one constructor and another part by another constructor.
 * Calling a constructor inside another one is done using "this". this(); -> calls a no-argument constructor,this("arg1", "arg2"); -> calls a constructor with two string arguments
 */
public class Robot {
    String name;
    String model;
    int lifetime;

    // no-argument constructor that initializes fields with default values;
    public Robot() {
        this.name = "Anonymous";
        this.model = "Unknown";
    }

    // Robot(String name, String model) takes two parameters and assigns them to the corresponding fields.
    // Robot(String name, String model) is a two-argument constructor that invokes another constructor;
    // The second constructor invokes the third one and passes name, model, and lifetime = 20 to it.
    // The third constructor, in its turn, initializes all fields of the created object.
    // The keyword this with parenthesis allows programmers to invoke a constructor from another one.
    public Robot(String name, String model) {
        this(name, model, 20); // if no this invocation, use this code below;
        /*this.name = name;
        this.model = model;*/
    }

    // Robot(String name, String model, int lifetime) is a three-argument constructor that fills all fields.
    public Robot(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
        System.out.println("The third constructor is invoked");
    }


}
