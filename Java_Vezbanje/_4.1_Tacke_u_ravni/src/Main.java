public class Main {
    public static void main(String[] args) {
Tacka tacka1 = new Tacka ();
tacka1.setX(4);
tacka1.setY(7);
        System.out.println(tacka1.toString());
        Tacka tacka2 = new Tacka ();
        tacka2.setX(14);
        tacka2.setY(13);
        System.out.println(tacka2.toString());
        tacka1.calculateDistance(tacka2);
        tacka1.readUserInput();
        System.out.println(tacka1.getX());
    }
}