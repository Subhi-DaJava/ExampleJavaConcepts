package interfaceFonctionnelle.javaUtilFunction;

public class Personne {
    private String nom;
    private int age;

    public Personne(int age, String nom) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
