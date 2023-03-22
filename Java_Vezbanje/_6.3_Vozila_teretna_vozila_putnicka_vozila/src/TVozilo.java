public class TVozilo extends Vozilo{
    private double teret;

    public TVozilo( double st, double t){
        super(st);
        teret = t;
    }
    public char vrsta() {
        return 'T';
    }
    public double tezina () {
        return super.getSopTez() + teret;
    }

    public String toString() {
        return super.toString() + teret + ")";
    }
}
