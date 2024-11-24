import java.util.Scanner;

public class Main {

    public static float hesaplama (float x,float y){
        return x / 100 * 30 + y / 100 * 70;
    };

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    while (true) {
        System.out.println("merhabalar not ortalamanızı hesaplamak için kullanılacak yüzdeler vize % 30 : final % 70 olarak sayılacak");
        System.out.println("Hesaplamak için 1 tuşuna basın tekrar hesaplamak için 2 ye programdan çıkmak için 3 e basın");
        int userChoice = input.nextInt();
        if (userChoice == 1){
        System.out.println("lütfen vize notunuzu giriniz");
        float vize = input.nextFloat();
        System.out.println("lütfen final notunuzu giriniz");
        float fi_nal = input.nextFloat();
            float sonuc = (hesaplama(vize,fi_nal));
            System.out.println("Sonuç : "+ sonuc);

        } else if (userChoice == 2) {
            System.out.println("lütfen vize notunuzu giriniz");
            float vize = input.nextFloat();
            System.out.println("lütfen final notunuzu giriniz");
            float fi_nal = input.nextFloat();
            float sonuc = (hesaplama(vize,fi_nal));
            System.out.println("Sonuç : "+ sonuc);

        } else if (userChoice == 3) {
            break;

        }else{
            System.out.println("yanlış bir giriş yaptınız tekrar deneyin");
        }
    }




    }
}