public class Main {
    public static void main(String[] args) {
        Figura[] figure = new Figura[6];
        figure[0] = new Krug(3);
        figure[1] = new Krug(5);
        Tacka t = new Tacka(4,5);
        figure[2] = new Kvadrat(8,new Tacka(8,9));
        figure[3] = new Kvadrat(7, t);
        figure [4] = new Trougao(9);
        figure[5] = new Trougao(9,5,5);
        for(int i = 0; i < figure.length; i++){
            figure[i].O();
        }
    }
}