package lesson005;

public class Question042 {

	public static void main(String[] args) {
		
		// bu sayı çifttir ve bu sayı tektir şeklinde çıktı alan ve
		// dizi'deki tüm sayıların toplamını veren program
		
		// dizinin içindeki elemanların toplamını yazdıralım
		
		int[] sayilar = { 2,4,10,5 };
		int toplam = 0;
		for (int i=0;i<sayilar.length;i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i]%2 == 0) {
				System.out.println(i + " çifttir");
			}else
				System.out.println(i + " tektir");
		}
		System.out.println("toplamı: "+ toplam);

	}

}
