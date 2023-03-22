import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Upisite duzinu niza: ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int [] niz = new int[d];
        System.out.println("Unesite brojeve niza: ");
        for (int i = 0; i < d; i++) {
            niz[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(niz));
        int holdsValue = 0;
            for ( int i = 0, l = d-1; i < l; i++, l-- ) {
                holdsValue = niz[i];
                niz[i] = niz[l]; niz[l] = holdsValue;
            }
        System.out.println("Obrnuti niz: " + Arrays.toString(niz));
        }
    }
