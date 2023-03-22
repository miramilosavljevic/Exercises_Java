import java.util.Scanner;

public class Osoba {
    private String ime, rodjen, adresa;


    public void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite ime i prezime: ");
        ime = input.nextLine();
        System.out.println("Unesite datum rodjenja: ");
        rodjen = input.nextLine();
        System.out.println("Unesite adresu: ");
        adresa = input.nextLine();
    }

    public String testualniOpis() {
        return "Ime i prezime: " + ime + "\n" +
                "Rodjen/rodjena: " + rodjen + "\n" +
                "Adresa stanovanja: " + adresa + "\n";
    }

    public String opis() {
        return "Ja sam osoba!";
    }
}
