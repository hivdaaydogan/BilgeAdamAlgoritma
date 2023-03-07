package homework003;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {

	private String marka;
	private String boyut;
	private static int ses = 0;
	private static int acikKanal = 1;
	private static ArrayList<Kanal> kanallar = new ArrayList<Kanal>();
	public static boolean tvAcikMi = false;
	public static boolean tvKuruluMu = false;
	
	
	
	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		Televizyon.kanallariOlustur();
	}

	
	public static void kanallariOlustur() {
		MuzikKanali kanal1 = new MuzikKanali("DreamTurk", 1, "Müzik");
		MuzikKanali kanal2 = new MuzikKanali("PowerTurk", 2, "Müzik");
		HaberKanali kanal3 = new HaberKanali("NTV", 3, "Haber");
		HaberKanali kanal4 = new HaberKanali("TRTÇocuk", 4, "Çocuk");
		Televizyon.kanallar.add(kanal1);
		Televizyon.kanallar.add(kanal2);
		Televizyon.kanallar.add(kanal3);
		Televizyon.kanallar.add(kanal4);
	}
	
	public static void kanalList() {
		for(int i=0; i<kanallar.size();i++) {
			System.out.println("Kanal: " + kanallar.get(i).getKanalNo() + " " + kanallar.get(i).getKanalAdi());
		}
	}
	
	
	public static void televizyonuAc() {
		if(tvKuruluMu) {
			if(tvAcikMi) {
				System.out.println("Televizyon zaten açık");
			}else {
				tvAcikMi = true;
				System.out.println("Televizyon açıldı");
			}
		}else {
			System.out.println("Televizyonun kurulumunu yapınız!");
		}
	}
	
	
	public static void sesiArtir() {
		if(tvAcikMi) {
			if(Televizyon.ses <20) {
				ses++;
				System.out.println("Ses seviyesi: " + ses);
			}else {
				System.out.println("Ses seviyesi maksimumda!");
			}
		}else {
			System.out.println("Televizyonu açın!");
		}
	}
	
	public static void sesiAzalt() {
		if(tvAcikMi) {
			if(Televizyon.ses > 0) {
				ses--;
				System.out.println("Ses seviyesi: " + ses);
			}else {
				System.out.println("Ses seviyesi minimumda!");
			}
		}else {
			System.out.println("Televizyonu açın!");
		}
	}
	
	public static void kanalDegistir() {
		if(tvAcikMi) {
			kanalList();
			System.out.println("\nKanal seçiniz: ");
			Scanner scanner = new Scanner(System.in);
			int kanalDegistir = scanner.nextInt();
			if(kanalDegistir>0 && kanalDegistir<5) {
				acikKanal = kanalDegistir;
				System.out.println("Kanal değiştirildi: " + acikKanal);
			}else {
				System.out.println("Lütfen geçerli bir kanal giriniz!");
			}
		}else {
			System.out.println("Televizyonu açın!");
		}
	}
	
	public static void kanalBilgisiGoster() {
		if(tvAcikMi) {
			for(Kanal kanal : kanallar) {
				if(kanal.getKanalNo() == acikKanal) {
					System.out.println("Kanal: " + kanal.getKanalNo() + " " + kanal.getKanalAdi());
				}
			}
		}else {
			System.out.println("Televizyonu açın!");
		}
	}
	
	public static void televizyonuKapat() {
		if(tvAcikMi) {
			tvAcikMi = false;
			System.out.println("Televizyon kapatıldı!");
		}else {
			System.out.println("Televizyon zaten kapalı!");
		}
	}
	

	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getBoyut() {
		return boyut;
	}


	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}


	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}


	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}


	public static boolean isTvAcikMi() {
		return tvAcikMi;
	}


	public static void setTvAcikMi(boolean tvAcikMi) {
		Televizyon.tvAcikMi = tvAcikMi;
	}


	public static boolean isTvKuruluMu() {
		return tvKuruluMu;
	}


	public static void setTvKuruluMu(boolean tvKuruluMu) {
		Televizyon.tvKuruluMu = tvKuruluMu;
	}


	public int getSes() {
		return ses;
	}


	public void setSes(int ses) {
		this.ses = ses;
	}
	
	
	
	
	
}
