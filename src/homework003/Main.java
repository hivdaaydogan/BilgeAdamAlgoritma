package homework003;

import java.util.Scanner;

public class Main {
	
	public static void tvKurVeKanallariOlustur() {
		
		System.out.println("Televizyon markasını girin: ");
		Scanner scanner = new Scanner(System.in);
		String marka = scanner.nextLine();
		System.out.println("Televizyonun boyutunu girin:");
		String boyut = scanner.nextLine();
		Televizyon televizyon = new Televizyon(marka, boyut);
		televizyon.setTvKuruluMu(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		boolean check = true;
		while (check) {
			System.out.println("* * * * * * *");
			System.out.println("*   MENU    *");
			System.out.println("* * * * * * *");
			System.out.println("0. Çıkış \n" + "1. Televizyon Kur\n" + "2. Televizyonu Aç\n" + "3. Sesini Artır\n"
					+ "4. Sesini Azalt\n" + "5. Kanal Değiştir\n" + "6. Kanal Bilgisi Goster\n" + "7. Televizyonu Kapat\n"
					+ "8. Menüyü Goster\n");
			System.out.println("Seçiminiz: ");
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();
			
			switch (secim) {
			case 0:
				check = false;
				System.err.println("Çıkış");
				break;
			case 1:
				if(Televizyon.isTvKuruluMu() == false) {
					tvKurVeKanallariOlustur();
					System.out.println("Televizyon kuruldu!");
				}else {
					System.out.println("Televizyon zaten kurulu.");
				}
				break;
			case 2:
				Televizyon.televizyonuAc();
				break;
			case 3:
				Televizyon.sesiArtir();
				break;
			case 4:
				Televizyon.sesiAzalt();
				break;
			case 5:
				Televizyon.kanalDegistir();
				break;
			case 6:
				Televizyon.kanalBilgisiGoster();
				break;
			case 7:
				Televizyon.televizyonuKapat();
				break;
			case 8:
				continue;

			default:
				System.out.println("Lütfen geçerli bir sayı giriniz!");
				break;
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
