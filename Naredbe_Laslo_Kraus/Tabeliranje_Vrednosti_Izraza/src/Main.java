import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite min i max vrednost: ");
        int min = input.nextInt();
        int max = input.nextInt();
        int y;
        for (int x = min; x<=max; x++) {
            y = x * x;
            System.out.println(y);
        }
    }
}