import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina = input.nextInt();
        int[] niz = new int[duzina];
        System.out.println("Unesite brojeve niza: ");
        for (int i = 0; i < duzina; i++) {
            int broj = input.nextInt();
            niz[i] = broj;
        }
        System.out.println(Arrays.toString(niz));
        int min = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] < min) {
                min = niz[i];
            }
        }
        System.out.println("Najmanji broj je: " + min);
    }
}