package lesson016.InterfaceUygulama;

public class Main {
	
	static Kutuphane kutuphane = new Kutuphane("Milli Kütüphane");
	
	public static void adminMenu() {
		
		while(true) {
			System.out.println("1- Kitap Ekle");
			System.out.println("2- Bütün Kitapları Listele");
			System.out.println("3- Yazar ismiyle ara");
			System.out.println("4- Kitap Sil");
			System.out.println("5- İndirim yap");
			System.out.println("6- Kitabı Güncelle");
			System.out.println("7- İndirimli kitapları listele");
			int secim = Util.intDegerAl("Seçiminiz? ");
			switch (secim) {
			case 1:
				kutuphane.kitapEkle();
				break;
			case 2:
				kutuphane.kitaplariListele();
				break;
			case 3:
				kutuphane.yazarIsmiyleAra();
				break;
			case 4:
				kutuphane.kitapSil();
				break;
			case 5:
				kutuphane.indirimYap();
				break;
			case 6:
				kutuphane.kitabiGuncelle();
				break;
			case 7:
				kutuphane.indirimListele();
				break;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		
		// Kitap sınıfımız olsun
		// isim, yazar, fiyat
		
		// Kutuphane
		// isim, Kitaplar
		
		// IKutuphaneManager diye bir interface oluşturalım
		// interface kitapEkle metodu yazalım
		
		// Util Sınıfı oluşturalım
		// inrDegerAl()
		// stringDegerAl()
		
		// Kullanıcıdan aldığımız isim, yazar ve fiyatla bir kitap nesnesi oluşturalım
		
		// kitaplariListele --> ismini fiyatını görüntüleyelim.
		
		// Yazar ismine göre arama  yapalım
		// kullanıcıdan yazar ismi alalım
		// Ahmet'in yazdığını listelemek istiyorum
		
		// Kitap sil metodu yazalım
		// silmek istediğiniz kitabın ismini girin
		// girdiği kitap varsa silsin
		// yoksa girdiğiniz kitap yoktur
		
		// indirim yap metodu
		// kitap ismini alalım
		// ne kadar indirim yapmak istiyoruz
		// alınan isimde bir kitap yoksa, kitap yoktur.
		// kitabın fiyatını güncelleyelim
		// güncel fiyatını yazdıralım
		
		// kontrol diye bir metot yazarız
		// kitap var mı yok mu onu bulur
		// varsa o kitabı bize return eder
		// yoksa bilgilendirir
		
		// Kitabı güncelleyelim (ismini)
		
		// İndirimde olan kitapları listeyelim
		
		adminMenu();

		
		
		
		
		
	}

	
}
