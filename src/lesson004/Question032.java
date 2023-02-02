package lesson004;

import java.util.Scanner;

public class Question032 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel sayı olup olmadığını bulan program
		// mükemmel sayı: bölenlerinin toplamı kendisini veren sayı
		// 6 -> 1+2+3 = 6
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi = input.nextInt();
		
		int toplam = 0;
		
		for (int i=1; i<sayi;i++) {
			if (sayi%i==0) {
				toplam +=i;
			}
		}
		if (toplam == sayi) {
			System.out.println("sayı mükemmel");
		}else
            System.out.println("mükemmel değil");

	}

}
