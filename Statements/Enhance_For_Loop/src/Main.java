public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.print(number);
            if (number == 50) {
                System.out.println("!");
            break;}
            System.out.print(",");
        }

        String [] names = {"Mira", "Mina", "Fica"};

        for(String name : names) {
            System.out.println(name);
        }
    }
}