import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Enter three decimal numbers");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double pom = a;
        if (a > b) {
            pom = a;
            a = b;
            b = pom;
        }
        if (a > c) {
            pom = a;
            a = c;
            c = pom;
            }
        if (b > c) {
            pom = b;
            b = c;
            c = pom;
        }
        System.out.println("Smallest to highest is: " + a + " " + b + " " + c);
    }
}