public class Tacka {
    private double x, y;

    public Tacka(double xx, double yy) {
        x = xx;
        y = yy;
    }

    public Tacka(double xx) {
        x = xx;
    }

    public Tacka() {
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static String toString(Tacka[] niz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < niz.length; i++) {
            if (i > 0) sb.append(',');
            sb.append(niz[i]);
        }
        return sb.toString();  //Tekstualni opis niza tacaka
    }

    public static String toString2(Tacka[] niz) {
        String s = "";
        for (int i = 0; i < niz.length; i++) {
            if (i>0)
                s = s + ",";
            s =  s + niz[i].toString() ;
        }
        return s;


    }
}
