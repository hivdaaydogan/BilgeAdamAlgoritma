package lesson001;

import java.util.Scanner;


public class Question6 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan alınan vize ve final notlarını hesaplayarak
		// geçip geçmediğini hesaplayan program.
		
		// vize %40
		// final %60
		// 50 ve büyük eşitse geçer.
		// 50'den küçükse kalır.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vize: ");
		int vize = input.nextInt();
		System.out.println("Final: ");
		int finalNotu = input.nextInt();
		
		float not = vize * 0.4f + finalNotu * 0.6f;
		System.out.println("Not" + not);
		
		if (not >= 50) {
			System.out.println("geçti");
		}
		else 
			System.err.println("kaldı");   // err kırmızı yazması için. 
		
		
	}

}
