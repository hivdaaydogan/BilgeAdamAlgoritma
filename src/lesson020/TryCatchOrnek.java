package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {
	
	// bir tane bölme metodu yazalım kullanıcıdan 2 tane sayı alcaz
	// ve bölümü return edicez bunu yaparken gerekli hatalara karşı önlem alalım
	
	// kullanıcıdan doğru sonuç girene kadar girdi alalım
	
	
	public static int bolme() {
		boolean kontrol = true;
		int bolum = 0;
		while (kontrol) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. Sayi");
				int sayi1 = scanner.nextInt();
				System.out.println("2. Sayi");
				int sayi2 = scanner.nextInt();
				bolum = sayi1 / sayi2;
				kontrol = false;
			} catch (ArithmeticException e) {
				System.out.println(Constant.NUMBER_EQUALS_ZERO);
			}  catch (InputMismatchException e) {
				System.out.println(Constant.MIS_MATCH_EXCEPTION);
			}catch (Exception e) {
				System.out.println(Constant.UNEXPECTED_EXCEPTION);
			}
		}
		return bolum;
	}
	

	
	
	public static void main(String[] args) {
	
		int bolum1 = bolme();
		System.out.println(bolum1);
		
		
	}
	
}
