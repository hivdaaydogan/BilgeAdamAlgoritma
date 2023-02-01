package lesson003;
import java.util.Scanner;

public class Question023 {

	public static void main(String[] args) {
		
		// Girilen sayının faktöriyelini bulan program
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int x = input.nextInt();
		int faktor = 1;
		
		for (int i=1;i<=x;i++) {
			faktor = faktor * i;
		}
		System.out.println("faktöriyel: " + faktor);

  
		 
		

	}

}
