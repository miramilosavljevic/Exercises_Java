public class Poruka extends Usluga{
    private String tekstPoruke;

    public Poruka (Broj b, Broj t, String x) {
        super(b, t);
        tekstPoruke = x;
    }

}
