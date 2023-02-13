package lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question065 {

	public static void main(String[] args) {
		// randomSayiUret methodu yazalım burda 1 den 500 e kadar random sayı üretcez
		// ortalama hesapla diye bir method yazalım

		// kullanıcdan kaç tane sayıyıla işlem yapmasını istediğini soralım
		// girdiği veriye göre içerde bir array oluşturcaz ve random üretilen sayıları
		// bu arraye
		// atıcaz daha sonra ortalamasını bulcaz
		
		int[] array = sayiUret();
		ortalamaHesapla(array);
		
		//System.out.println(otrHesapla()); 

	}

	public static int[] sayiUret() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("dizi uzunlugu ");
		int uzunluk = scanner.nextInt();
		
		int[] array = new int[uzunluk];
		
		for (int i = 0; i < array.length; i++) {
			Random random = new Random();
			array[i] = random.nextInt(1,500);
			System.out.println(array[i]);
			
		}
		return array;
	}

	public static void ortalamaHesapla(int[] array) {
		double toplam =0;
		double ortalama =0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		ortalama = toplam / array.length;
		System.out.println("Ortalama "+ortalama);
	}
	
	
//	public static double otrHesapla() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Lütfen dizinin uzunluğunu giriniz");
//		int uzunluk = scanner.nextInt();
//		double[] dizi = new double[uzunluk];
//		double toplam = 0;
//
//		for (int i = 0; i < dizi.length; i++) {
//			double sayi = sayiUret2();
//			dizi[i] = sayi;
//			toplam += sayi;
//			System.out.println(sayi);
//		}
//
//		return toplam / uzunluk;
//
//	}
//
//	public static double sayiUret2() {
//		Random random = new Random();
//		return random.nextDouble() * 500;// 0.0-1.0
//	}
}