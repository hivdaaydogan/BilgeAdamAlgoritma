package lesson002;

import java.util.Scanner;

public class Question018 {

	public static void main(String[] args) {

		// Girilen char değerinin alfabenin içinde var mı yok mu?
		// a A
		// 7 ? . '
		
		Scanner input = new Scanner (System.in);
		System.out.println("karakter giriniz: ");
		char ch = input.next().charAt(0); 
		
		int asciiCode = ch;
		 
		if (asciiCode >=65 && asciiCode <= 90 || asciiCode >= 97 && asciiCode <= 122 ) {
			System.out.println("karakter alfabede");
		}else{
			System.out.println("karakter alfabede değil");
		}

		

	}

}
