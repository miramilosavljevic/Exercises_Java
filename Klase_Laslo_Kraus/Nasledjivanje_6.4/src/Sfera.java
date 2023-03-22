import java.util.Scanner;

public class Sfera extends Predmet {
    private int r;

    public Sfera(int tz, int pp) {
        super(tz);
        pp = r;
    }
    public Sfera(){
        r = 1;
    }

    @Override
    public void citanje() {
        super.citanje();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite poluprecnik: ");
        r = input.nextInt();
    }

    public String vrstaPredmeta() {
        return "S";
    }

    public double izracunavanjeZapremine() {
        return 4. / 3 * (r * r * r) * Math.PI;
    }

    public String toString() {
        return vrstaPredmeta() + r + izracunavanjeZapremine();
    }
}
