public class Main {
    public static void main(String[] args) {
        Tacka tacka1 = new Tacka();
        tacka1.setCoordinates(10.3, 20.4);
        System.out.println(tacka1);
        tacka1.getx();
        double pom = tacka1.getx();
        double pom1 = tacka1.gety();
        System.out.println(tacka1);
        Tacka t = new Tacka();
        t.setCoordinates(3, 4);
        System.out.println(tacka1.calculateDistance(t));
        System.out.println(tacka1.toString());
    }
}