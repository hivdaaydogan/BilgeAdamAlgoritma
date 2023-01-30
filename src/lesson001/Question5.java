package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		// Girilen TL değerini USD'ye çeviren programı yazalım 
		// 1 USD 18.90 TL
		
		Scanner input = new Scanner(System.in);
		System.out.println("TL değeri:");
		float tlDegeri = input.nextFloat();
		
		float usd = 18.90f;
		float usdDegeri = tlDegeri / usd;
		System.out.println("USD Değeri:" + usdDegeri);
		
	}

}
