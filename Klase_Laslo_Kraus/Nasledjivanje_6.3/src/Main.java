public class Main {
    public static void main(String[] args) {
Vozilo[] vozila = new Vozilo[5];
vozila[0] = new Vozilo(5);
vozila[1] = new Vozilo(6);
vozila[2] = new TeretnoVozilo(3,4);
vozila[3] = new TeretnoVozilo(5,4);
vozila[4] = new PutnickoVozilo(4,5,67);
vozila[5] = new PutnickoVozilo(9,6,89);
vozila[1].ukupnaTezina();
vozila[4].toString();
    }
}