public class Kanta extends Valjak {
    double p;

    public Kanta(int r, int v, double pp) {
        super(r, v);
        p = pp;
    }

    public double getP() {
        return p;
    }

    public double remainingLiquid() {
        double r = calculateZapremina() - p;
        return r;
    }

    public boolean puna() {
        return p == calculateZapremina();
    }
    public boolean prazna() {
        return p==0;
    }
    public void dolij (double n){
        if((p+n) > calculateZapremina()) {
            p = calculateZapremina();
        }else{
            p=p+n;
        }
    }
    public void odlij (double g){
        if((p-g) < 0) {
            p = 0;
        }else{
            p = p-g;
        }
    }
    public String toString (){
        String s = "{" + super.toString()+"," +"p"+"}";
        return s;
    }
}

