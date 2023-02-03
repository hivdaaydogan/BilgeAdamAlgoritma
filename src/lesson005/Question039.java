package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question039 {
	
	// Sayi tahmin uygulaması yapalım
	// sürekli kullanıcıdan sayıyı tahmin etmesini isticez
	// eğer kullanıcının girdiği sayı bulması gereken sayıdan az ise
	// tahmininizi yükseltin
	// fazla ise tahmininizi azaltın diyelim
	// doğru tahmin ettiği zaman kaçıncı denemesinde bulduğunu kullanıcıya söyleyelim.

	public static void main(String[] args) {
		// int rastgele = (int) (Math.random()*100);
		// random int sayı üretmemiz lazım
		// random sayıyı üretelim 0 ile 100 arasında bunu yazdıralım

		//
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(0,101);  //başlangıç değeri dahil bitiş dahil değil.
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("sayı giriniz: ");
//		int sayi = scanner.nextInt();
//		if (sayi<randomNum) {
//			System.out.println("tahmini yükselt");
//			int sayi2 = scanner.nextInt();
//		}else if (sayi>randomNum) {
//			System.out.println("tahmini azalt");
//			int sayi3 = scanner.nextInt();
//		}else if (sayi == randomNum){
//			System.out.println();
//		}
		
		
		int tahminSayisi = 0;
		int secim = -1;
		while (secim !=0) {
			
			System.out.println("üretilen -->" + randomNum);
			int tahmin = scanner.nextInt();
			tahminSayisi++;
			if(tahmin == randomNum) {
				System.out.println("Tebrikler "+ tahminSayisi + " Denemede buldunuz");
				System.out.println("devam etmek istiyor musunuz? evet 1 - hayır 2");
				secim = scanner.nextInt();
				tahminSayisi = 0;
				randomNum = random.nextInt(0,101);
			}else if(tahmin > randomNum) {
				System.out.println("Sayi azaltın");
			}else {
				System.out.println("sayıyı artırın");
			}
		}
		
		
		
		
	}

}
