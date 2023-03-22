public class Broj {
    private String kodDrzave;
    private int pozivniBroj;
    private int brojTelefona;
    private char indikator;

    public Broj(String k, int p, int b, char i) {
        kodDrzave = k;
        pozivniBroj = p;
        brojTelefona = b;
        indikator = i;
    }

    public char getIndikator() {
        return indikator;
    }

    public void checkState(Broj b) {
        if (b.kodDrzave == kodDrzave) {
            System.out.println("Match!");
        } else {
            System.out.println("No match");
            }
        }

    public String toString() {
        return "+" + "Kod drzave: " + kodDrzave + " pozivni broj: " + pozivniBroj + "broj telefona: " + brojTelefona;
    }
}
