package modifiers.protected_modifier.bluetooth;

/**
 * The SmartPhone class can access the "receiveInfo" method of the Laptop class and the "printNotification" method of the "MobileGadget" class.
 */
public class SmartPhone extends MobileGadget{
    private Laptop connectedLaptop;

    public SmartPhone() {
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
