import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite r: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        System.out.println("Obim je: " + (2*r*Math.PI));
        System.out.println("Povrsina je: " + (r*r*Math.PI));
    }
}