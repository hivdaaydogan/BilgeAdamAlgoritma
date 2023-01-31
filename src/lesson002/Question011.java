package lesson002;

import java.util.Scanner;

public class Question011 {

	public static void main(String[] args) {
		
	    // Dairenin çevresini ve alanını hesaplayan bir program
		// r değerini kullanıcıdan alıcaz
		// Pi = 3.14
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yarıçap giriniz: ");
		double r = input.nextDouble();
		if (r <= 0) {
			System.out.println("sıfırdan büyük bir değer giriniz.");
		}
		else {
		double pi = 3.14;
				
		double cevre = 2 * pi * r;
		double alan = pi * r * r;
		System.out.println("çevre: " + cevre + "alan: " + alan);
		}		
				
		
	
		
		
		
		
		
	}

}
