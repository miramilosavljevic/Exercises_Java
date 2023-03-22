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

    public double O () {
        return 2 * r * Math.PI;
    }
    public double P () {
        return r * r * Math.PI;
    }

    public void userInput () {
        super.userInput();
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
    }
    public String toString() {
        return "Krug [" + super.toString() + ", r= " + r + ", O= " + O() + ",P= " + P() + "]";
    }
}
