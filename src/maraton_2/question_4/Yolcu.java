package maraton_2.question_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Yolcu {
	
	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkin;
	private EFirmaAdi firmaAdi;
	private static int BASEFIYAT = 100;
	static List<Integer> biletNumaraları = new ArrayList<>(); 
	
	
	
	
	public Yolcu(int id, String ad, String soyad) {
		super();
		Random random = new Random();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = random.nextInt(0,100);
		this.checkin = false;
	}

	
	public abstract void biletAl(EFirmaAdi firmaAdi);
	public abstract void yolcuBilgileriniGetir();
	public abstract void checkInYap();
	public abstract void ucagaBin();
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getKoltukNo() {
		return koltukNo;
	}


	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}


	public boolean isCheckin() {
		return checkin;
	}


	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}


	public int getBASEFIYAT() {
		return BASEFIYAT;
	}


	public EFirmaAdi getFirmaAdi() {
		return firmaAdi;
	}


	public void setFirmaAdi(EFirmaAdi firmaAdi) {
		this.firmaAdi = firmaAdi;
	}




	public static void setBASEFIYAT(int bASEFIYAT) {
		BASEFIYAT = bASEFIYAT;
	}
	
	
	
	
	

}
