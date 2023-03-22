import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.println("Upisi koji je poluprecnik kruga");
        r = input.nextInt();
        double oCircle = 2*r*Math.PI;
        double pCircle = r*r*Math.PI;
        System.out.println("obim: " + oCircle);
        System.out.println("povrsina: " + pCircle);
    }
}