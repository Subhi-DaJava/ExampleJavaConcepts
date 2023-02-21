package threads_example.test_p2_quiz;

/**
 * This code uses concurrency to manipulate a list of stars for various ends.
 * Let's start with a star entity that is composed of the star's name and the number of Solar Masses representing its size.
 */
public class Star {
    public String name;
    public Double solarMasses;

    public Star(String name, Double solarMasses) {
        this.name = name;
        this.solarMasses = solarMasses;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", solarMasses=" + solarMasses +
                '}';
    }
}
