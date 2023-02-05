package modifiers.protected_modifier.bluetooth;

/**
 * SmartPhone and SmartWatch classes extend the same MobileGadget class with the "printNotification" method
 */
public class MobileGadget {
    // The "printNotification" method is accessible for all subclasses of this class as well as for all classes in the same package (including the Laptop class).
    protected void printNotification(String data) {
        System.out.println(data);
    }
}
