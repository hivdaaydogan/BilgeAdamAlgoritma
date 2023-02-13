package lesson008;

public class Question061 {

	public static void asalMi(int sayi) {
		boolean asalMi = true;
		
		for(int j=2;j<sayi;j++) {
			if(sayi%j==0) {
				asalMi = false;
			}
		}
		if(asalMi) {
			System.out.println(sayi+ " asaldir");
		}
	}
	
	public static void main(String[] args) {
		// 1'den 100'e kadar olan sayıların asal olanlarını bulan metodu yazalım
		// asalMi metodumuz yazıcaz, bu metodda sadece sayi asal mı diye bakıyoruz
		// daha sonra mainde for döngüsüne sokup bulucaz
		
		for(int i=2;i<1000;i++) {
			asalMi(i);
		}

	}

}
