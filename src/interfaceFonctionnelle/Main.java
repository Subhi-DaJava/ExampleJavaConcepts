package interfaceFonctionnelle;

public class Main {
    public static void main(String[] args) {
        // Lambda
        Dialoguer d = (s) -> System.out.println("Tu as dit : " + s);
        d.parler("Bonjour");

        // Classe anonyme
        Dialoguer dia = new Dialoguer() {
            public void parler(String s) {
                System.out.println("Tu as dit : " + s);
            }
        };
        dia.parler("Bonjour");
    }
}
