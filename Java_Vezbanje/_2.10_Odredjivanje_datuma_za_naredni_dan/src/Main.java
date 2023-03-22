import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite dan, mesec i godinu: ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
int daysInMonth = 31;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
        }
        if (day<daysInMonth) {
            day++;
        } else {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }
        System.out.println("Sutra je: " + day + "." + month + "." + year + "." + "god.");



    }
}