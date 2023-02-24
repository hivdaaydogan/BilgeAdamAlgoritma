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
	
	public void krediBorcunuOde(Account account, int taksit) {
		if(account.isKrediAlindiMi() ) {
			if(account.getKrediBorcu() < taksit) {
				System.out.println("Kredi borcunuz yatırılan miktardan az"); 
			}else {
			account.setKrediBorcu(account.getKrediBorcu()-taksit);
			System.out.println(taksit + " kadar ödeme yaptınız güncel borcunuz--> "+account.getKrediBorcu());
			account.setKrediBorcuOdendiMi(true);
			account.setKrediPuani(account.getKrediPuani()+10);
			}
		}else {
			System.out.println("Kredi borcunuz bulunmamaktadır");
		}
	}
	
	
	
	public void hesaptanKrediBorcunuOde(Account account, int taksit) {
		if(account.isKrediAlindiMi() ) {
			if(account.getKrediBorcu()<taksit) {
				System.out.println("Kredi borcunuz yatırılan miktardan az");
			}else {
				if(account.getMoney() >= taksit) {
					account.setKrediBorcu(account.getKrediBorcu()-taksit);
					account.setMoney(account.getMoney()-taksit);
					System.out.println(taksit + " hesaptan ödeme yaptınız güncel borcunuz: "+account.getKrediBorcu());
					System.out.println("Hesabınızdaki bakiye: "+account.getMoney());
					account.setKrediBorcuOdendiMi(true);
					account.setKrediPuani(account.getKrediPuani()+10);
				}else {
					System.out.println("Bakiyeniz yetersiz");
				}
			}
		}else {
			System.out.println("Kredi borcunuz bulunmamaktadır");
		}
	}
	
	
	
	public void nakitAvansCek(Account account, int avans) {
		if(account.getKrediPuani() >= 50) {
			System.out.println(account.getMoney()/2-account.getIstenenKrediMiktari()+ " nakit avans kadar kredi çekebilirsiniz");
			account.setMoney(account.getMoney()-avans);
			System.out.println(avans + " TL avans çektiniz");
			System.out.println("Güncel bakiye: " + account.getMoney());
		}else {
			System.out.println("Kredi notu yetersiz kredi notunuz: " + account.getKrediPuani());
		}
	}
}
