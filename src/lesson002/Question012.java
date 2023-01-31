package lesson002;

import java.util.Scanner;

public class Question012 {

	public static void main(String[] args) {
		
		// Dışarıdan iki tane sayısal değer alalım
		// İki sayının toplamı çift ise true değilse false yazdıralım
		// En sonda da sayıların toplamının yarısını yazdıralım
		
		Scanner input = new Scanner(System.in);
		System.out.println("1 Sayı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.println("2 Sayı giriniz: ");
		int sayi2 = input.nextInt();
		
		boolean toplam = sayi1 + sayi2 % 2 != 0;
		System.out.println("toplam: " + toplam);
		
		double toplamYarisi = (sayi1 + sayi2) / 2;
		System.out.println("toplam yarısı: " + toplamYarisi);
		
	}

}
