public class KompleksanBroj {
    private double x, y;
    public KompleksanBroj () {}
    public KompleksanBroj (double r) {
        x = r;
    }
    public KompleksanBroj (double r, double k) {
        x = r;
        x = k;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
