package javaIO;

/**
 * Ce qu'il se passe est simple : les données de vos objets sont enregistrées dans le fichier. Mais que se passerait-il si notre objet Game
 * avait un autre objet de votre composition en son sein ? Voyons ça tout de suite. Créez la classeNotice comme suit
 *
 * Eh non, votre code ne compile plus ! Il y a une bonne raison à cela : votre objetNotice n'est pas sérialisable,
 * une erreur de compilation est donc levée. Maintenant, deux choix s'offrent à vous :
 *
 * soit vous faites en sorte de rendre votre objet sérialisable ;
 *
 * soit vous spécifiez dans votre classe Game que la variable notice n'a pas à être sérialisée : Pour la seconde, il suffit de déclarer votre variable :transient;.
 */
public class Notice {
    private String langue;

    public Notice() {
        this.langue = "Français";
    }

    public Notice(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "\t langue de la notice : " + this.langue +"\n";
    }
}
