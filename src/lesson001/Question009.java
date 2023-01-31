package lesson001;

import java.util.Scanner;

public class Question009 {

	public static void main(String[] args) {
		
		// Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program.
		
		// 90 üstü AA
		// 80 ve 90 arası BB
		// 70 le 80 arası CC
		// 60 la 70 arası DD
		// 60 tan küçükse FF kaldı olsun
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ortalama giriniz: ");
		int ort = input.nextInt();
		
		if (ort >= 90) {
			System.out.println("AA ile geçti");
		}
		else if (80 <= ort && ort < 90) {
			System.out.println("BB ile geçti");
		}
		else if (70 <= ort && ort < 80) {
			System.out.println("CC ile geçti");
		}
		else if (60 <= ort && ort < 70) {
			System.out.println("DD ile geçti");
		}
		else if (ort < 60) {
			System.out.println("FF ile geçti");
		}

	}

}
