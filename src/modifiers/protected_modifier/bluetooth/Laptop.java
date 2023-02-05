package modifiers.protected_modifier.bluetooth;

/**
 * In the example below, the package modifiers.protected_modifier.hightech
 * has three classes: Laptop, SmartPhone, and SmartWatch.
 * All the gadgets in the package can be connected via "Bluetooth".
 * Laptop has a method receiveInfo(), responsible for getting any information from connected gadgets.
 *
 * When you're not sure about the modifier, which one should you use? // the most restrictive available modifier
 * Not for class. A class (except nested classes) can only 2 access modifier (package-private and public).
 */
public class Laptop {
    // single field info which is not directly accessible since it is declared as private.
    private String info;

    // all classes from the same package can access it invoking the "receiveInfo" method which is declared as "package-private" (no modifier), at default.
    void receiveInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "info='" + info + '\'' +
                '}';
    }
}
