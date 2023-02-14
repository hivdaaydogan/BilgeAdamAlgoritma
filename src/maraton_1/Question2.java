package maraton_1;

public class Question2 {
	/*
	 * 2. Bir dizide tekrar eden sayıyı bulan ve ekrana yazdıran bir static metod yazınız. 
	 * Metod parametre olarak int dizisi alacak ve ilk tekrar eden sayıyı bulup ekrana yazdıracaktır. 
	 * Tekrar eden sayı bulunmazsa “Tekrar eden sayı bulunamamıştır.” yazacaktır.
	 * int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 23, 18, 2, 0, 7 };
	 */
	
	public static void tekrarSayi(int[] array) {


		int sayac = 1;
		int sayi1 = 0;
		int sayi2 = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					sayac++;
					if (array[i] != 0) {
						sayi1 = array[i];
					}else {
						sayi2 = array[i];
					}
				}
			}
			if (sayi1 != 0 || sayi2 != 1) {
				break;
			}
		}
		if (sayac == 1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}else if(sayi2 != 1) {
			System.out.println(sayi2 + " sayısı " + sayac + " kez geçmiştir." );
		}else {
			System.out.println(sayi1 + " sayısı " + sayac + " kez geçmiştir." );
		}
			
	}


	public static void main(String[] args) {
		
		int[] array = { 9, 7, 5, 3, 7, 7, 1, 3, 18, 2, 0, 7 };

		int N = array.length;
		tekrarSayi(array);

	}

}




