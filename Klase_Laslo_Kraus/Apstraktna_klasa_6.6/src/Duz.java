public class Duz extends Linija {
    private Tacka A, B;

    public Duz(Tacka P, Tacka Q) {
        A = P;
        B = Q;
    }
    public Duz() {
        A = new Tacka (-1, -1);
        B = new Tacka (1,1);
    }

    public double duzina () {
        return Math.sqrt(Math.pow(A.x()-B.x(),2) + Math.pow(A.y()-B.y(),2));
    }
    public String toString() {
        return super.toString() + "[duz: A" + A + ", B" + B + "]";
    }
}


