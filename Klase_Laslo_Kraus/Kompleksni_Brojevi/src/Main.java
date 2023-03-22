public class Main {
    public static void main(String[] args) {
            KompleksanBroj kompleksanBroj = new KompleksanBroj();
            KompleksanBroj kompleksanBroj1 = new KompleksanBroj(20.3);
            KompleksanBroj kompleksanBroj2 = new KompleksanBroj(20.3, 12.4);
            double pomocni = kompleksanBroj1.getRe();
            double imaginarni = kompleksanBroj2.getIm();
            double imaginarni1 = kompleksanBroj1.getIm();
            kompleksanBroj1.setIm(14.8);
            imaginarni1 = kompleksanBroj2.getIm();
            kompleksanBroj1.setRe(13.8);
            double apsolutnaVrednost = kompleksanBroj1.abs();
            kompleksanBroj2.set(kompleksanBroj1);
            String tekst = kompleksanBroj1.toString();
        System.out.println(tekst);
        }
    }
