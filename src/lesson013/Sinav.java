package lesson013;

import java.util.Scanner;

public class Sinav {
	
	private int maxPuan;
	private int sure;
	private int soruSayisi;
	private String ders;
	private String konu;
	private Soru[] sorular;
	private String[] cevapSecenekleri = {"A", "B", "C", "D"};
	private String[] cevaplar;
	
	
	public Sinav() {
	}


	public int getMaxPuan() {
		return maxPuan;
	}


	public void setMaxPuan(int maxPuan) {
		this.maxPuan = maxPuan;
	}


	public int getSure() {
		return sure;
	}


	public void setSure(int sure) {
		this.sure = sure;
	}


	public int getSoruSayisi() {
		return soruSayisi;
	}


	public void setSoruSayisi(int soruSayisi) {
		this.soruSayisi = soruSayisi;
	}


	public String getDers() {
		return ders;
	}


	public void setDers(String ders) {
		this.ders = ders;
	}


	public String getKonu() {
		return konu;
	}


	public void setKonu(String konu) {
		this.konu = konu;
	}


	public Soru[] getSorular() {
		return sorular;
	}


	public void setSorular(Soru[] sorular) {
		this.sorular = sorular;
	}


	public String[] getCevapSecenekleri() {
		return cevapSecenekleri;
	}


	public void setCevapSecenekleri(String[] cevapSecenekleri) {
		this.cevapSecenekleri = cevapSecenekleri;
	}


	public String[] getCevaplar() {
		return cevaplar;
	}


	public void setCevaplar(String[] cevaplar) {
		this.cevaplar = cevaplar;
	}
	
	
	// Sınav oluştur metodu yazalım
	public void sinavOlustur() {
		// Dersi alalım
		// Konuyu alalım
		// Sınav süresini alalım
		// Sou sayısını alalım 5
		// 5 tane soru alacağız
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dersi belirtin: ");
		ders = scanner.nextLine();
		
		System.out.println("Lütfen sınav konusunu giriniz: ");
		konu = scanner.nextLine();
		
		System.out.println("Lütfen sınav süresini giriniz: ");
		sure = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Lütfen soru sayısını giriniz: ");
		soruSayisi = scanner.nextInt();		
		sorular = new Soru[soruSayisi];
		
		for(int i=0;i<sorular.length;i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			sorular[i] = soru;	
		}
		
		
	}
	
	
	public void cevapGir() {
		// Soruları ve şıkları görmemiz lazım
		// aldığımız cevapları arrayde tutalım
		// kullanıcıdan aldığımız cevapları cevaplar arrayine atalım
		Scanner scanner = new Scanner(System.in);
		
		cevaplar = new String[sorular.length];
		
		for(int i=0;i<sorular.length;i++) {
			sorular[i].getIcerik();
			
			for ( int j =0; j<sorular[i].getCevapIcerikleri().length;j++) {
				System.out.println(cevapSecenekleri[j] + "-) " + sorular[i].getCevapIcerikleri()[j]);
			}
			System.out.println("Lütfen cevabınızı giriniz: ");
			cevaplar[i] = scanner.nextLine().toUpperCase();
		}
	}
	
	
	public void cevaplariKontrolEt() {
		// doğru sayisi
		// yanlış sayısı
		// puanını kullanıcıya gösterelim
		
		int dogru = 0;
		int yanlis = 0;
		int puan = 0;
		for(int i=0;i<sorular.length;i++) {
			if(cevaplar[i].equals(sorular[i].getDogruCevap())) {
				dogru++;
				puan += sorular[i].getpuan();
			}else {
				yanlis++;
			}
		}
		System.out.println("doğru cevap sayınız: " + dogru);
		System.out.println("yanlış cevap sayınız: " + yanlis);
		System.out.println("puanınız: " + puan);
		
		
	}
	

}
