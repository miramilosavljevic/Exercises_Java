public class Tacka implements Pokretan {
    private static int posId = 0;
    private final int id = ++posId;
    private Vektor r;
    private Brzina v;

    public Tacka(Vektor rr, Brzina vv){
        r = rr;
        v = vv;
    }
    public Tacka () {
        r = new Vektor();
        v = new Brzina();
    }

    public Tacka proteklo (double dt) {
        r = r.zbir(v.proizvod(dt));
        return this;
    }

    public Vektor r() {
        return r;
    }
    public double rastojanje(Tacka T2) {
        return T2.r.zbir(r.proizvod(-1)).intenzitet();
    }

    public String toString() {
        return "T" + id + r;
    }
}
