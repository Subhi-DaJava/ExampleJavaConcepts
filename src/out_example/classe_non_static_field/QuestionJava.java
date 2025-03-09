package out_example.classe_non_static_field;

/**
 * Ne compile pas car la méthode main essaie d'accéder à la variable "var" qui est une variable d'instance.
 * il faudrait soit rendre "var" statique, soit créer une instance de QuestionJava dans la méthode main.
 * */

public class QuestionJava {
    static String var = "we"; // String var = "we"; Non-static field 'var' cannot be referenced from a static context

    public static void main(String[] data) {
        String var2 = "lovedevs";
        System.out.print(var + var2);
    }
}
