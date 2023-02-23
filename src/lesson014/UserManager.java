package lesson014;

import java.util.Scanner;

public class UserManager {

	private final String emailFormat = "@xbanka.com";

	public void generetaAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(" ", ".") + '.' + user.getSurname().toLowerCase() + emailFormat);

	}

	public void otomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
		.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;
		 user.setEmail(otomatikOlusanEmail);}

	// replace(değiştirilmesi istenen, ne ile değiştireceğiz);
	
	
	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktari(para);
		
		System.out.println(para + " değerinde kredi başvurusu yaptınız.");
		System.out.println("lütfen onay bekleyin...");
	}
}
