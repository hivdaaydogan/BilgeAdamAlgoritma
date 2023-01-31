package lesson001;

import java.util.Scanner;

public class Question003 {

	public static void main(String[] args) {
		
		// Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğunu biliyoruz. 
		// Verilen ürünün ham fiyatını bulan program.
		
		float fiyat = 100;
		//int double float default değerleri 0 olarak kabul ediliyor. 
		float hamFiyat = 0;
		float kar = 0.15f;
		float kdv = 0.18f;
		
		hamFiyat = fiyat - (fiyat*kar)-(fiyat*kdv);
		
		System.out.println("ham fiyatı --> " + hamFiyat);
		
		System.out.println("*****");
		int fiyat2 = 100;
		float vergisizFiyat = fiyat2 * 0.82f;
		System.out.println(vergisizFiyat);
		float hamFiyat2 = fiyat2 * 0.67f;
		System.out.println(hamFiyat2);
		
		
		// Girilen iki sayının 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Fiyat giriniz:");
		int fiyat3 = input.nextInt();
		float vergisizFiyat2 = fiyat3 * 0.82f;
		System.out.println("vergisiz" + vergisizFiyat2);
		float hamFiyat3 = fiyat2 * 0.67f;
		System.out.println(hamFiyat3);
		
	
	}

}
