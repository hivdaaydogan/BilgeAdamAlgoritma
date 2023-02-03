package lesson005;

public class Question043 {

	public static void main(String[] args) {

		// ÖDEV: kaçları saymak istiyorsak kullanıcıdan sayıları alalım.

		// dizi içerinde 2 ve 4'ün kaç kere geçtiğini
		// hangisinin daha fazla olduğunu bulan program
		
		// output --> 4'ler 2'lerden daha fazla dizinin içinde 4 tane 4 var.
		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8};
		
		int sayac2=0;
		int sayac4=0;
		for (int i=0;i<array.length;i++) {
			if (array[i]== 2) {
				sayac2++;
			}else if (array[i]==4) {
				sayac4++;
			}}
			if (sayac2>sayac4) {
				System.out.println("2'ler 4'lerden daha fazla içinde "+ sayac2+ "tane 2 var");
			}else if (sayac4>sayac2) {
				System.out.println("4'ler 2'lerden daha fazla içinde "+ sayac4+ " tane 4 var");
			}else {
				System.out.println("eşit sayıdalar");
			}
		
		

	}

}
