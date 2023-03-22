import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double xa;
        double ya;
        double xb;
        double yb;
        double xc;
        double yc;
        System.out.println("Upisite vrednosti");
        xa = input.nextDouble();
        ya = input.nextDouble();
        xb = input.nextDouble();
        yb = input.nextDouble();
        xc = input.nextDouble();
        yc = input.nextDouble();
        double a = Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2));
        System.out.println(a);
        double b = Math.sqrt(Math.pow(xc - xa, 2) + Math.pow(yc - ya, 2));
        System.out.println(b);
        double c = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
        System.out.println(c);
        double s = (a + b + c) / 2;
        System.out.println(s);
        double p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("povrsina je: " + p);
    }
}