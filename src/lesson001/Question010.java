package lesson001;

import java.util.Scanner;

public class Question010 {

	public static void main(String[] args) {
		
		// Girilen 3 sayıdan en büyük olanı yazdıran program.
		
		Scanner input = new Scanner(System.in);
		System.out.println("1 Sayı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.println("2 Sayı giriniz: ");
		int sayi2 = input.nextInt();
		System.out.println("3 Sayı giriniz: ");
		int sayi3 = input.nextInt();
		
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("büyük sayı:" + sayi1);
		}
		else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("büyük sayı:" + sayi2);
		}
		else if (sayi3 > sayi1 && sayi3 > sayi2) {
			System.out.println("büyük sayı:" + sayi3);
		}

		
	}

}
