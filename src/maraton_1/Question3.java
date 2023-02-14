package maraton_1;

public class Question3 {
	/*
	 * 3. karakterSayici isimli static bir Java metodu yazınız. 
	 * Bu metod bir String bir de char değişkenini parametre olarak alacaktır. 
	 * Fonksiyon paramtre olarak gelen String içindeki yine parametre olarak gelen 
	 * karakterin sayısını sayıp return edecektir.
	 */
	
	public static void karakterSayici(String cumle, char harf) {
		int sayac = 0;
		for(int i=0;i<cumle.length();i++) {
			if(cumle.charAt(i) == harf) {
				sayac++;
			}
		}
		System.out.println(sayac);
	}

	public static void main(String[] args) {
		
		karakterSayici("Bugün güzel bir gün", 'g');

	}

}
