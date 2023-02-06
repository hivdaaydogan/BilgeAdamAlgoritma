package lesson006;

import java.util.Scanner;

public class Question047 {

	public static void main(String[] args) {
		// 2x2'lik bir array oluşturalım
		// bu arrayin içine isimler yazdıracağız
		// isimleri kullanıcıdan alacağız
		// çıktı olarak
		
		// 1. Grup
		// Ali
		// Mehmet
		
		// 2. Grup
		// Ahmet
		// Hakan
		
		Scanner scanner = new Scanner(System.in);
		String[][] grupArray = new String[2][2];
		
		int[][] array = new int[2][2];
		
		for (int i=0;i<grupArray.length;i++) {
			for (int j=0;j<grupArray[i].length;j++) {
				System.out.println("isim: ");
				String isim = scanner.nextLine();
				grupArray[i][j]= isim;
			}
		}
			for (int i=0;i<grupArray.length;i++) {
				System.out.println(i+1+". Grup");
				for (int j=0;j<grupArray[i].length;j++) {
					System.out.println(grupArray[i][j]);
				}
			}
	
		


	}

}
