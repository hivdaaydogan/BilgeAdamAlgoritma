package lesson019;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// program bize random bi plaka sunacak
		// sehirler --> hashmap (plaka,sehir)
		// oyunSayisi
		// tahmin hakkımız
		// tahminler --> hashmap(oyunSayisi, List<String>)

		// PlakaTahmin diye sınıf oluşturalım
		// mapOlustur diye bir metot yazalım
		
		// random plaka oluştur metodu oluşturalım
		// tahmin metodunda kullanacağız.
		
		// tahmin metodu yazalım
		// burada kullanıcıdan şehir tahmini alacağız
		// kullanıcıdan her yaptığı tahmini bu metod içinde bir arraylist oluşturup onun içine atacağız
		// eğer doğru bilirse döngüden çıkacağız
		// kaçıncı tahminde bildiğini söyleyeceğiz ve hem tahmşn listesini hem de oyun sayısını oluşturduğumuz tahminler
		// arraylistine atacağız ve oyun sayısını bir artıracağız
		// her tahminden sonra yanlış bilirsek tahmin hakkımız güncellensin
		// kaç tahmin hakkımız kaldığını yazson ve 3 kere yanlış bildiysek
		// 2. oyuna geçsin ve tahminler güncellensin
		
		//private final int hak;
		//final belirlediğimiz değişkeni immutuble yapıyor
		

		// OyunuBaslat oyunuBaslat = new OyunuBaslat();
		// oyunuBaslat.menu();

		OyunuBaslat.menu();

	}

}
