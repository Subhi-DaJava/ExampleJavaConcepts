package javaIO.StrategyDecorator;

public class CoucheBiscuit extends Couche{
    public CoucheBiscuit(Patisserie p) {
        super(p);
        this.nom = "\t- Une couche de biscuit.\n";
    }
}
