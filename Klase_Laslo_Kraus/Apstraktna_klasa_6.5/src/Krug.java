import java.util.Scanner;

public class Krug extends Figura {
    private double r;

    public Krug() {
        super();
        r = 1;
    }

    public Krug(double rr) {
        super();
        r = rr;
    }

    public Krug(double rr, Tacka tt) {
        super(tt);
        r = rr;
    }

    public double O() {
        return 2 * r * Math.PI;
    }

    public double P() {
        return r * r * Math.PI;
    }

    public void citaj() {
        Scanner input = new Scanner(System.in);
        super.citaj();
        System.out.println("Unesite vrednost za r: ");
        r = input.nextDouble();
    }

    public String toString() {
        return "krug [" + super.toString() + ", r=" + r + ", O=" + O() + ", P=" + P() + "]";
    }
}
