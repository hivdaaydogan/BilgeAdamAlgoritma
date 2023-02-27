package homework002;

import java.util.ArrayList;
import java.util.Random;

public class TakimManager {
	

	public void macYap(Takim takim1, Takim takim2) {
		Random random = new Random();
		int rand = random.nextInt(1,4);
		if (rand == 1) {
			System.out.println(takim1 + ", " + takim2 + " karşısında maçı kazanmıştır.");
			takim1.setPuan(takim1.getPuan()+3);
			takim1.setKasa(takim1.getKasa()+10000);
		}else if (rand == 2) {
			System.out.println(takim2 + ", " + takim1 + " karşısında maçı kazanmıştır.");
			takim2.setPuan(takim2.getPuan()+3);
			takim2.setKasa(takim2.getKasa()+10000);
		}else {
			System.out.println(takim1 + " ve " + takim2 + " berabere kalmıştır.");
			takim1.setPuan(takim1.getPuan()+1);
			takim2.setPuan(takim2.getPuan()+1);
			takim1.setKasa(takim1.getKasa()+5000);
			takim2.setKasa(takim2.getKasa()+5000);
		}		
	}
	
	
	public void kasaGoster(Takim takim) {
		System.out.println(takim.getName() + " Kasası --> " + takim.getKasa());
	}
	
	
	public void puanDurumu(ArrayList<Takim> takimlarArrayList) {
		System.out.println("\n* * * Puan Durumu * * *");
		for(Takim takim : takimlarArrayList) {
			System.out.println(takim.getName() + " Puanı --> " + takim.getPuan() );
		}
	}
	
	
	public void iflasEtmeDurumu(ArrayList<Takim> takimlarArrayList) {
		System.out.println("\n* * * İflas Durumundaki Takımlar * * *");
		for (Takim takim : takimlarArrayList) {
			if (takim.getKasa() < 5000) {
				System.out.println(takim.getName() + " takımı iflas durumunda.");
			}
		}
	}
	
	
	public void sampiyonuGoster(ArrayList<Takim> takimlarArrayList) {
		Takim sampiyon = takimlarArrayList.get(0);
		Takim sampiyon1=null ;
		for (int i=0; i<takimlarArrayList.size();i++) {
			if( takimlarArrayList.get(i).getPuan() > sampiyon.getPuan()) {
				sampiyon1 = sampiyon;
				sampiyon = takimlarArrayList.get(i);
			}else if (sampiyon1 == null || takimlarArrayList.get(i).getPuan() > sampiyon1.getPuan()) {
				sampiyon1 = takimlarArrayList.get(i);
			}
		}
		if (!sampiyon1.equals(null) && sampiyon.getPuan() == sampiyon1.getPuan()) {
			System.out.println("\nŞAMPİYON --> Puanlarda eşitlik vardır. Şampyonluk maçı yapılacak.");
		}else {
			System.out.println("\nŞAMPİYON --> " + sampiyon.getName());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
