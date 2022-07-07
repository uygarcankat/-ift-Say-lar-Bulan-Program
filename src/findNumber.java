import java.util.Scanner;


public class findNumber {
    public static void main(String[] args) {


        // Çift sayı bulma programı
             Scanner input = new Scanner(System.in);
       /* System.out.println("Lütfen sayı giriniz");
        int sayi = input.nextInt();

        for (int i = 0; sayi >= i; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }


        }


       */

        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program






        System.out.println("Lütfen sayı giriniz");
        int sayi1 = input.nextInt();
        int sum=0;
        int k = 0;
        for (int i = 0; sayi1 >= i; i++) {

            if (i % 3 == 0) {

                if (i % 4 == 0) {
                    System.out.println(i);
                    sum+=i;
                    k++ ;

                }


            }
        }
        double avarage= sum/ k;
        System.out.println("avarage :" + avarage);
    }
}