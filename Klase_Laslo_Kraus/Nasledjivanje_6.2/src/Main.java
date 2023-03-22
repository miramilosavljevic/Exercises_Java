public class Main {
    public static void main(String[] args) {
        Osoba[] ljudi = new Osoba[5];
        ljudi[0] = new Djak();
        ljudi[1] = new Djak();
        ljudi[2] = new Zaposlen();
        ljudi[3] = new Zaposlen();
        ljudi[4] = new Osoba();
        for (int i = 0; i <= ljudi.length; i++) {
            System.out.println(ljudi[i].toString());
        }
    }
}