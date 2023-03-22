public class PVozilo extends Vozilo {
    double srTez;
    int brPut;

    public PVozilo (double st, double srt, int bp) {
        super(st);
        srTez = srt;
        brPut = bp;
    }
    public char vrsta() {
        return 'P';
    }
    public double tezina() {
        return super.getSopTez() + srTez * brPut;
    }
    public String toString() {
        return super.toString() + srTez + "," + brPut + ")";
        }
    }

