import java.util.Scanner;

public class Kvadrat extends Figura {
    private double a;

    public Kvadrat() {
        super();
        a = 1;
    }

    public Kvadrat(double aa) {
        super();
        a = aa;
    }

    public Kvadrat(double aa, Tacka tt) {
        super(tt);
        a = aa;
    }

    public double O() {
        return 4 * a;
    }

    public double P() {
        return a * a;
    }

    public void citaj() {
        super.citaj();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite vrednost za a: ");
        a = input.nextDouble();
    }

    public String toString() {
        return "kvadr[" + super.toString() + ",a=" + a + ",O=" + O() + ",P=" + P() + "]";
    }
}
