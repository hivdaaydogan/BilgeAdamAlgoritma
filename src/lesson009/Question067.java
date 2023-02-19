package lesson009;

import java.util.Scanner;

public class Question067 {
	
	public static int kucukleriSay(int[]arr, int sayi) {
		if(arr.length<0 || arr.length>100) {
			System.out.println("arrayin uzunluğu hatalı");
		}
		if(sayi<0 || sayi>100) {
			System.out.println("sayı hatalı");
		}
		for(int number : arr) {
			if(number<0 || number>100) {
				System.out.println("arrayin elemanları hatalı");
			}
		}
		
		int sayac =0;
		
		for(int i=0;i<arr.length;i++) {
			if(sayi>arr[i]) {
				sayac++;
			}
		}
		return sayac;	
	}

	public static void main(String[] args) {
		// Coensio
		
		// girilen sayının arraydeki kaç tane sayıdan büyük olduğunu bulan metod
		// array uzunluğu 1 ile 100 arasında olacak
		// girilen sayi 1 ile 100 arasında olacak
		// arrayin içindeki sayılar da 1 ile 100 arasında olacak
		
		int[] myNum = {1,3,4,6,9};
		
		//kucukleriSay(myNum,6);  ==> 3
		//kucukleriSay(myNum,3);  ==> 1
		
		System.out.println(kucukleriSay(myNum,9));
		

	}

}
