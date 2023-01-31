package lesson001;

import java.util.Scanner;

public class Question008 {

	public static void main(String[] args) {
		
		// Kenarları girilen üçgenin nasıl bir üçgen olduğunu bulan program.
		
		Scanner input = new Scanner(System.in);
		System.out.println("birinci kenarı giriniz: ");
		int kenar1 = input.nextInt();
		System.out.println("ikinci kenarı giriniz: ");
		int kenar2 = input.nextInt();
		System.out.println("üçüncü kenarı giriniz: ");
		int kenar3 = input.nextInt();
		
		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
			if (kenar1 == kenar2 && kenar2 == kenar3) {
				System.out.println("üçgen eşkenar üçgendir.");
			}
			else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3) {
				System.out.println("üçgen ikizkenar üçgendir.");
			}
			else
				System.out.println("üçgen çeşitkenar üçgendir.");

		}else 
			System.out.println("üçgen oluşturamazsınız.");
		

	}

}
