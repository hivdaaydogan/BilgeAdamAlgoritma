package lesson004;

import java.util.Scanner;

public class Question033 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adet sayıdan 
		// en büyük ve en küçük olanı bulan program
		
		
		Scanner input = new Scanner(System.in);
		int enBuyuk=-1;
		int enKucuk=101;
		int num;
		int i=0;
		
		while (i<5) {
			System.out.println("sayı girin");
			num = input.nextInt();
			
			if(num <=100 && num >=0) {
				if(num > enBuyuk) {
					enBuyuk = num;
				}
				if (num<enKucuk) {
					enKucuk =num;
				}
				i++;
			}else {
				System.out.println("geçerli sayıları girin");
			}
		}
		System.out.println("max: "+enBuyuk);
		System.out.println("min: "+enKucuk);
		
		
		
		
		
		
		
		
		// denediğim ve sonuc vermeyen algoritma
//		for (int i=0;i<5;i++) {
//			System.out.println("Lütfen bir sayı giriniz: ");
//			int sayi = input.nextInt();
//			if (sayi<0 || sayi >100) {
//				System.out.println("lütfen 0 ile 100 arası bir sayı giriniz");
//			}else enBuyuk = sayi;
//			enKucuk = sayi;
//		if (sayi>enBuyuk) {
//			enBuyuk = sayi;
//		}
//		if (sayi<enKucuk){
//			enKucuk = sayi;
//		}
//		}
//		System.out.println(enBuyuk + enKucuk);
	
		
		
		
		
		
		
		
		
		

	}

}
