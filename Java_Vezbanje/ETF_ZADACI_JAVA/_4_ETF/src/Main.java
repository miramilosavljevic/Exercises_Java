public class Main {
    public static void main(String[] args) {
        Broj broj1 = new Broj("Srbija", 4, 6, 'a');
        Broj broj2 = new Broj("Srbija", 8, 12, 'a');
        broj1.checkState(broj2);

        Poziv poziv1 = new Poziv(broj1, broj2, 110, "inostrani");
        poziv1.cenaPoziva();
    }
}