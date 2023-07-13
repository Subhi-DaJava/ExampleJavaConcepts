package java_100_examples;

public class CheckOrElseCondition {
    public static void numberImPair(int number) {
        String srt = "3";
        String srt2 = "null";
        if ( srt2 == null || number %5 == 0 || number%(Integer.parseInt(srt)) == 0 ) {
            System.out.println("Number / 7 = " + number%7);
            System.out.println("Number / 5 = " + number%5);
            System.out.println("Number / 3 = " + number%3);
        } else  {
            System.out.println("Else Number / 7 = " + number%7);
            System.out.println("Else Number / 5 =" + number%5);
            System.out.println("Else Number / 3 = " + number%3);
        }
    }

    public static void main(String[] args) {
        numberImPair(5);
    }
}
