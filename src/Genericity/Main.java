package Genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solo<Integer> val = new Solo<>(12);
        Solo<String> valS = new Solo<>("TOTOTOTO");
        Solo<Float> valF = new Solo<>(12.2f);
        Solo<Double> valD = new Solo<>(12.202568);


        System.out.println(val.getVal());
        System.out.println(valS.getVal());
        System.out.println(valF.getVal());
        System.out.println(valD.getVal());

        System.out.println("************************************************");
        int i = new Integer(12);         //Est équivalent à int i = 12
        double d1 = new Double(12.2586);  //Est équivalent à double d = 12.2586
        Double d = 12.0;
        Character c = 'C';
        List al = new ArrayList();
        //Avant Java 5 il fallait faire al.add(new Integer(12))
        //Depuis Java 5 il suffit de faire
        al.add(12);
        //…

        System.out.println("***********************Due*************************");

        Duo<String, Boolean> dual = new Duo<>("toto", true);
        System.out.println("Valeur de l'objet dual : valT = " + dual.getValueT() + ", valS = " + dual.getValueS());

        Duo<Double, Character> dual2 = new Duo<>(12.2585, 'C');
        System.out.println("Valeur de l'objet dual2 : valT = " + dual2.getValueT() + ", valS = " + dual2.getValueS());

        System.out.println("***************************Collections***********************************");

        System.out.println("\nList de String");
        System.out.println("\n----------------List String----------------------");
        List<String> listString = new ArrayList<>();
        listString.add("Une chaîne");
        listString.add("Une autre");
        listString.add("Encore une autre");
        listString.add("Allez, une dernière");

        for (String str : listString){
            System.out.println(str);
        }

        System.out.println("\nList de float");
        System.out.println("-------------------List Float-----------------------------");
        List<Float> listFloat = new ArrayList<>();
        listFloat.add(12.25f);
        listFloat.add(15.25f);
        listFloat.add(22.25f);
        listFloat.add(12333.255533f);
        for (float f : listFloat){
            System.out.println(f);
        }

        System.out.println("-----------------List asList------------------");
        List<String> words = Arrays.asList("Welcome", "to", "Baeldung");
        for (String w : words){
            System.out.println(w);
        }

        if (words.contains("Baeldung")) {
            System.out.println("Baeldung is in the list");
        }
        if(!words.contains("Coucou")) {
            System.out.println("Yes, you a right");
        }
        else {
            System.out.println("non");
        }

    }
}
