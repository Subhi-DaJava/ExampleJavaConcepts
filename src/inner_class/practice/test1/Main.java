package inner_class.practice.test1;

public class Main {
    public static void main(String[] args) {
        boolean forHalloween = true;
        Pumpkin pumpkin = new Pumpkin(forHalloween);
        // Pumpkin.Candle candle = pumpkin.new Candle();
        pumpkin.addCandle();
        Pumpkin pumpkinNoCandle = new Pumpkin(!forHalloween);
        pumpkinNoCandle.addCandle();
    }
}
