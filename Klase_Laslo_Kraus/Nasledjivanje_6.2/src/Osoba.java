import java.util.Date;
import java.util.Scanner;

public class Osoba {
    String name;
    String address;
    String datumRodjenja;

    public void inputUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ime i prezime: ");
        name = input.nextLine();
        System.out.println("Adresa stanovanja: ");
        address = input.nextLine();
        System.out.println("Datum rodjenja: ");
        datumRodjenja =
                input.nextLine();
    }
    public String toString(){
        String s = "Ime i prezime: " + name + "\n" +
                "Mesto stanovanja: " + address + "\n" +
                "Datum rodjenja: " + datumRodjenja + "\n";
        return s;
    }
}
