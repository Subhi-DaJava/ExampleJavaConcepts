package inheritance.same_attributes;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name + " : " + p.getMessage());
    }
}
