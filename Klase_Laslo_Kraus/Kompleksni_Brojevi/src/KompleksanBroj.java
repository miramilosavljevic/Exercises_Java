public class KompleksanBroj {
    private double re;
    private double im;

    KompleksanBroj() {
    }

    KompleksanBroj(double r) {
        re = r;
    }

    KompleksanBroj(double r, double i) {
        re = r;
        im = i;
    }

    double getRe() {
        return re;
    }

    double getIm() {
        return im;
    }

      void setIm (double i) {
        im = i;
    }
    void setRe (double r) {
        re = r;
    }

    double abs () {
        double vrednost = Math.sqrt(Math.pow(re,2)+Math.pow(im, 2));
        return vrednost;
    }
    void set (KompleksanBroj broj) {
         re = broj.getRe();
         im = broj.getIm();
    }
    public String toString () {
        String s = "k:[" + re + "," + im + "]";
        return s;
    }
}
