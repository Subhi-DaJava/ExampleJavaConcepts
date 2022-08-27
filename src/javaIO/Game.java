package javaIO;

import java.io.Serializable;

/**
 * En fait, cette interface n'a pas de méthode à redéfinir : l'interface Serializable est ce qu'on appelle une « interface marqueur ».
 * Rien qu'en implémentant cette interface dans un objet, Java sait que cet objet peut être sérialisé.
 * Si vous n'implémentez pas cette interface dans vos objets, ceux-ci ne pourront pas être sérialisés !
 * En revanche, si une superclasse implémente l'interface Serializable, ses enfants seront considérés comme sérialisables.
 *
 * But : sans Objet Notice, deuxième avec Notice
 * nous allons créer deux ou trois objetsGame;
 * nous allons les sérialiser dans un fichier de notre choix ;
 * nous allons ensuite les désérialiser afin de pouvoir les réutiliser.
 */
public class Game implements Serializable {
    private String nom, style;
    private double prix;
    //Maintenant, cette variable ne sera pas sérialisée
    //Elle sera tout bonnement ignorée !
    private transient Notice notice;

    public Game(String nom, String style, double prix) {
        this.nom = nom;
        this.style = style;
        this.prix = prix;
        this.notice = new Notice();
    }



    @Override
    public String toString() {
        return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu :" + this.prix;
    }
}
