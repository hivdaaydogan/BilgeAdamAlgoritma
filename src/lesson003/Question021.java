package lesson003;
import java.util.Scanner;

public class Question021 {

	public static void main(String[] args) {
		
		// Girilen sayıya kadar olan sayıların toplamını yazdıralım.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int x = input.nextInt();
		int toplam = 0;
		for (int i=1;i<=x; i++) {
			toplam = toplam+i;
		}
		System.out.println(toplam);
		
		

	}

}
