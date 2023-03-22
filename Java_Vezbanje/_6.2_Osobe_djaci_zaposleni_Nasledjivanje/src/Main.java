import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Djak djak1 = new Djak();
        Djak djak2 = new Djak();
        Zaposlen zaposlen1 = new Zaposlen();
        Zaposlen zaposlen2 = new Zaposlen();
        Osoba osoba1 = new Osoba();
        Osoba[] ljudi = {osoba1, djak1, djak2, zaposlen1, zaposlen1};
        for (Osoba m : ljudi) {
            System.out.println(m.opis());
        }
    }
}