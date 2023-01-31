package lesson002;

import java.util.Scanner;

public class Question016 {

	public static void main(String[] args) {


		// kullanıcıdan aldığımız sayı haftanın hangi gününe denk geliyor.
		// bu gün haftasonu mu haftaiçi mi?
		// switch case
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı girin: ");
		int sayi = input.nextInt();
		
		switch (sayi) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("salı");
			break;
		case 3:
			System.out.println("çarşamba");
			break;
		case 4:
			System.out.println("perşembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;

		default:
			System.out.println("1-7 arası girin");
			break;
		}
		switch (sayi) {
		case 1,2,3,4,5:
			System.out.println("haftaiçi");
			break;

		default:
			System.out.println("haftasonu");
			break;
		}
		

	}

}
