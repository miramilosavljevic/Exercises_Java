import java.util.Scanner;

public class Tacka {
    private int x, y;

    public void setX (int x1) {
        x = x1;
    }
    public void setY (int y1){
        y = y1;
    }
    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }
    public double calculateDistance (Tacka t) {
        double s = Math.sqrt(Math.pow(x-t.x, 2) + Math.pow(y-t.y, 2));
        System.out.println("Rastojanje je : " + s);
        return s;
    }

    public void readUserInput () {
        System.out.println("Unesite x, y: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
    }
    public String toString () {
        String s = "( x = " + x + ", " + "y = " + y + ")";
        return s;
    }
}
