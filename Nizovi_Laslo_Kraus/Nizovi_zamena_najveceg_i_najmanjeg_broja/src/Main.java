import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina = input.nextInt();
        System.out.println("Unesite brojeve: ");
        int[] niz = new int[duzina];
        for (int i = 0; i < duzina; i++) {
            niz[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(niz));
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > niz[maxIndex])
                maxIndex = i;
            else
                minIndex = i;
        }
        System.out.println("Najmanji broj je: " + niz[minIndex]);
        System.out.println("Najveci broj je: " + niz[maxIndex]);
        System.out.println("Zameniće mesta: " + " " + niz[minIndex] + " " + "i" + " " + niz[maxIndex]);
        int zamena;
        zamena = niz[maxIndex];
        niz[maxIndex] = niz[minIndex];
        niz[minIndex] = zamena;

        System.out.println(Arrays.toString(niz));
    }
}



