package lesson005;

import java.util.Scanner;

public class HWQuestion001 {

	public static void main(String[] args) {
		// 1
		// Question43 için kaçları saymak istiyorsak kullanıcıdan sayıları alalım.
		
		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen saymak istediğiniz sayıları girin: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int sayacx=0;
		int sayacy=0;
		for (int i=0;i<array.length;i++) {
			if (array[i]== x) {
				sayacx++;
			}else if (array[i]== y) {
				sayacy++;
			}}
			if (sayacx>sayacy) {
				System.out.println(x + " daha fazladır. "+ sayacx+ " tane " + x +" var");
			}else if (sayacy>sayacx) {
				System.out.println(y +" daha fazladır.  "+ sayacy+ " tane "+  y +" var");
			}else {
				System.out.println("eşit sayıdalar");
			}
		

	}

}
