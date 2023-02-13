package pholymorphism.practice;

/**
 * There are three objects:
 * <p>
 * Notification notif = new Notification("No problems");
 * <p>
 * Notification warn = new Warning("Money ends");
 * <p>
 * Notification alarm = new Alarm("The ship sank");
 * <p>
 * Correct answers :
 * notif.show() outputs "No problems"
 * alarm.getMsg() returns "ALARM: The ship sank"
 * warn.getMsg() returns "WARN: Money ends"
 * warn.show() outputs "No problems"
 * alarm.show() outputs "ALARM: The ship sank"
 */
public class Notification {
    protected String msg;

    public Notification(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println(getMsg());
    }

    public String getMsg() {
        return msg;
    }
}

class Warning extends Notification {

    public Warning(String msg) {
        super(msg);
    }

    @Override
    public String getMsg() {
        return "WARN: " + msg;
    }
}

class Alarm extends Notification {

    public Alarm(String msg) {
        super(msg);
    }

    @Override
    public void show() {
        System.out.println("ALARM: " + msg);
    }
}
