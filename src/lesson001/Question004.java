package lesson001;

import java.util.Scanner;

public class Question004 {

	public static void main(String[] args) {
		
		// Verilen iki sayının hangisinin büyük olduğunu bulan program
		
		int sayi1 = 5;
		int sayi2 = 10;
		if (sayi1 > sayi2) {
			System.out.println("Büyük sayı:" + sayi1);
		}
		else if (sayi2 > sayi1) {
			System.out.println("Büyük sayı:" + sayi2);
		}
		else
			System.out.println("sayılar eşittir");
		
		
		
		// Girilen iki sayıdan hangisinin büyük olduğunu bulan program 
		
		Scanner input = new Scanner(System.in);
		System.out.println("İlk sayı:");
		int sayi3 = input.nextInt();
		System.out.println("İkinci sayı:");
		int sayi4 = input.nextInt();
		if (sayi1 > sayi2) {
			System.out.println("Büyük sayı:" + sayi3);
		}
		else if (sayi2 > sayi1) {
			System.out.println("Büyük sayı:" + sayi4);
		}
		else
			System.out.println("sayılar eşittir");

		
		


	}

}
