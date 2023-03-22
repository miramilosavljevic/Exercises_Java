public class Vozilo {
    public int tezina;

    public Vozilo(int t){
        tezina = t;
    }
    public int ukupnaTezina(){
        return tezina;
    }
    public String oznakaVozila(){
        return "v";
    }
    protected String basicToString(){
        String s = "Karakteristike vozila: " + tezina;
        return s;
    }

    public String toString() {
        String k = basicToString() + oznakaVozila();
        return k;
    }
}
