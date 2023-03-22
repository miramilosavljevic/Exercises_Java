import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesi tri broja? ");
        Scanner input = new Scanner(System.in);
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();
         int min = a;
         if (b < min)
             min = b;
         if (c < min)
             min = c;
        System.out.println("Najmanji broj je: "+ min);
    }
}