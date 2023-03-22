import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        int b;
        int c;
        System.out.println("Enter three numbers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a < b && a < c)
            System.out.println(a + " is the smallest number!");
        else if (b < a && b < c)
            System.out.println(b + " is the smallest number!");
        else
            System.out.println(c + " is the smallest number!");
    }
}