package lesson008;

import java.util.Scanner;

public class Question060 {
	
//	public static int yasHesapla() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Lütfen doğum tarihinizi giriniz: ");
//		int dogumT = scanner.nextInt();
//		int yas = 2023 - dogumT;
//		System.out.println(yas);
//		return yas;
//	}
	
	public static int yasHesapla(int yil) {
		int yas = 2023 - yil;
		return yas;
	}
	
//	public static int yuzyilHesapla() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Lütfen doğum tarihinizi giriniz: ");
//		int dogumT = scanner.nextInt();
//		int yuzyil = (dogumT/100)+1;
//		System.out.println(yuzyil);
//		return yuzyil;
//	}
	
	public static int yuzyilHesapla(int yil) {
		int yuzyil = yil/100+1;
		return yuzyil;
	}
	
//	public static void bilgileriYazdir(int yil) {
//		int yas = yasHesapla(yil);
//		int hesaplanmisYuzyil = yuzyilHesapla();
//		System.out.println("Yaşınız: "+ yas + " Kaçıncı yüzyıl: "+ hesaplanmisYuzyil);
//	}

	public static void main(String[] args) {
		
		// Doğum yılınızı girerek yaşınızı ve hangi yüzyılda doğduğunu hesaplayan metodları yazalım
		
		//3 farklı metod yazıcaz
		//yasHesapla
		//yuzyıl hesapla
		//bilgileri yazdır
		
		//bilgileriYazdir(1992);
		//hangi yuzyılda doğduğunu ve yaşını söyleyecek 
		
//		yasHesapla();
//		yuzyilHesapla();
	}

}
