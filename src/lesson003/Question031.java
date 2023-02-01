package lesson003;

import java.util.Scanner;

public class Question031 {

	public static void main(String[] args) {
		// Girilen sayıda hangi basamakta hangi sayı var onu bulucaz
		// 375
		// birler basamağı ->5
		// onlar basamağı ->7
		// yüzler basamağı ->3
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi = input.nextInt();
		int i =1;

		while (sayi > 0){  
			System.out.println(i + "ler basamağı: " + sayi % 10);
			sayi = sayi/10; 
			i =i*10;
		}



	}

}
