package tostring_methode.practice.test2;

/**
 * You are given a class named Time. It has three int fields: hours, minutes and seconds.
 * Override the method toString in the class to return a string representation of an object.
 * <p>
 * The overridden method must return a string with hours, minutes and seconds separated by colons. If a number contains only a single digit, add a zero first.
 * <p>
 * Here are some examples: "23:59:59", "11:08:05", "01:01:01".
 */
public class Time {
    public static void main(String[] args) {
        Time time = new Time(9, 11, 1);
        System.out.println(time);
    }

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {

       /* if (hours < 10 && minutes >= 10 && seconds >= 10) {
            return "\"" + "0" + hours + ":" + minutes + ":" + seconds + "\"";
        } else if (hours >= 10 && minutes < 10 && seconds >= 10) {
            return "\"" + hours + ":" + "0" + minutes + ":" + seconds + "\"";
        } else if (hours >= 10 && minutes < 10) {
            return "\"" + hours + ":" + "0" + minutes + ":" + "0" + seconds + "\"";
        }else if (hours < 10 && minutes >= 10) {
            return "\"" + "0" + hours + ":" + minutes + ":" + "0" + seconds + "\"";
        }else if (hours >= 10 && seconds < 10) {
            return "\"" + hours + ":" + minutes + ":" + "0" + seconds + "\"";
        } else if (hours < 10 && seconds < 10) {
            return "\"" + "0" + hours + ":" + "0" + minutes + ":" + "0" + seconds + "\"";
        } else if (hours < 10 && seconds > 10) {
            return "\"" + "0" + hours + ":" + "0" + minutes + ":" + seconds + "\"";
        } else {
            return "\"" + hours + ":" + minutes + ":" + seconds + "\"";
        }*/
        return "\"" + String.format("%02d:%02d:%02d", hours, minutes, seconds) + "\"";
    }
}
