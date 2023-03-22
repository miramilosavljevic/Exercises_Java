import java.util.Scanner;

public class Tacka {
    private double x;
    private double y;


    void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getx() {
        return x;
    }

    double gety() {
        return y;
    }

    void setUserCoordinates() {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite vrednosti za x, y: ");
        x = input.nextDouble();
        y = input.nextDouble();
    }

    double calculateDistance(Tacka tacka2) {

        return Math.sqrt(Math.pow(x - tacka2.x, 2) + Math.pow(y - tacka2.y, 2));

    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
