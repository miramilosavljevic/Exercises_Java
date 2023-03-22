import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina = input.nextInt();
        int[] niz = new int[duzina];
        System.out.println("Unesite brojeve: ");

        for (int i = 0; i < duzina; i++) {
            niz[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(niz));
        int zamena = 0;

            for (int i = 0, d = duzina-1; i < d; i++, d--) {
                zamena = niz[i];
                niz[i] = niz[d];
                niz[d] = zamena;

            }
            System.out.println(Arrays.toString(niz));
        }
    }

