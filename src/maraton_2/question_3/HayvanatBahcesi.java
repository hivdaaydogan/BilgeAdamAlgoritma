package maraton_2.question_3;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class HayvanatBahcesi {
		
		private Set<String> hashSetHayvanlar;
		private List<MemeliHayvan> memelilerList;
		private List<Surungen> surungenlerList;
		
		
		public HayvanatBahcesi() {
			this.surungenlerList = new ArrayList<Surungen>();  
			this.memelilerList =  new ArrayList<MemeliHayvan>();  
			this.hashSetHayvanlar = new HashSet<String>();  
		}
		
		public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
			if (hashSetHayvanlar.contains(m.getAd())){
				System.err.println("Hayvanat Bahçesinde bu hayvan var!");
			} else {
				memelilerList.add(m);
				hashSetHayvanlar.add(m.getAd());
			}
		}
		
		public void bahceyeSurungenEkle(Surungen s) {
			if (hashSetHayvanlar.contains(s.getAd())) {
				System.err.println("Hayvanat Bahçesinde bu hayvan var!");
			} else {		
				surungenlerList.add(s);
				hashSetHayvanlar.add(s.getAd());
			}
		}
		
		
		public void hayvanSesCikarsin(Hayvan h) {
			h.sesCikar();
		}
		
		
		public void hayvaninCinsiniBul(String hayvanAdi) {
			for (Hayvan h : surungenlerList) {
				if (h.getAd().equalsIgnoreCase(hayvanAdi)) {
					System.out.println(hayvanAdi + "   bir Sürüngen");
					return;
				}
			}
			
			for (Hayvan h : memelilerList) {
				if (h.getAd().equalsIgnoreCase(hayvanAdi)) {
					System.out.println(hayvanAdi + "  bir Memeli Hayvan");
					return;
				}
			}
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde yok!");
		}
		
		
		public void hayvaninBilgileriniYazdir(String hayvanAdi) {
			for (Hayvan h : surungenlerList) {
				if (h.getAd().equalsIgnoreCase(hayvanAdi)) {
					System.out.println(h.toString());
					return;
				}
			}
			
			for (Hayvan h : memelilerList) {
				if (h.getAd().equalsIgnoreCase(hayvanAdi)) {
					System.out.println(h);
					return;
				}
			}
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde yok!");
		}
		
		
		public void hayvaniHareketEttir(String hayvanAdi) {
			
			for (Surungen s : surungenlerList) {
				if (s.getAd().equalsIgnoreCase(hayvanAdi)) {
					s.surun();
					return;
				}
			}
			for (MemeliHayvan m : memelilerList) {
				if (m.getAd().equalsIgnoreCase(hayvanAdi)) {
					m.yuru();
					return;
				}
			}
			System.out.println(hayvanAdi + " isimli hayvan bu Hayvanat Bahçesinde yok!");
		}
		
	
		
}
