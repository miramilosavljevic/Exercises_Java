public class Main {
    public static void main(String[] args) {
Krug krug1 = new Krug();
Kvadrat kvadrat1 = new Kvadrat();
Trougao trougao1 = new Trougao();
Figura[] f = {krug1, kvadrat1, trougao1};
for(Figura m : f) {
    System.out.println(m.O());
      }
trougao1.userInput();
    }
}