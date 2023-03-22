import java.util.Scanner;

public class Djak extends Osoba {
    String nazivSkole;
    int razred;

    @Override
    public void inputUser() {
        super.inputUser();
        Scanner input = new Scanner(System.in);
        System.out.println("Naziv skole: ");
        nazivSkole = input.nextLine();
        System.out.println("Razred koji ucenik pohadja: ");
        razred = input.nextInt();
    }
    public String toString() {
        String s = "Naziv skole je: " + nazivSkole + "\n" +
                "Razred koji djak pohadja: " + razred + "\n";
                return super.toString() + s;
    }
}
