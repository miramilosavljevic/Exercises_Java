import java.util.Scanner;

public class Kvadar extends Predmet {
    private int a;
    private int b;
    private int c;


    public Kvadar(int tz, int a, int b, int c) {
        super(tz);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Kvadar() {
        a = 1;
        b = 1;
        c = 1;
    }

    @Override
    public void citanje() {
        super.citanje();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite duzinu stranice a: ");
        a=input.nextInt();
        System.out.println("Unesite duzinu stranice b: ");
        b=input.nextInt();
        System.out.println("Unesite duzinu stranice c: ");
        c=input.nextInt();
    }

    public double izracunavanjeZapremine(){
        return a*b*c;
    }


    public String vrstaPredmeta() {
        return "K";
    }

    public String toString() {
        return vrstaPredmeta() + a + b;
    }
}
