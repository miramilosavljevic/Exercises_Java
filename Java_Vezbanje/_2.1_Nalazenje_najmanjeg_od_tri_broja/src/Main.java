import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite tri broja: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a<b && a<c){
            System.out.println("Najmanje broj je :" + a);
        } else if (b<a && b<c) {
            System.out.println("Najmanje broj je: " + b);
        }
        else {
            System.out.println("Najmanji broj je: " + c);
        }
    }
}