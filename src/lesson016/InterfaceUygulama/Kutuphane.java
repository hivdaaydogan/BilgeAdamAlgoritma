package lesson016.InterfaceUygulama;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane implements IKutuphaneManager {

	private String isim;
	private List<Kitap> kitapListesi;

	public Kutuphane(String isim) {
		super();
		this.isim = isim;
		this.kitapListesi = new ArrayList<>();
		System.out.println("Kütüphane oluştu.");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}

	@Override
	public void kitapEkle() {
		String isim = Util.stringDegerAl("Lütfen kitap ismini girin: ");
		String yazar = Util.stringDegerAl("Lütfen yazar ismini girin: ");
		int fiyat = Util.intDegerAl("Lütfen kitabın fiyatını girin: ");

		Kitap kitap = new Kitap(isim, yazar, fiyat);
		kitapListesi.add(kitap);
		System.out.println(isim + " kütüphaneye eklendi");

	}

	@Override
	public void kitaplariListele() {
		for (Kitap kitap : kitapListesi) {
			System.out.println("İsim: " + kitap.getIsim() + "\nFiyat: " + kitap.getFiyat());
		}
	}

	@Override
	public void yazarIsmiyleAra() {
		String yazar = Util.stringDegerAl("Lütfen yazar ismini girin: ");
		for (Kitap kitap : kitapListesi) {
			if (kitap.getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(yazar + " yazarına ait kitap: " + kitap.getIsim());
			}
		}
	}

	public void yazarIsmiyleAraAlternatif() {
		String yazar = Util.stringDegerAl("Lütfen yazar ismini girin: ");
		for (int i = 0; i < kitapListesi.size(); i++) {
			if (kitapListesi.get(i).getYazar().equalsIgnoreCase(yazar)) {
				System.out.println(yazar + " yazarına ait kitap: " + kitapListesi.get(i).getIsim());
			}
		}
	}

	@Override
	public void kitapSil() {
		String isim = Util.stringDegerAl("Lütfen Kitap İsmini Girin");
		Kitap kitap = kontrol(isim);
		if (kitap != null) {
			kitapListesi.remove(kitap);
			System.out.println("Başarıyla silindi");
		}
		

	}

	@Override
	public void indirimYap() {
		String kitapIsmi = Util.stringDegerAl("İndirim uygulanacak Kitap İsmini Girin");
		int indirim = Util.intDegerAl("Lütfen indirm miktari uygulayın");
		Kitap kitap = kontrol(kitapIsmi);
		if (kitap != null) {
			kitap.setFiyat(kitap.getFiyat() - indirim);
			System.out.println("Güncel Fiyatı--> " + kitap.getFiyat());
		}
		
	}


	private Kitap kontrol(String name) {
		for (int i=0; i< kitapListesi.size();i++) {
			if (kitapListesi.get(i).getIsim().equalsIgnoreCase(name)) {
				return kitapListesi.get(i);
			}
		}
			System.out.println("kitap bulunamamıştır");
			return null;
	}
	
	
	
	
	
	

}
