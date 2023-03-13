package maraton_2.question_2;

public class Main {

	public static void main(String[] args) {
		
		CustomStringTR str = new CustomStringTR(" Merhaba ");
		
		System.out.println(str.birlestir("Naber"));
		System.out.println(str.boslukKaldir());
		System.out.println(str.esitMi("Selam"));
		System.out.println(str.icerik("er"));
		System.out.println(str.karakteriBuyut());
		System.out.println(str.karakteriKucult());
		System.out.println(str.karakteriGetir(4));
		System.out.println(str.uzunluk());
		System.out.println(str.yerDegistir('M','S'));
		System.out.println(str.yeriniBul('e'));
		

	}

}
