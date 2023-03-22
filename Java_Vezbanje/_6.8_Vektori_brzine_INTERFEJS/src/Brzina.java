public class Brzina extends Vektor {
    public Brzina() {
        super(1,0,0);
    }
    public Brzina(double x, double y, double z){
        super(x,y,z);
    }
    public String toString() {
        return "v" + super.toString();
    }
}
