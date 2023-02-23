package lesson013;

public class Main {

	public static void main(String[] args) {
		
		// Sınav sınıfı oluşturalım attribute'lerini yazalım
		
//		Soru soru1 = new Soru();
//		String[] cevapSecenekleri = {"A", "B", "C", "D"};
//		
//		soru1.soruOlustur(cevapSecenekleri);
//		
//		// A B C D
//		for (int i=0;i<soru1.getCevapIcerikleri().length;i++) {
//			System.out.println(soru1.getCevapIcerikleri()[i]);
//		}
		
		Sinav sinav = new Sinav();
		sinav.sinavOlustur();
		sinav.cevapGir();
		sinav.cevaplariKontrolEt();

		
//		for (int i=0;i<sinav.getSorular().length;i++) {
//			System.out.println(sinav.getSorular()[i].getIcerik());
//		}
//		
//		System.out.println("*****************");
//		sinav.cevapGir();
	

	}

}
