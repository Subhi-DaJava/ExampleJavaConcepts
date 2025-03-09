package out_example.parent_child.parent_static_method;

public class Child extends Parent {
   // @Override, Error ⮕ static methods cannot be annotated with @Override
    public static void print() {
        System.out.println("enfant") ;
    }
}
