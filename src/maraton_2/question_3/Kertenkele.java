package maraton_2.question_3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);		
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + " isimli kertenkele sürünüyor.");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() + " isimli kertenkele ses çıkarıyor.");
	}

}
