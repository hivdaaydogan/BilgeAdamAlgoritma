package maraton_2.question_4;

public class Main {

	public static void main(String[] args) {
		
		Yolcu yolcu1 = new BusinessYolcu(7755, "Mert", "Kaya", false);
		Yolcu yolcu2 = new EkonomiYolcu(8899, "Ahmet", "Demir");
		Yolcu yolcu3 = new BusinessYolcu(4455, "Aslı", "Bahar", true);
		
		System.out.println("* * * * * Businnes VIP Yolcu * * * * *");
		yolcu3.biletAl(EFirmaAdi.ADJ);
		yolcu3.biletAl(EFirmaAdi.THY);
		System.out.println("* * *");
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		System.out.println("* * * * * Ekonomi Yolcu * * * * *");
		yolcu2.biletAl(EFirmaAdi.ADJ);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.biletAl(EFirmaAdi.THY);
		System.out.println("* * * ");
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileriniGetir();
		
		

	}

}
