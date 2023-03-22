import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Upisite vrednosti: ");
        double xa = input.nextDouble();
        double ya = input.nextDouble();
        double xb = input.nextDouble();
        double yb = input.nextDouble();
        double xc = input.nextDouble();
        double yc = input.nextDouble();
        double a = Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2));
        System.out.println(a);
        double b = Math.sqrt(Math.pow(xc - xa, 2) + Math.pow(yc - ya, 2));
        System.out.println(b);
        double c = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
        System.out.println(c);
        double s = (a + b + c) / 2;
        double p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Povrsina je: " + p);
    }
}