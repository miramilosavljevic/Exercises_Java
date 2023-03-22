import java.util.Scanner;

public class Predmet {
    private int st;

    public Predmet(int tz) {
        st = tz;
    }
    public Predmet() {
        st = 1;
    }

    public void citanje() {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite specificnu tezinu: ");
        st = input.nextInt();
    }

    public String vrstaPredmeta() {
        return "P";
    }
    public double izracunavanjeZapremine(){
        return 10;
}
    public double izracunavanjeTezine() {
        return izracunavanjeZapremine()*st;
    }

    public String toString() {

        return "Vrsta: " + vrstaPredmeta() + "osnovna tezina: " + st;
    }
}
