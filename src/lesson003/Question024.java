package lesson003;

public class Question024 {

	public static void main(String[] args) {

		// 1'den 100'e kadar olan çift sayıların toplamının tek sayıların toplamına
		// oranını bulduran program

		double tekTop = 0;
		double ciftTop = 0;
		for (int i = 1; i <= 99; i += 2) {
			ciftTop += i;
		}
		for (int j = 2; j <= 100; j += 2) {
			tekTop += j;
		}
		double oran = tekTop / ciftTop;
		System.out.println(oran);

	}

}
