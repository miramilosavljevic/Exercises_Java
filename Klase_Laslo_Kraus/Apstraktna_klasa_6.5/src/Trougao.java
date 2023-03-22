import java.util.Scanner;

public class Trougao extends Figura {
    private double a, b, c;

    public Trougao() {
        super();
        a = b = c = 1;
    }

    public Trougao(double aa) {
        super();
        a = b = c = aa;
    }

    public Trougao(double aa, double bb) {
        super();
        a = aa;
        b = c = bb;
    }

    public Trougao(double aa, double bb, double cc) {
        super();
        a = aa;
        b = bb;
        c = cc;
    }

    public double O() {
        return a + b + c;
    }

    public double P() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public void citaj () {
        super.citaj();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite vrednost za a: ");
        a = input.nextDouble();
        System.out.println("Unesite vrednost za b: ");
        b = input.nextDouble();
        System.out.println("Unesite vrednost za c: ");
        c = input.nextDouble();
    }
    public String toString() {
        return "troug[" + super.toString() + ", a=" + a + ",b=" + b + ",c=" + c + ",O=" + O() + ", P=" + P() + "]";
    }
}
