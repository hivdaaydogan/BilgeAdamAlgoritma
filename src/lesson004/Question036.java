package lesson004;

import java.util.Scanner;

public class Question036 {

	public static void main(String[] args) {
		// Verilen kelimenin içinde kaç tane "e" olduğunu bulan program
		
		String text = "kelime";
		int sayac=0;
		for (int i=0;i<text.length();i++) {
		   if (text.charAt(i)=='e') {
			   sayac++;
		} 
	}
		System.out.println(sayac);
		
		
		
		// Girilen kelimenin içinde kaç tane "e" olduğunu bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("metin girin");
		
		String text2 =scanner.nextLine();
		int counter=0;
		for(int i=0;i<text2.length();i++) {
			if(text2.charAt(i)=='e') {
				counter ++;
			}
		}
		System.out.println(counter);
		
		
	}

}
