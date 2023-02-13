package method_overriding.theory;

/**
 * Recall,that "overloading" is a feature that allows a class to have more than one method with the same name, if their arguments are different.
 * <p>
 * Java provides an opportunity to declare a method in a subclass with the same name as a method in the superclass.
 * This is known as method overriding. The benefit of overriding is that a subclass can give its own specific implementation of a superclass method.
 * <p>
 * Overriding methods in subclasses allows a class to inherit from a superclass whose behavior
 * is "close enough" and then to change this behavior as the subclass needs.
 * <p>
 * Instance methods can be overridden if they are inherited by the subclass. The overriding method must have the same name,
 * parameters (number and type of parameters), and the return type (or a subclass of the type) as the overridden method.
 * <p>
 * As you can see, each subclass has its own implementation of the method sayHello.
 * <p>
 * You can invoke the base class method in the overridden method using the keyword super.
 * Rules:
 * the method must have the same name as in the superclass;
 * the arguments should be exactly the same as in the superclass method;
 * the return type should be the same type or a subtype of the return type declared in the method of the superclass;
 * the access level must be the same or more open than the overridden method's access level;
 * a private method cannot be overridden because it's not inherited by subclasses;
 * if the superclass and its subclass are in the same package, then package-private methods can be overridden;
 * static methods cannot be overridden.
 * <p>
 * We can also override and overload an instance method in a subclass at the same time. Overloaded methods do not override superclass instance methods.
 * They are new methods, unique to the subclass.
 */
public class OverridingMethod {
    public static void main(String[] args) {
        System.out.println("New Mammal");
        Mammal mammal = new Mammal();
        System.out.println("New Cat");
        Mammal cat = new Cat();
        System.out.println("New Human");
        Mammal human = new Human();
        System.out.println("First print mammal.sayHello....");
        System.out.println(mammal.sayHello());
        System.out.println("First print cat.sayHello....");
        System.out.println(cat.sayHello());
        System.out.println("First print human.sayHello....");
        System.out.println(human.sayHello());

        System.out.println("************************************************************");
        Mammal mammalA = new Mammal();
        System.out.println(mammalA.sayHello()); // it prints "ohlllalalalalalaoaoaoa"
        System.out.println("New CatA");
        Cat catA = new Cat();
        System.out.println(catA.sayHello()); // it prints "meow"
        System.out.println("New HumanA");
        Human humanA = new Human();
        System.out.println(humanA.sayHello()); // it prints "hello"
    }

}

class Mammal {
    /*    public Mammal() {
            System.out.println(this.sayHello());
        }*/
    public String sayHello() {
        return "ohlllalalalalalaoaoaoa";
    }
}

class Cat extends Mammal {
    /*   public Cat() {
           super.sayHello();
           System.out.println(sayHello());
       }*/
    // The @Override annotation indicates that the method is overridden. This annotation is optional but helpful.
    // To verify these rules, there is a special annotation @Override. It allows you to know whether a method will be actually overridden or not.
    @Override
    public String sayHello() {
        // You can invoke the base class method in the overridden method using the keyword super.
        System.out.println(super.sayHello());
        return "meow";
    }
}

class Human extends Mammal {
    public Human() {
        super();
        System.out.println(sayHello());
    }

    @Override
    // To verify these rules, there is a special annotation @Override. It allows you to know whether a method will be actually overridden or not.
    public String sayHello() {
        // You can invoke the base class method in the overridden method using the keyword super.
        System.out.println(super.sayHello());
        return "hello";
    }
}