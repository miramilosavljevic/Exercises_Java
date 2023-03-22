import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite duzinu niza: ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        System.out.println("Unesite brojeve: ");
        int [] niz = new int[d];
        for (int i = 0; i < niz.length; i++) {
            niz [i] = input.nextInt();
        }
        System.out.println("Vas niz je: " + Arrays.toString(niz));

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > niz[maxIndex]) {
                maxIndex = i;
            } else if (niz[i] < niz[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Min broj je: " + niz[minIndex] + ", a Max broj je: " + niz[maxIndex]);
        int p = niz[minIndex];
        niz[minIndex] = niz[maxIndex];
        niz[maxIndex] = p;
        System.out.println("Niz sa zamenjenim brojevima: " + Arrays.toString(niz));
    }
}