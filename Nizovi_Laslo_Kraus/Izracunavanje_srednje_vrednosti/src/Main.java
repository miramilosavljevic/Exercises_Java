import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina = input.nextInt();
        System.out.println("Unesite brojeve: ");
        int [] niz = new int [duzina];
        for (int i=0; i<duzina; i++){
            niz[i]  = input.nextInt();

        }
        System.out.println(Arrays.toString(niz));
        int sum = 0;
        for (int i = 0; i<niz.length; i++){
            sum = sum + niz[i];
        }
        System.out.println("Zbir brojeva u nizu iznosi: " + sum);

        double div = sum / niz.length;
        System.out.println("Srednja vrednost niza je: " + div);
    }
}