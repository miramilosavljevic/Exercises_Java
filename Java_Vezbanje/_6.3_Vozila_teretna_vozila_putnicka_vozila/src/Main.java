import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TVozilo tVozilo1 = new TVozilo(2,3);
        PVozilo pVozilo1 = new PVozilo(5,12,4);
        PVozilo pVozilo2 = new PVozilo(8,9,1);
Vozilo[] niz = {tVozilo1, pVozilo2, pVozilo1};
for (Vozilo v : niz) {
    System.out.println(v.vrsta());
    System.out.println(v.getSopTez());
         }
        System.out.println("Nosivost mosta: ");
        Scanner input = new Scanner(System.in);
double nosivost = input.nextDouble();
        System.out.println("Mogu da predju most: ");
        for (int i = 0; i< niz.length; i++) {
            if (niz[i].getSopTez() <= nosivost)
                System.out.println(niz[i].getSopTez());
        }
    }
}