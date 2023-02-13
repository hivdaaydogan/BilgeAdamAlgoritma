package lesson008;

public class Question063 {
	
	// parametre olarak iki tane array alan
	// ve aldıgı arrayleri toplayıp farklı bir arrayin içinde saklayan method

	// toplamları yazdırcaz

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };

		int[] toplam = arrayToplam(array1, array2);

		bilgilerYazdir(toplam);

	}
	
	//16:00
	
	public static void bilgilerYazdir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	public static int[] arrayToplam(int[] array1, int[] array2) {

		int[] toplam = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			toplam[i] = array1[i] + array2[i];
		}
		return toplam;
	}
}
