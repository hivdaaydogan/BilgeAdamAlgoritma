package lesson002;

import java.util.Scanner;

public class Question019 {

	public static void main(String[] args) {
		
		// Girilen karakterin ünlü mü ünsüz mü olduğunu bulan program
		
		Scanner input = new Scanner (System.in);
		System.out.println("karakter giriniz: ");
		char ch = input.next().charAt(0); 
		
		int asciiCode = ch;
		
		if (asciiCode == 65 || asciiCode == 69 || asciiCode == 73 || asciiCode == 79 || asciiCode == 85
				|| asciiCode == 97 || asciiCode == 101 || asciiCode == 105 || asciiCode == 111
				|| asciiCode == 117) {
			System.out.println("karakter ünlü");
		}else {
			System.out.println("karakter ünsüz");
		}
		

	}

}
