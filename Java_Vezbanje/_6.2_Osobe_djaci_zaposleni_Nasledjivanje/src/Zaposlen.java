import java.util.Scanner;

public class Zaposlen extends Osoba {
    private String firma, odeljenje;

    public void userInput () {
        super.userInput();
        System.out.println("Naziv firme: ");
        Scanner input = new Scanner(System.in);
        firma = input.nextLine();
        System.out.println("Odeljenje kom predajete: ");
        odeljenje = input.nextLine();
        }

        public String tekstualniOpis () {
        return super.testualniOpis() +
                "Naziv firme: " + firma + "\n" +
                "Odeljenje kom predaje: " + odeljenje + "\n";
    }

    public String opis () {
        return "Ja sam Nastavnik!";
    }
}
