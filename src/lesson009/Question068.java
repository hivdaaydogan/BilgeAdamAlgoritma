package lesson009;

import java.util.Scanner;

public class Question068 {
	
	public static int sesliHarf(String kelime) {
		int sayac=0;
		for(int i=0;i<kelime.length();i++) {
			char karakter = kelime.charAt(i);
			switch (karakter) {
			case 'a','e','i','o','u':
				sayac++;
				continue;

			default:
				break;
			}
		}
		return sayac;
	}

	public static void main(String[] args) {
		// girilen kelimedeki sesli harflerin sayısını bulan metodu yazalım
		// metod int dönsün parametre olarak String alacak
		
		System.out.println(sesliHarf("hivdoli"));

	}

}
