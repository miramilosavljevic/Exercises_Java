public class TeretnoVozilo extends Vozilo{
    public int teret;


    TeretnoVozilo (int tz, int t){
        super(tz);
        teret = t;
    }
    public int ukupnaTezina(){
        return super.ukupnaTezina() + teret;
    }
    public String oznakaVozila (){
        return "t";
    }
    public String toString(){
        String h = basicToString() + teret + oznakaVozila();
        return h;
    }
}
