package lesson014;

public class AdminManager {

	public void krediBasvurusunuOnayla(Account account) {
		// Kredi başvurusu var mı yok mu?
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır.");
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktari());
			account.setKrediBasvurusu(false);
		} else {
			System.err.println("Kredi başvurunuz bulunmamaktadır.");
		}
	}

	public void krediBasvurusunuOnayla(User user) {  // Parametre olarak user da alabiliriz, içinde account var.
		// Kredi başvurusu var mı yok mu?
		if (user.getAccount().isKrediBasvurusu()) {
		System.out.println("Kredi Başvurnuz Onaylanmıştır. ");
		user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKrediMiktari());
		user.getAccount().setKrediBasvurusu(false);
		} else {
		System.err.println("Kredi başvurunuz bulunmamaktadır.");
		}
	 }
	
	
	public void krediBasvurusunuReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi Başvurnuz Reddedilmiştir. ");
			account.setKrediBasvurusu(false);
			account.setIstenenKrediMiktari(0);
		} else {
			System.out.println("Kredi Başvurusu Yok");
		}
	}
}
