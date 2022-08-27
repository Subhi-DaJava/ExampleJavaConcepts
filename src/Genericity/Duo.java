package Genericity;

public class Duo <T, S>{
    private T valueT;
    private S valueS;

    public Duo() {
        this.valueT = null;
        this.valueS = null;
    }

    public Duo(T valueT, S valueS) {
        this.valueT = valueT;
        this.valueS = valueS;
    }

    public T getValueT() {
        return valueT;
    }

    public void setValueT(T valueT) {
        this.valueT = valueT;
    }

    public S getValueS() {
        return valueS;
    }

    public void setValueS(S valueS) {
        this.valueS = valueS;
    }
}
