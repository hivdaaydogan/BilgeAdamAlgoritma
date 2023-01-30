package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// javada primitive tipler nelerdir?
		// birbirlerinden farkı?
		
		//Verilen isim ve soyisim değerlerini hello
		//(isim) (soyisim şeklinde yazdıralım)
		
		//değişken tanımlarken okunaklı olsun.
		String isim = "mehmet";
		String soyisim = "kaya";
		
		System.out.println("Hello: " + isim + " " +soyisim);
		
		
		// Girilen isim ve soyisimi yazdıralım.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen isim giriniz:");
		String isim2 = input.nextLine();
		System.out.println("Soyisim girin:");
		String soyisim2 = input.nextLine();
		System.out.println("girilen isim:" + isim2 + " " + soyisim2 );

	}

}
