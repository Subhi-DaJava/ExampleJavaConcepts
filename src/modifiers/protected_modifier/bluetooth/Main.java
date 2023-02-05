package modifiers.protected_modifier.bluetooth;

public class Main {
    public static void main(String[] args) {
        MobileGadget mobileGadget = new MobileGadget();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();
        Laptop laptop = new Laptop();

        laptop.receiveInfo("Hi, infos from Laptop class");
        System.out.println(laptop);
        mobileGadget.printNotification("Hi, this from Mobile Gadget class");
        smartWatch.printNotification("Hi, this from Smart Watch class");
        smartPhone.printNotification("hi, this from Smart Phone Class");
    }
}
