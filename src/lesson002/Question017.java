package lesson002;

import java.util.Scanner;

public class Question017 {

	public static void main(String[] args) {
		
		// Girilen karakterin ascii kodunu bulan program.
		
		//how to get input char in java17
		Scanner input = new Scanner (System.in);
		System.out.println("karakter giriniz: ");
		char ch = input.next().charAt(0); 
		
		int asciiCode = ch;
		System.out.println(asciiCode);
		
		

	}

}
