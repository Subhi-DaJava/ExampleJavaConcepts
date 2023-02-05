package modifiers.protected_modifier.bluetooth;

/**
 * The SmartWatch class has a private method countHeartRate,
 * which is not available from other classes (even from a “brother” class SmartPhone).
 * It also uses the Laptop's method of receiving data and a parent's method to print the notification
 */
public class SmartWatch extends MobileGadget{
    private int avgHeartRate;
    private Laptop connectedLaptop;

    public SmartWatch() {
        this.avgHeartRate = 75;
        this.connectedLaptop = new Laptop();
    }

    private int countHeartRate() {
        System.out.println("Counting heart rate");
        return avgHeartRate;
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
