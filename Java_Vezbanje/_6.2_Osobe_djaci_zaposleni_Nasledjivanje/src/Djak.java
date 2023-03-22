import java.util.Scanner;

public class Djak extends Osoba {
private String skola, razred;

public void userInput () {
    super.userInput();
    System.out.println("Naziv skole: ");
    Scanner input = new Scanner (System.in);
    skola = input.nextLine();
    System.out.println("Razred: ");
    razred = input.nextLine();
}

public String tekstualniOpis () {
    return super.testualniOpis() +
            "Naziv skole: " + skola + "\n" +
            "Odeljenje: " + razred + "\n";
}
    public String opis () {
        return "Ja sam Djak!";
    }
}


