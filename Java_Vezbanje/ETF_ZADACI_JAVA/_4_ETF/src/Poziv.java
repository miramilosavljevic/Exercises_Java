public class Poziv extends Usluga {
    private int trajanjeUSekundama;
    private String saobracaj;

    Poziv(Broj b, Broj t, int v, String s) {
        super(b, t);
        trajanjeUSekundama = v;
        saobracaj = s;
    }

    public void cenaPoziva() {
        int uspostavljanjeVeze = 0;
        int zapocetiMinut = 0;
        int cenaPoziva = 0;

        switch (saobracaj) {
            case "domaci":
                uspostavljanjeVeze = 0;
                zapocetiMinut = 10;
                cenaPoziva = trajanjeUSekundama / 60 * zapocetiMinut;
                System.out.println("Cena poziva je: " + cenaPoziva + " dinara");
                break;
            case "inostrani":
                uspostavljanjeVeze = 30;
                zapocetiMinut = 50;
                cenaPoziva = trajanjeUSekundama / 60 * zapocetiMinut;
                System.out.println(("Cena poziva je: " + cenaPoziva + " dinara"));
                break;
        }
        //OVO MI NIJE JASNO STA SE DESAVA
//        public String toString () {
//            super.toString();
//            return "(minuti:sekunde)";

        }
    }


