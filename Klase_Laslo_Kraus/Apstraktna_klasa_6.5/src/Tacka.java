import java.util.Scanner;

public class Tacka {
    double x, y;

    public Tacka() {
    }

    public Tacka(double xx) {
        x = xx;
    }

    public Tacka(double xx, double yy) {
        x = xx;
        y = yy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void citaj() {
        Scanner input = new Scanner(System.in);
        System.out.println("Upisite vrednost za x: ");
        x = input.nextDouble();
        System.out.println("Upisite vrednost za y: ");
        y = input.nextDouble();
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static final Tacka ORG = new Tacka();
}
