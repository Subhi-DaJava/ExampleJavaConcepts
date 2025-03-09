package constructor.instantiate_empty_constructor;

public class Tshirt {

    private String size;
    public String getSize() { return this.size; }

    private String color;
    public String getColor() { return this.color; }

    private float price;
    public float getPrice() { return this.price; }

    public Tshirt(String size, String color) {
        this.size = size;
        this.color = color;
        this.price = 12.40f;
    }

    public Tshirt() {
        // Que doit-on écrire pour que le Tshirt soit "L" et "blanc" par défaut ?

        //Cette option n'est pas correcte car bien qu'elle initialise les attributs size et color,
        // elle ne profite pas de la logique déjà définie dans le constructeur Tshirt(String size, String color).
        // this.size = "L"; this.color = "blanc";

        //  Cette option est correcte car elle appelle le constructeur Tshirt(String size, String color) de la même classe,
        //  ce qui permet d'initialiser les attributs size et color avec les valeurs "L" et "blanc".
        this("L", "blanc");
    }
}
