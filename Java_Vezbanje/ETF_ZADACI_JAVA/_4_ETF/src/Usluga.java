public class Usluga {
    private Broj fromNumber;
    private Broj toNumber;
    private int cenaUsluge;

public Usluga(Broj b, Broj t) {
    fromNumber = b;
    toNumber = t;
}
    public int getCenaUsluge() {
        return cenaUsluge;
    }

    public String toString() {
    return "broj od: " + fromNumber + "broj ka: " + toNumber;
    }
}
