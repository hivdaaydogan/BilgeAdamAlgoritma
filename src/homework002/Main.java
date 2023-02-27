package homework002;

import java.util.ArrayList;

public class Main {
	/*
	 * Takım diye bir sınıf oluşturalım name, puan, kasa fieldları olsun 
	 * takımlar aralarında maç yapacak şekilde metod yazalım, 
	 * metodda random 1, 2 ve 3 sayıları arasından seçilecek, 
	 * 1 gelirse ilk takım maçı kazanacak 3 puan alacak takım kasasına 10.000TL, 
	 * 2 gelirse ikinci takım maçı kazanacak 3 puan alacak takım kasasına 10.000TL, 
	 * 1 veya 2 gelmezse eğer maç berabere biter iki takım da 1 er puan alır ve iki takımın kasasına 5.000TL.
	 * takım1 barcelona, takım2 realmadrid, barcelona realmadride karşı maçı kazanmıştır.
	 */
	
	// takimManager.macYap(takim1. takim2);
	
	// kasa göster metodu
	// çıktı --> takım ismi ... + takım kasası ...
	
	// puan durumu gösteren metod, parametre olarak takimlar array'ini göndereceğiz
	// çıktı --> takım + puanı bize yazdırsın
	
	// iflasEtmeDurumu() olan takımları bize göstersin
	// takımın kasası 5000'den az ise bu takımları listeleyeceğiz
	
	// sampiyonuGoster metodu
	// parametre olarak takimlar array
	// Şampiyon ...

	
	public static void main(String[] args) {
		
		TakimManager takimManager = new TakimManager();
				
		Takim takim1 = new Takim("Barcelona", 0, 0);
		Takim takim2= new Takim("RealMadrid", 0, 0);
		Takim takim3 = new Takim("Sevilla", 0, 0);
		Takim takim4 = new Takim("AtleticoMadrid", 0, 0);
		
		ArrayList<Takim> list = new ArrayList<>();
		list.add(takim1);
		list.add(takim2);
		list.add(takim3);
		list.add(takim4);
		//System.out.println(list);
		
		System.out.println("\n* * * Karşılaşmalar * * *");
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim3, takim4);
		takimManager.macYap(takim1, takim4);
		takimManager.macYap(takim2, takim3);
		takimManager.macYap(takim2, takim4);
		takimManager.macYap(takim1, takim2);
		
		System.out.println();
		
		System.out.println("* * * Takım Kasaları * * *");
		takimManager.kasaGoster(takim1);
		takimManager.kasaGoster(takim2);
		takimManager.kasaGoster(takim3);
		takimManager.kasaGoster(takim4);
		
		takimManager.puanDurumu(list);
		
		//takimManager.iflasEtmeDurumu(list);
		
		takimManager.sampiyonuGoster(list);
		
		
			
		

		
		
		
		
		



		
	}
}
