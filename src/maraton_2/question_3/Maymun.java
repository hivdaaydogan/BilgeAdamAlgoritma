package maraton_2.question_3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + " isimli maymun yürüyor.");
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " isimli maymun ses çıkarıyor.");
	}

}
