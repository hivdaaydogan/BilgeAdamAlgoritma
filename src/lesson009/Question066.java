package lesson009;

import java.util.Scanner;

public class Question066 {
	
	// menuyu oluşturalım
	// toplama metodu
	// kullanıcıdan 0 girene kadar sayıları alıyoruz
	// 0 girince sonucu gösterip tekrar menuyu gösteriyoruz	
//*****************************************************************************************************//	
	//çıkarma metodu
	//kullanıcıdan ilk başta kaç adet sayı girecekseniz onu alalım
	//kaç sayı girdiyse program bizden o kadar sayı alcak
	//sayıları çıkartıp sonucu verecek
//*****************************************************************************************************//
	// bölme metodu
	// kullanıcıdan kaç adet sayı gireceğini alalım
	// girilen sayi 1 olduğunda girilen sayıların birbirlerine bölümünü versin
//*****************************************************************************************************//
	
	
	// int, Integer(wrapper sınıf) farkı
	// Integer primitive int'e hizmet eden bir sınıf aslında
	// int --> null alamaz default
	// Integer --> null değer alabilir
	
	 public static void menu() {
		 boolean check = true;
		 
		 while(check) {
			 System.out.println("1-Toplama");
			 System.out.println("2-Çıkarma");
			 System.out.println("3-Bölme");
			 System.out.println("seçiminiz: ");
			 Scanner scanner = new Scanner(System.in);
			 int secim = scanner.nextInt();
			 scanner.nextLine();
			 switch (secim) {
			case 1:
				toplama();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				bolme();
				break;

			default:
				System.out.println("geçerli sayı giriniz");
				break;
			}
		 }
	 }
	 
	 private static void toplama() {
		 Scanner scanner = new Scanner(System.in);
		 int toplam =0;
		 int i=1;
		 boolean check = true;
		 
		 while(check) {
			 System.out.println(i++ + ". sayi");
			 int sayi = scanner.nextInt();
			 if(sayi != 0) {
				 toplam += sayi;
			 }else {
				 check = false;
				 System.out.println("sonuç: " + toplam);
			 }
		 }
	 }
	 
	 
	 private static void cikarma() {
		 Scanner scanner = new Scanner(System.in);
		 int i = 1;
		 int result = 0;
		 System.out.println("kaç adet sayı gireceksiniz: ");
		 int n = scanner.nextInt();
		 while(i<=n) {
			 System.out.println(i+". sayi");
			 int sayi = scanner.nextInt();
			 if(i == 1) {
				 result += sayi;
				 i++;
				 continue;
			 }
			 result -= sayi;
			 i++;
		 }
		 System.out.println("sonuç: " + result);
	 }

	 
	 private static void bolme() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("kaç adet sayı gireceksiniz: ");
		 int sayi = scanner.nextInt();
		 double bolme =0;
		 for(int i =0;i< sayi;i++) {
			 System.out.println(i +1+ ". sayı");
			 double a = scanner.nextDouble();
			 if(i==0) {
				 bolme=a;
			 }else {
				 bolme = bolme / a;
			 }
		 }
		 System.out.println("sonuç: " + bolme);
	 }
	 
	 
	public static void main(String[] args) {
		
		menu();

		

	}

}
