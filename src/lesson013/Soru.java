package lesson013;

import java.util.Scanner;

public class Soru {
	
	private int puan;
	private String icerik;
	private String dogruCevap;
	private String[] cevapIcerikleri;  // A şıkkında yazan değer.
	
	
	public Soru() {
	}


	public int getpuan() {
		return puan;
	}


	public void setpuan(int puan) {
		this.puan = puan;
	}


	public String getIcerik() {
		return icerik;
	}


	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}


	public String getDogruCevap() {
		return dogruCevap;
	}


	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}


	public String[] getCevapIcerikleri() {
		return cevapIcerikleri;
	}


	public void setCevapIcerikleri(String[] cevapIcerikleri) {
		this.cevapIcerikleri = cevapIcerikleri;
	}
	
	
	public void soruOlustur(String[] cevapSecenekleri) {
		// içerik alacağız, soruyu alıyoruz.
		// Şıkların değerlerini isteyeceğiz.
		// Puanı kaç olsun?
		// Doğru cevabı belirtin.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sınav sorusunu giriniz: ");
		icerik = scanner.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];
		
		for (int i=0;i<cevapSecenekleri.length;i++) {
			System.out.println("Lütfen " + cevapSecenekleri[i] + " şıkkının değerini girin: ");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		
		System.out.println("Lütfen doğru cevabı belirtin: ");
		dogruCevap = scanner.nextLine().toUpperCase();
		
		System.out.println("Sorunun puanını belirtin: ");
		puan = scanner.nextInt();
		
		
		
		
		
		
	}
	
	
	

}
