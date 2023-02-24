package lesson014;

import java.util.Random;

public class AccountManager {

	public void depositMoney(Account account,int money) {
		if(money>0 && money<=10000) {
			account.setMoney(account.getMoney() + money);
			System.out.println(money + "tl para hesaba yatırıldı güncel bakiyeniz: " + account.getMoney());
		}else {
			System.err.println("Sadece 1-10000 arası işlem yapabilirsiniz.");
		}
	}
	
	public void withdrawMoney(Account account, int money) {
		if(money>account.getMoney()) {
			System.err.println("yetersiz bakiye");
		}else {
			account.setMoney(account.getMoney()-money);
			System.out.println(money + "tl para hesaptan çekildi güncel bakiyeniz " + account.getMoney());
		}
	}
	
	
	public void accountDetails(Account account) {
		System.out.println("Hesap no: " + account.getAcountNo() + " Güncel bakiyeniz: " + account.getMoney());
	}
	
	public static String generateAccountID() {
		Random rnd = new Random();
		Long random = rnd.nextLong(1000,10000);
		String stringID = String.valueOf(random);
		return stringID;
	}
	
}
