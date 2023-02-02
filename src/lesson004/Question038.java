package lesson004;

import java.util.Scanner;

public class Question038 {

	public static void main(String[] args) {
//		 Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
//	    harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
//	    eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi

//		2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
//		  giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
//		  içerisinde o harf varsa değiştirsin.

//		//Ödevl
//		3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
//		 * olmadığını bulunuz(kek,iki,kabak,kayak)

//		4- Sistemden çıksın

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String İşemleri=====");
			System.out.println("1-Harf Saydırma");
			System.out.println("2-Harf Değiştirme");
			System.out.println("3-Polindrom Kontrolu");
			System.out.println("0-çıkış");
			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				// ahmetm
				// m
				int sayac =0;
				String indexler = "";
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime = scanner.nextLine();
				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.nextLine();
				if(!kelime.contains(harf)) {
					System.out.println("Aradgınız harf kelimenin içinde yoktur");
				}else {
					for(int i =0; i<kelime.length(); i++) {
						if(kelime.charAt(i) == harf.charAt(0)) {
							sayac ++;
							indexler +=i + ",";
						}
					}
					System.out.println(sayac);
					//System.out.println();
				}
				break;
			case 2:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime2 = scanner.nextLine();
				System.out.println("Değiştirmek istediğiniz harf: ");
				String eskiHarf = scanner.nextLine();
				System.out.println("Neyle değiştricez: ");
				String yeniHarf = scanner.nextLine();
				if(kelime2.contains(eskiHarf)) {
					kelime2= kelime2.replace(eskiHarf, yeniHarf);
				}else {
					System.out.println(eskiHarf + " mevcut dğeil");
				}
				System.out.println(kelime2);
				
				break;
			case 3:

				break;
			case 4:

				break;

			default:
				break;
			}
		}

	}

}