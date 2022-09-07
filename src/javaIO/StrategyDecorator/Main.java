package javaIO.StrategyDecorator;

/**
 * Afin de pouvoir ajouter des fonctionnalités aux objets gérant les flux, Java utilise le pattern « decorator ».
 *
 * Ce pattern permet d'encapsuler une fonctionnalité et de l'invoquer de façon récursive sur les objets étant composés de décorateurs.
 *
 * Vous avez pu voir que l'invocation des méthodes se faisait en allant jusqu'au dernier élément pour remonter ensuite la pile d'invocations.
 * Pour inverser ce fonctionnement, il vous suffit d'inverser les appels dans la méthodepreparer(): affecter d'abord le nom de la couche et ensuite le nom du décorateur.
 */
public class Main {
    public static void main(String[] args) {
        Patisserie pat =
                new CoucheChocolat(
                        new CoucheCaramel(
                                new CoucheBiscuit(
                                        new CoucheChocolat(
                                                new Gateau()))));
        System.out.println(pat.preparer());
    }
}
