public class Valjak {
    int r;
    int h;

    public Valjak (int p, int v){
        r = p;
        h = v;
    }
    public int getR () {
        return r;
    }
    public int getH () {
        return h;
    }

    public double calculateZapremina (){
        double zapremina = r*r*h*Math.PI;
        return zapremina;
    }
    public String toString(){
        String s = "[" + r + "," + h + "]";
        return s;
    }
}
