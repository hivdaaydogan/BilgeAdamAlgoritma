package maraton_1;

import java.util.Scanner;

public class Question4 {
	/*
	 * 4.Geometrik hesaplamalar yapan programı yazınız. Program aşağıdaki gibi bir menüsü olacak ve 
	 * aşağıdaki işlevleri yapacaktır:
					* * * * * * * * * * ** * * * * * * *
					* Geometrik Hesaplayıcı            *
					* * * * * * * * * * ** * * * * * * *
					1. Kare alan hesaplama
					2. Kare çevre hesaplama
					3. Dikdörtgen alan hesaplama
					4. Dikdörtgen çevre hesaplama
					5. Daire alan hesaplama
					6. Daire Çevre hesaplama
					7. Çıkış
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("*************************");
			System.out.println("* Geometrik Hesaplayıcı *");
			System.out.println("*************************");
			System.out.println("1. Kare alan hesaplama");
			System.out.println("2. Kare çevre hesaplama");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println("4. Dikdörtgen çevre hesaplama"); 
			System.out.println("5. Daire alan hesaplama");
			System.out.println("6. Daire Çevre hesaplama");
			System.out.println("7. Çıkış");
			int islem = scanner.nextInt();
			scanner.nextLine();
		
		
		switch (islem) {
		case 1:
			System.out.println("Karenin bir kenarının uzunluğunu giriniz: ");
			double kenar1 = scanner.nextDouble();
			double alank = kenar1 * kenar1;
			System.out.println("Karenin alanı: " + alank);
			break;
		case 2:
			System.out.println("Karenin bir kenarının uzunluğunu giriniz: ");
			double kenar2 = scanner.nextDouble();
			double cevrek = kenar2 * 4;
			System.out.println("Karenin çevresi: " + cevrek);
			break;
		case 3:
			System.out.println("Dikdörtgenin kısa kenarının uzunluğunu giriniz: ");
			double kısa = scanner.nextDouble();
			System.out.println("Dikdörtgenin uzun kenarının uzunluğunu giriniz: ");
			double uzun = scanner.nextDouble();
			double aland = kısa * uzun;
			System.out.println("Dikdörtgenin alanı: " + aland);
			break;
		case 4:
			System.out.println("Dikdörtgenin kısa kenarının uzunluğunu giriniz: ");
			double kısad = scanner.nextDouble();
			System.out.println("Dikdörtgenin uzun kenarının uzunluğunu giriniz: ");
			double uzund = scanner.nextDouble();
			double cevred = (kısad + uzund) * 2;
			System.out.println("Dikdörtgenin çevresi: " + cevred);
			break;
		case 5:
			System.out.println("Dairenin yarıçapını giriniz: ");
			double yaricap1 = scanner.nextDouble();
			double alandaire = Math.PI * yaricap1 * yaricap1;
			System.out.println("Dairenin alanı: " + alandaire);
			break;
		case 6:
			System.out.println("Dairenin yarıçapını giriniz: ");
			double yaricap2 = scanner.nextDouble();
			double cevredaire = 2 * Math.PI * yaricap2;
			System.out.println("Dairenin alanı: " + cevredaire);
			break;
		case 7:
			kontrol = false;
			System.err.println("çıkış");
			break;

		default:
			System.out.println("lütfen geçerli bir sayı giriniz.");
			break;
		}
		
		
		
		
		
		
		
		
		
		}

	}

}
