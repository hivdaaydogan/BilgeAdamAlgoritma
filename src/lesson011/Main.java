package lesson011;

public class Main {

	public static void main(String[] args) {
		
		// Product sınıfı oluşturalım
		// id, price, name, stock
		// bilgileriGoster metodu yazalım
		
		// değişkenler private
		// bir de boş constructor
		
		// veritababıba kaydet --> ürün ismi + veritabanına kaydedildi
		// urunu güncelle --> ismini güncelleyeceğiz parametre olarak string name
		
		// Farklı paket açalım
		// o paketin içinde bir class oluşturup içinde random id oluşturacak bir metod yazalım
		// sonra da ben her product nesnesi ürettiğimde otomatik olarak id'si oluşmuş olsun
		
		// Sepet sınıfını oluşturalım
		// void, parametre --> Product tipinde bir parametre alsın
		// gelen productı arrayin içine atıcaz.
		
		
		
		Product product1 = new Product();
		product1.setName("asus");
		product1.setPrice(1500);
		product1.setStock(100);
		product1.bilgileriGoster();
		
		Product product2 = new Product("apple", 100, 2000);
		product2.bilgileriGoster();
		product2.ismiGuncelle("apple2");
		product2.bilgileriGoster();
		
		
		String[] array = new String[10];
		array[0] = "ahmet";
		
		Product[] products = new Product[10];
		products[0] = product1;
		
		System.out.println("*****************");
		Sepet sepet1 = new Sepet();
		
		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product2);
		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());
		
		
		

		
	}

}