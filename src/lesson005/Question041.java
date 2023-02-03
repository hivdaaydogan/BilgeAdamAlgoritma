package lesson005;

public class Question041 {

	public static void main(String[] args) {
		
		int[] sayilar = { 0,120,-5,-85,-256,16,1258,81,14 };
		
		// 0'dan küçük sayılar yerine 100 koyalım:
		
		for (int i=0;i<sayilar.length;i++) {
			if (sayilar[i]<0) {
				sayilar[i] = 100;
				int yeniDeger = sayilar[i];
				System.out.println(i+". indexi değişti --> " + yeniDeger);
			}
		}
		

	}

}
