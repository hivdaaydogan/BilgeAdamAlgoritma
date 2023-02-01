package lesson003;

import java.util.Scanner;

public class Question029 {

	public static void main(String[] args) {
		// Kullanıcıdan sürekli sayı alacağız
		// Kullanıcı 0'a basınca sayıların çarpımını yazdırıcaz.
		
		// while
		
		int sayi = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("sayi girin: ");
		int carpim = 1;
		while ((sayi = input.nextInt()) !=0) {
			carpim = carpim * sayi;
		}
		if(sayi==0) {
			System.out.println(carpim);
		}
		System.err.println("Çıkış");
	}

}
