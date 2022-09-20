package ObjectClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Le but du jeu consiste à créer un objet Paire sans utiliser l'opérateur new.
 * Pour instancier un nouvel objet Paire, commençons par récupérer ses constructeurs.
 * Ensuite, nous préparons un tableau contenant les données à insérer, puis invoquons la méthode toString().
 *
 * Lorsque votre JVM interprète votre programme, elle crée automatiquement un objet Class pour chaque classe chargée.
 *
 * Avec un tel objet, vous pouvez connaître absolument tout sur votre classe.
 *
 * L'objet Class utilise des sous-objets tels que Method, Field et Constructor qui permettent de travailler avec vos différents objets ainsi qu'avec ceux présents dans Java.
 *
 * Grâce à cet objet, vous pouvez créer des instances de vos classes Java sans utiliser new.
 */
public class InstanciationDynamique {
    public static void main(String[] args) {
        String nom = Paire.class.getName();
        try{
            // On crée un objet classe
            Class c1 = Class.forName(nom);
            // Nouvelle instance de la classe Paire,
            Object o = c1.newInstance();
            // On crée les parameters du constructor
            Class[] types = new Class[]{String.class, String.class};
            // On récupère le constructeur avec les parameters
            Constructor ct = c1.getConstructor(types);

            // On instancie l'objet avec le constructeur surchargé
            Object o2 = ct.newInstance(new String[]{"Valeur 1", "Valeur 2"});

            // On va hercher la méthode toString, elle n'a aucune paramètre
            Method m = c1.getMethod("toString", null);
            // La méthode invoke exécute la méthode sur l'objet passé en paramètre
            // Pas de paramètre, donc null en deuxième paramètre de la méthode invoke !
            System.out.println("--------------------------------------------------------------");
            System.out.println("Méthode " + m.getName() + " sur o2: " + m.invoke(o2, null));
            System.out.println("Méthode " + m.getName() + " sur o: " + m.invoke(o, null));

        } catch (SecurityException s){
            s.printStackTrace();
        } catch (IllegalArgumentException i){
            i.printStackTrace();
        } catch (ClassNotFoundException c){
            c.printStackTrace();
        } catch (InstantiationException in){
            in.printStackTrace();
        } catch (IllegalAccessException ia){
            ia.printStackTrace();
        } catch (NoSuchMethodException n){
            n.printStackTrace();
        } catch (InvocationTargetException it){
            it.printStackTrace();
        }
    }
}
