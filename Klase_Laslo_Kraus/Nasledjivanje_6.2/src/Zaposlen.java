import java.util.Scanner;

public class Zaposlen extends Osoba {
    String nazivFirme;
    int nazivOdeljenja;

    @Override
    public void inputUser() {
        super.inputUser();
        Scanner input = new Scanner(System.in);
        System.out.println("Naziv firme: ");
        nazivFirme=input.nextLine();
        System.out.println("Naziv odeljenja kome predaje: ");
        nazivOdeljenja = input.nextInt();
    }
    public String toString(){
        String s = "Naziv firme: " + nazivFirme + "\n" +
                "Naziv odeljenja" + nazivOdeljenja + "\n";
        return super.toString() + s;
    }
}
