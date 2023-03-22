import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite duzinu niza: ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        System.out.println("Unesite brojeve u nizu: ");
        int[] niz = new int[d];
        for (int i = 0; i < d; i++) {
            niz[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(niz));

            int min = niz[0];
            for (int i = 1; i < d; i++) {
                if (niz[i] < min) {
                    min = niz[i];
                }
            }
            System.out.println("Najmanje element u nizu je broj: " + min);
        }
}