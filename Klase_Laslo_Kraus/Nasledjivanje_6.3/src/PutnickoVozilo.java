public class PutnickoVozilo extends Vozilo {
    public int brojPutnika;
    public int prosecnatezina;


    public PutnickoVozilo(int tz, int b, int pt) {
        super(tz);
        brojPutnika = b;
        prosecnatezina = pt;
    }

    public String oznakaVozila() {
        return "pv";
    }

    public int ukupnaTezina() {
        return super.ukupnaTezina() + (brojPutnika * prosecnatezina);
    }

    public String toString() {
        String g = basicToString() + prosecnatezina + oznakaVozila() + ukupnaTezina();
        return g;
    }
}

