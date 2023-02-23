package lesson011;

import java.util.Scanner;

import lesson011.helper.RandomGenerateId;


public class Main {

	public static void main(String[] args) {

		// Product sınıfı oluşturalım
		// id, price, name, stock
		// bilgileriGoster methodu yazalım

		// değişkenler private
		// birde boş constructor

		// veritabanına kaydet --> ürün ismi + veritabanına kaydedildi
		// urunu Guncelle ->> ismini güncellicez paramatre olarak string name

		// Farklı paket açalım
		// o paketin içinde bir class oluşturup içinde random id oluşturcak bir metot
		// yazalım
		// sonrada ben her product nesnesi ürettiğimde otomatik olarak
		// id si oluşmuş olsun

		// Sepet sınıfı oluşturalım
		// Array olarak products, totalprice

		// Sepete ürün ekle metotu yazalım
		// void, parametre --> Product tipinde bir parametre alsın
		// gelen productı arrayin içine atıcaz.

		Product product1 = new Product();
		product1.setName("asus");
		product1.setPrice(1500);
		product1.setStock(6);
		product1.bilgileriGoster();

		Product product2 = new Product("apple", 100, 2000);
		product2.bilgileriGoster();
		product2.ismiGuncelle("apple2");
		product2.bilgileriGoster();

		System.out.println("*****************");
		Sepet sepet1 = new Sepet();

		System.out.println(product1.isActive());
		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product2);
		sepet1.sepeteEkle(product1);
		sepet1.sepeteEkle(product2);
		System.out.println(sepet1.getTotalPrice());
		System.out.println(product1.isActive());

		System.out.println("*****************");

		System.out.println(product1.getStock());
		System.out.println(sepet1.getTotalPrice());

		System.out.println("*****************");
		Product product3 = new Product();
		System.out.println(product3.isActive());
		product3.setName("HP");
		product3.gosterimdenKaldir();
		System.out.println(product3.isActive());

		sepet1.sepettekiUrunleriGoster();
		
		System.out.println("************");
		
		Product eklenenProduct =  productEkle();
		sepeteEkle(eklenenProduct);
		

	}
	// product ekle metohdu
	// değerleri kullanıcıdan alalım
	// aldıgımız değerler ile product oluşturcaz

	public static Product productEkle() {
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		//System.out.println(product.getId());
		System.out.println("Ürün fiyatı: ");
		int price = scanner.nextInt();
		System.out.println("Stock: ");
		int stock = scanner.nextInt();
		System.out.println("İsim: ");
		String name = scanner.next();
		
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		
		product.setProductCode(name);
		
		System.out.println("Ürün Başarıyla oluşturuldu ID'si " 
			+ product.getId() + " İsmi: " 
			+ product.getName() + " PRoductCode : "+ product.getProductCode());
		
		return product;
	}
	
	public static Product productEkle2() {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println(product.getId());
		System.out.println("Ürün fiyatı: ");
		int price = scanner.nextInt();
		
		System.out.println("Stock: ");
		int stock = scanner.nextInt();
		
		System.out.println("İsim: ");
		String name = scanner.next();
		
		Product product = new Product(name, stock, price);
		
		System.out.println("Ürün Başarıyla oluşturuldu ID'si " 
			+ product.getId() + " İsmi: " 
			+ product.getName()+ " ProductCode " + product.getProductCode()) ;
		
		return product;
	}
	
	//sepete ekle methodu yazalım
	//bitane sepetin olması lazım
	public static void sepeteEkle(Product product) {
		Sepet sepet = new Sepet();
		sepet.sepeteEkle(product);
		sepet.sepettekiUrunleriGoster();
	}
	
	//ürünKodu 
	//Apple Pro 
	//App325
	//ürün oluşturuken ürünü ismini alalım
	//ve bir ürün kodu oluşturalım
	//ürün adı sony
	//ürün adı apple
	//ürün kodu --> son365
	//ürün kodu --> app258
	//ürün oluşturuken bu değeride nesneye belirtmemiz lazım
}
