package constructor.instantiate_empty_constructor;

public class Test {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
        System.out.println(tshirt.getSize()); // L
        System.out.println(tshirt.getColor()); // blanc
        System.out.println(tshirt.getPrice()); // 12.4
    }
}
