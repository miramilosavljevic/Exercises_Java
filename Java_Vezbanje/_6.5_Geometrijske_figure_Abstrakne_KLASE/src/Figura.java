public abstract class Figura {
    private Tacka T;

    public Figura() {
        T = new Tacka();
    }

    public Figura(Tacka TT) {
        T = new Tacka(TT.x, TT.y);
    }

    public final void postavi(double xx, double yy) {
        T.x = xx;
        T.y = yy;
    }

    public final void pomeri(double dx, double dy) {
        T.x = T.x + dx;
        T.y = T.y + dy;
    }

    public abstract double O();

    public abstract double P();
    public void userInput () {
        T.userInput();
    }
    public String toString () {
        return "T = " + T;
    }
}
