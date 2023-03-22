public class Main {
    public static void main(String[] args) {
       double[] myList = {1.9, 3.6, 8.7, 6.9};
        double total = 0;
       for (int i = 0; i < myList.length; i++) {
           total = total + myList[i];
       }
        System.out.println("Total is: " + total);
    }
}