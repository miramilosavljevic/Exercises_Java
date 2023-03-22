import java.util.Scanner;

public class Trougao extends Figura{
    private double a, b, c;

    public Trougao () {
        super();
        a = b = c = 1;
    }
    public Trougao (double aa) {
        super();
        a = b = c = aa;
    }
    public Trougao (double aa, double bb) {
        a = aa;
        b = c = bb;
    }
    public Trougao (double aa, double bb, double cc) {
        a = aa;
        b = bb;
        c = cc;
    }
    public Trougao (double aa, double bb, double cc, Tacka tt) {
        super(tt);
        a = aa;
        b = bb;
        c = cc;
    }
    public double O() {
        return a + b + c;
    }
    public double P() {
        double s = (a+b+c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    public void userInput() {
        super.userInput();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
    }
    public String toString() {
        return "trougao[" + super.toString() + ", a=" + a + ", b=" + b + ",c=" + c + "O=" + O() + "P=" + P() + "]";
    }
}
