package lesson003;

import java.util.Scanner;

public class Question027 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulalım
		// 127 --> 1+2+7 = output ->10

		// do-while

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi = input.nextInt();

		int toplam = 0;
		do {
			toplam = toplam + sayi % 10;
			sayi = sayi / 10;
		} while (sayi > 0);
		System.out.println(toplam);
	}

	
	
	   // while
//	int kalan =0;
//	int basamakToplam =0;
//	while (sayi2 %10 >0) {
//		kalan = sayi2 %10;
//		basamakToplam = basamakToplam+kalan;
//		
//	}
	
	
	

}
