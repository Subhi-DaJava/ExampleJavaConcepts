package singletonclass;

public class MainSingletonB {
    public static void main(String[] args) {
        SingletonB a = SingletonB.SingletonB();
        SingletonB b = SingletonB.SingletonB();
        SingletonB c = SingletonB.SingletonB();

        a.str = (a.str).toUpperCase();
        System.out.println("String a.str is after uppercase is : " + a.str);
        System.out.println("String b.str is : " + b.str);
        System.out.println("String c.str is : " + c.str);

        System.out.println();

        c.str = (c.str).toLowerCase();
        System.out.println("String a.str after : " + a.str);
        System.out.println("String b.str after : " + b.str);
        System.out.println("String c.str after lowercase is : " + c.str);
    }
}
