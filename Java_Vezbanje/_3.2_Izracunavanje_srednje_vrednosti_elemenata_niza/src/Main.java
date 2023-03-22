
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Upisite duzinu niza: ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int[] niz = new int[d];
        System.out.println("Upisite brojeve: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(niz));
        int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            sum  = sum + niz[i];
        }
        int s = sum / d;
        System.out.println("Srednja vrednost niza je: " + s);
    }


}