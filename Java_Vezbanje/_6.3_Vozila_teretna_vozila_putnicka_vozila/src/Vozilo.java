public abstract class Vozilo {
    private double sopTez;
    public Vozilo (double st) {
        sopTez = st;
    }
    public abstract char vrsta ();

    public double getSopTez() {
        return sopTez;
    }
    public String toString() {
        return vrsta() + "(" + sopTez + ",";
    }

}
