public class Main {
    public static void main(String[] args) {
        int [] numbers = {10,20, 30, 40, 50};

        for(int x : numbers) {
            if (x==30) {
                System.out.println("Ovaj broj je preskocen");
                continue;
            }
            System.out.println(x);
        }
    }
}