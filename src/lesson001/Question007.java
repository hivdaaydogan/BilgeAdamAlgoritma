package lesson001;

import java.util.Scanner;

public class Question007 {

	public static void main(String[] args) {
		
		// Girilen sayının tek mi çift mi oldupunu bulan program.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = input.nextInt();
		
		if (sayi % 2 == 0) {
			System.out.println("Sayı çifttir.");
		}
		else
			System.out.println("Sayı tektir.");
		
		
		

	}

}
