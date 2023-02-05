package inheritance.referencing_subclass.test.animal;
// all invalid method invocations : cat.GetColor(); & cat.setColor("red");
public class Main {
    public static void main(String[] args) {

        Pet cat = new Cat();
        cat.setName("Bostan");
        cat.setAge(2);
        System.out.println(cat.age);
        System.out.println(cat.getAge());
        System.out.println(cat.name);
        System.out.println(cat.getName());
    }
}
