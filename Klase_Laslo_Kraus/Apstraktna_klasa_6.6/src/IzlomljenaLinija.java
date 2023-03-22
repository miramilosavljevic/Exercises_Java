public class IzlomljenaLinija extends Linija {
   protected Tacka[] tem;

    public IzlomljenaLinija(Tacka[] niz){
        tem = niz;
    }

    public double duzina() {
        double d = 0;
        for (int i = 0; i < tem.length-1; i++)
            d += new Duz(tem[i],tem[i+1]).duzina();
        return d;
        }
        public String toString() {
        return super.toString() + "[izlomljena: " + Tacka.toString(tem) + "]";
        }
    }

