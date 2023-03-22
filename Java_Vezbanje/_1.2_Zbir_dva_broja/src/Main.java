import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite dva broja");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int zbir = a+b;
        System.out.println("Zbir dva broja je: " + zbir);
    }
}