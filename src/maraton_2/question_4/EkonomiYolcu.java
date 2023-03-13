package maraton_2.question_4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {

	private int EKONOMIFIYAT = 100;
	public static HashMap <String, Integer> biletList = new HashMap<>();
	public static HashMap<String, Integer> biletBilgi = new HashMap<>();

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		int biletFiyati = (int) (getBASEFIYAT() + this.EKONOMIFIYAT);
		biletBilgi.put(firmaAdi.name(), biletFiyati);
		biletList.put(firmaAdi.name(), getKoltukNo());
		System.out.println(getAd() +" adlı yolcu " + firmaAdi.name() 
                          + " için Ekonomi sınıfından bilet almıştır. Biletleriniz -->" + biletBilgi);
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu " + getAd() + " " + getSoyad() + " biletleri:" + biletList );
		
	}

	@Override
	public void checkInYap() {
		if(isCheckin()) {
			System.out.println(getAd() + " checkin zaten yapılmıştır uçağa binebilirsiniz.");
		}else {
			setCheckin(true);
			System.out.println("Checkin yapılmıştır iyi uçuşlar.");
		}
		
	}

	@Override
	public void ucagaBin() {
		if(isCheckin()) {
			System.out.println(getAd() +" "+ getKoltukNo() +" numaralı koltukta uçağa binebilirsiniz.");
		} else {
			System.out.println("Uçağa binmek için lütfen checkin yapın.");
		}
		
	}

	public int getEKONOMIFIYAT() {
		return EKONOMIFIYAT;
	}

	public void setEKONOMIFIYAT(int eKONOMIFIYAT) {
		EKONOMIFIYAT = eKONOMIFIYAT;
	}

	public static HashMap<String, Integer> getBiletList() {
		return biletList;
	}

	public static void setBiletList(HashMap<String, Integer> biletList) {
		EkonomiYolcu.biletList = biletList;
	}

	public static HashMap<String, Integer> getBiletBilgi() {
		return biletBilgi;
	}

	public static void setBiletBilgi(HashMap<String, Integer> biletBilgi) {
		EkonomiYolcu.biletBilgi = biletBilgi;
	}
	
	
	
	
	
	
	
	

}
