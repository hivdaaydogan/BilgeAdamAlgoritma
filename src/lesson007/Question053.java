package lesson007;

import java.util.Scanner;

public class Question053 {

	public static void main(String[] args) {
		// İki kez üst üste aynı sayı klavyeden girilene kadar döngü devam edicek 
		// Üst üste iki sayı girildiğinde o zamana kadar girilen sayıların
		// ortalamasını veren program
		
		// 1 2 5 9 8 7 7
		
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		int toplam=0;
		int sayac=1;
		int sayi1=0;
		int sayi2=0;
//		for (int i=0;i<sayac;i++) {
//			System.out.println("Lütfen bir sayı giriniz: ");
//			int sayi = scanner.nextInt();
//			toplam += sayi;
//			sayac++;
//		}
//		System.out.println(toplam/sayac);
		
		while(check) {
			System.out.println("lütfen bir sayı giriniz: ");
			sayi2 = scanner.nextInt();
			if(sayi2 != sayi1) {
				toplam+=sayi2;
				sayi1=sayi2;
				sayac++;
			}else {
				check = false;
			}
		}
		System.out.println(toplam/sayac*1f);

	}

}
