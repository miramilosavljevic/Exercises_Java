import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unestite dan, mesec i godinu: ");
        int dan = input.nextInt();
        int mesec = input.nextInt();
        int godina = input.nextInt();

        int daniUMesecu = 31;

        switch (mesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                daniUMesecu = 30;
                break;
            case 2:
                daniUMesecu = 28;
        }
        if (dan < daniUMesecu) {
            dan++;
        } else {
            dan = 1;
            if (mesec == 12) {
                mesec = 1;
                godina++;
            } else {
                mesec++;
            }
        }
        System.out.println("Sutra je: " + dan + "." + mesec + "." + godina+".");
    }

}