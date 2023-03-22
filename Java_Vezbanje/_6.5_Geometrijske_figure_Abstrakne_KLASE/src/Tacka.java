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
    public void userInput () {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite x: ");
        x = input.nextDouble();
        System.out.println("Unesite y: ");
        y = input.nextDouble();
    }
    public String toString () {
        return "( x = " + x + ", y = " + y + ")";
    }
}
