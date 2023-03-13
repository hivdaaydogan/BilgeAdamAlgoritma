package maraton_2.question_4;

import java.util.HashMap;

public class BusinessYolcu extends Yolcu {

	private boolean isVIP;
	private int BUSINNESFIYAT = 200;
	private int BUSINNESVIPFIYAT = 150;
	public HashMap<String, Integer> biletList = new HashMap<>();
	public HashMap<String, Integer> biletBilgi = new HashMap<>();

	public BusinessYolcu(int id, String ad, String soyad, boolean vipMi) {
		super(id, ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		int toplam;
		setFirmaAdi(firmaAdi);
		if (isVIP) {
			int biletFiyati = (int) (getBASEFIYAT() + this.BUSINNESFIYAT + this.BUSINNESVIPFIYAT);
			biletBilgi.put(firmaAdi.name(), biletFiyati);
			biletList.put(firmaAdi.name(), getKoltukNo());
			System.out.println(getAd() + " adlı yolcu " + firmaAdi.name() + " için VIP bilet almıştır. Biletleriniz -->"
					+ biletBilgi);
		} else {
			int biletFiyati = (int) (getBASEFIYAT() + this.BUSINNESFIYAT);
			biletBilgi.put(firmaAdi.name(), biletFiyati);
			biletList.put(firmaAdi.name(), getKoltukNo());
			System.out.println(getAd() + " adlı yolcu " + firmaAdi.name() + " için VIP bilet almıştır. Biletleriniz -->"
					+ biletBilgi);
		}

	}

	@Override
	public void yolcuBilgileriniGetir() {
			if (isVIP) {
				System.out.println("Yolcu Bilgileri --> Business VIP Yolcusu " + getAd() + " " + getSoyad()
						+ " biletleri:" + biletList);
			} else {
				System.out.println("Yolcu Bilgileri --> Business Yolcusu " + getAd() + " " + getSoyad() + " biletleri:"
						+ biletList);
			}

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
	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}

	public int getBUSINNESFIYAT() {
		return BUSINNESFIYAT;
	}

	public void setBUSINNESFIYAT(int bUSINNESFIYAT) {
		BUSINNESFIYAT = bUSINNESFIYAT;
	}

	public int getBUSINNESVIPFIYAT() {
		return BUSINNESVIPFIYAT;
	}

	public void setBUSINNESVIPFIYAT(int bUSINNESVIPFIYAT) {
		BUSINNESVIPFIYAT = bUSINNESVIPFIYAT;
	}



}
