package constructor;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(); // name is "robot", model is "Unknown"
        Robot andrew = new Robot("Andrew", "NDR-114"); // name is "Andrew", model is "NDR-114"; print "The third constructor is invoked"
    }
}
