import java.util.Vector;

public class Vektor {
    private double x, y, z;

    public Vektor() {
    }

    public Vektor(double xx, double yy, double zz) {
        x = xx;
        y = yy;
        z = zz;
    }
    public double intenzitet() {
        return Math.sqrt(x*x+y*y+z*z);
    }
    public Vektor zbir(Vektor v) {
        return new Vektor(x+v.x, y+v.y, z+v.z);
    }


    public Vektor proizvod (double s) {
        return new Vektor(x*s, y*s, z*s);
    }
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
