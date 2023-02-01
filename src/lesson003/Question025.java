package lesson003;

import java.util.Scanner;

public class Question025 {

	public static void main(String[] args) {

		// Girilen sayının asal olup olmadığını bulan program.

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int x = input.nextInt();
		
	    boolean isPrime = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				isPrime = true;
			}else {
				isPrime = false;
			}
		}if (isPrime) {
			System.out.println("sayı asaldır");
		}else {
			System.out.println("sayı asal değildir");
		}
		

	}

}
