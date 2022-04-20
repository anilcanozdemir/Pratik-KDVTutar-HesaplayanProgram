import java.util.Scanner;

public class KDVTutariHesaplayanProgram {



    public static void main(String[] args) {

        System.out.print("Fiyatı Giriniz:");
        Scanner input = new Scanner(System.in);
        double tutar=input.nextDouble();
        double kdvOrani=(tutar>1000)?0.08:0.18;

        System.out.println("KDV'siz Fiyat :"+tutar);

        System.out.println("KDV'li Fiyat  :"+(tutar+tutar*kdvOrani));

        System.out.println("KDV tutari  :"+tutar*kdvOrani);
    }
}
