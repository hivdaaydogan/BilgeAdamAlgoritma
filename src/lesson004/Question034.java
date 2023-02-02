package lesson004;

import java.util.Scanner;

public class Question034 {

	public static void main(String[] args) {
		// Verilen kelimenin harflerini alt alta yazdıralım
		//java
		
		//j
		//a
		//v
		//a
		
		String text = "Java";
		for (int i=0;i<text.length();i++) {
			System.out.println(text.charAt(i));
		}

		
		// Kullanıcıdan bir string değer alalım
		// aldığımız değeri
		// java
		// 0. indexi -> j
		// 1. indexi -> a

		for (int i=0;i<text.length();i++) {
		System.out.println(i+". indexi: " + text.charAt(i));
		}
	}

}
