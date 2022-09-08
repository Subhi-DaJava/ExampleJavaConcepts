package interfaceFonctionnelle.javaUtilFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * java.util.function.Function<T,R> : sa méthode fonctionnelle a la signature R apply(T).
 * Elle permet donc de traité un paramètre T et de renvoyer un type R.
 *
 * java.util.function.BinaryOperation : S'utilise pour les opérations de type reduce comme additionner deux int par exemple (on y reviendra lorsque nous parlerons des streams).
 * Sa méthode T apply(T t, T t2) prend deux T en paramètre et renvoi un T (T BinaryOperation(T,T).
 *
 * Attention : dans ces interfaces, je n'ai mentionné que leur méthode fonctionnelle. Elles peuvent avoir des méthodes par défauts.
 *
 */


public class TestFunction {
    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        Function<Personne, String> f1 = (Personne p) -> p.getNom(); // expression lambda
        Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2; // expression lambda

        System.out.println(transformToListString(lPersonne, f1)); // retourne la list des noms

        /*
        Je vais en profiter pour vous montrer aussi comment surcharger une méthode par défaut de ces interfaces fonctionnelles.
         Par exemple, dans celle que nous venons d'utiliser, il y a la méthode addThen qui permet d'appliquer une fonction après le traitement.
         Par exemple, nous obtenons exactement le même résultat que précédemment avec ce code :
         */


     /*   // On ne multiplie plus l'age par 2
        Function<Personne, Integer> f2 = (Personne p) -> p.getAge();
        // Nous définissons un traitement supplémentaire sur l'âge
        Function<Integer, Integer> f3 = (Integer a) -> a * 2;
        System.out.println(transformToListInt(lPersonne, f2.andThen(f3)));*/

        System.out.println(transformToListInt(lPersonne, f2)); // retourne la list des ages
    }

    public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
        List<String> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.apply(p));
            //func.apply(p) retournera ici le nom de l'objet Personne
        }
        return ls;
    }
    public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func){
        List<Integer> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.apply(p));
            //func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
        }
        return ls;
    }

}
