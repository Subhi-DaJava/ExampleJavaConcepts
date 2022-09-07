package ObjectClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Exemple : vous avez créé trois nouvelles classes Java. À l'exécution de votre programme,
 * la JVM va créer un objet Class pour chacune d'elles. Comme vous devez vous en douter,
 * cet objet possède une multitude de méthodes permettant d'obtenir tous les renseignements possibles et imaginables sur une classe.
 */
public class ObjectClass {
    public static void main(String[] args) {
        Class c = String.class;
        Class c2 = String.class.getClass();

        System.out.println("**************************************** 1. Connaître la superclasse d'une classe *****************************************************************");
        // 1. Connaître la superclasse d'une classe
        System.out.println("La superclasse de la classe " + c.getName() + " est : "+  c.getSuperclass()); // La superclasse de la classe java.lang.String est : class java.lang.Object
        System.out.println("La superclasse de la classe " + Object.class.getName() + " est : "+  Object.class.getSuperclass()); // La superclasse de la classe java.lang.Object est : null

        System.out.println("******************************************* 2. Connaître la liste des interfaces d'une classe **************************************************************");
        // 2. Connaître la liste des interfaces d'une classe
        //La méthode getInterfaces retourne un tableau de Class
        Class[] faces = c.getInterfaces();
        System.out.println("Il y a " + faces.length + " interfaces implémentées.");
        //On parcourt le tableau d'interfaces
        for (int i = 0; i < faces.length; i++) {
            System.out.println(faces[i]);
        }

        // 3. Connaître la liste des méthodes de la classe
        System.out.println("***************************************************** 3. Connaître la liste des méthodes de la classe ****************************************************");
        /*
        La méthode getMethods() de l'objet Class nous retourne un tableau d'objets Method présents dans le package java.lang.reflect.
        Vous pouvez soit faire l'import à la main, soit déclarer un tableau d'objets Method et utiliser le raccourci Ctrl + Shift + O.
         */
        Method[] m = c.getMethods();
        System.out.println("Il y a " + m.length + " méthodes dans cette classe."); // Il y a 82 méthodes dans cette classe.
        // On récupère le tableau de méthodes
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);

            //  l'objet Method regorge lui aussi de méthodes intéressantes.
            // Le résultat est visible sur la figure suivante. Il est intéressant de voir que
            // vous obtenez toutes sortes d'informations sur les méthodes, leurs paramètres, les exceptions levées, leur type de retour, etc.
            Class[] p = m[i].getParameterTypes();
            for (int j = 0; j < p.length; j++) {
                System.out.println(p[j].getName());
            }
            System.out.println("-------------------------------------------------\n");
        }


        // 4. Connaître la liste des champs (variable de classe ou d'instance)
        System.out.println("************************************************ 4. Connaître la liste des champs (variable de classe ou d'instance) *********************************************************");
        Field[] fields = c.getDeclaredFields();
        System.out.println("Il y a " + fields.length + " champs dans cette classe"); // Il y a 9 champs dans cette classe
        // On parcourt le tableau de méthodes
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        System.out.println("********************************************** 5. Connaître la liste des constructeurs de la classe ***********************************************************");
        // 5. Connaître la liste des constructeurs de la classe

        Constructor[]  constructors = c.getConstructors();
        System.out.println("Il y a " + constructors.length + " constructeurs dans cette classe." ); // Il y a 15 constructeurs dans cette classe.
        // On parcourt le tableau des constructeurs
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i].getName());

            Class[] params = constructors[i].getParameterTypes();
            for (int j = 0; j < params.length; j++) {
                System.out.println(params[j]);
            }

            System.out.println("---------------------------------------------\n");
        }
    }
}
