public class Trougao {
    private double a;
    private double b;
    private double c;
    int id;
    static int brojac;

    Trougao(double g, double b, double c) {
        id = brojac++;
        boolean vrednost = provera(g, b, c);
        if (vrednost == true) {
            a = g;
            this.b = b;
            this.c = c;
        } else {
            a = 5;
            this.b = 5;
            this.c = 5;
        }
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double calculateObim() {
        double obim = a + b + c;
        return obim;
    }


    public String toString() {
        String text = "trougao: " + a + b + c;
        return text;
    }

    static boolean provera(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > b)
            return true;
        else
            return false;
    }
}

