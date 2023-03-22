import java.util.Scanner;

public class Kvadrat extends Figura {
    private double a;

    public Kvadrat () {
        super();
        a = 1;
    }
    public Kvadrat (double aa) {
        super();
        a = aa;
    }
    public Kvadrat (double aa, Tacka tt) {
        super(tt);
        a = aa;
    }

    @Override
    public double O() {
        return 4*a;
    }
    public double P() {
        return a*a;
    }
    public void userInput() {
        super.userInput();
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
    }
    public String toString() {
        return "kvadrat[" + super.toString() + ",a= " + a + ",O= " + O() + ",P= " + P() + "]";
    }
}
