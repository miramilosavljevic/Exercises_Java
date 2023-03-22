public class NizKompleksnihBrojeva {
    private KompleksanBroj niz[];


    public NizKompleksnihBrojeva(int duzina) {
        niz = new KompleksanBroj[duzina];
        for (int i = 0; i < niz.length;i++) {
            niz[i] = new KompleksanBroj ();
        }
    }

    public NizKompleksnihBrojeva() {
        niz = new KompleksanBroj[10];
    }

    public int duzinaNiza() {
        return niz.length;
    }

    public void setIndex(KompleksanBroj v, int i) {
        niz[i] = v;
    }

    public KompleksanBroj getIndex(int i) {
        return niz[i];
    }

    public String toString() {
        String text = "";
        for (int i = 0; i < niz.length; i++) {
              text = text + " " + niz[i];
        }
        return text;
    }
}

