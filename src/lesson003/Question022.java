package lesson003;
import java.util.Scanner;

public class Question022 {

	public static void main(String[] args) {

		// Girilen sayı için çarpım tablosunu veren programı yazalım.
		
		// 6x1 =6
		// 6x2 =12
		// 6x3 =18 ...
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen bir sayı giriniz: ");
//		int x = input.nextInt();
//		
//		int carpim = 0;
//		for (int i=1; i<=10; i++) {
//			carpim = x * i;
//			System.out.println(carpim);
//		}
		
		// iç içe for kullanarak çözelim
		// bütün çarpım tablosunu yazdıralım
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.println(i+ " x " + j + " = " + i*j);
			}
		}
		
		

		
		

	}

}
