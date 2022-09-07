package javaIO.StrategyDecorator;

public class CoucheCaramel extends Couche{
    public CoucheCaramel(Patisserie p) {
        super(p);
        this.nom = "\t- Une chode de caramel.\n";
    }
}
