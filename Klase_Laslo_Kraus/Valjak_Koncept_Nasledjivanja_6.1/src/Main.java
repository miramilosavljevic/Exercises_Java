public class Main {
    public static void main(String[] args) {
     Valjak valjak1 = new Valjak(3,4);
     Kanta kanta1 = new Kanta(1,3,10);
        System.out.println(kanta1.calculateZapremina());
        kanta1.odlij(5);
        System.out.println(kanta1.toString());
       kanta1.odlij(4);
        System.out.println(kanta1);
        Kanta kanta2 = new Kanta(3,4,8);
        System.out.println(kanta2);
    }
}