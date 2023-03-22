import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite tri broja: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b) {
            int d = a; a = b; b = d;
        }
        if (a > c) {
            int d = a;
            a = c;
            c = d;
        }
        if (b > c) {
            int d = b; b = c; c = d;
        }
        System.out.println("Uredjeni niz: " + a + " " + b + " " + c);
    }
}