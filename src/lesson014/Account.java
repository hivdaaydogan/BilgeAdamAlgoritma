package lesson014;

import java.util.Random;

public class Account {

	private String accountNo;
	private int money;
	
	private int istenenKrediMiktari;
	private boolean krediBasvurusu = false;
	
	private int krediBorcu;
	private boolean krediAlindiMi = false;
	
	private boolean krediBorcuOdendiMi;
	private int nakitAvans;
	private int krediPuani;
	
	

//	public void depositMoney(int money) {
//		if(money>0 && money<=10000) {
//			this.setMoney(this.getMoney() + money);
//			System.out.println(money + "tl para hesaba yatırıldı güncel bakiyeniz: " + this.getMoney());
//		}else {
//			System.err.println("Sadece 1-10000 arası işlem yapabilirsiniz.");
//		}
//	}
//	
//	public void withdrawMoney(int money) {
//		if(money>this.money) {
//			System.err.println("yetersiz bakiye");
//		}else {
//			this.setMoney(this.getMoney()-money);
//			System.out.println(money + "tl para hesaptan çekildi güncel bakiyeniz " + this.getMoney());
//		}
//	}
	
	
	

	public Account() {
		this.accountNo = randomAccountNo();
	}

	
	public Account(int money) {
		this.accountNo = randomAccountNo();
		this.money = money;
	}
	
	private String randomAccountNo() {
		Random random = new Random();
		Long sayi = random.nextLong(1000,5000);
		String accountNo = String.valueOf(sayi);
		return accountNo;
	}

	
	
	public String getAcountNo() {
		return accountNo;
	}

	public void setAcountNo(String acountNo) {
		this.accountNo = acountNo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getIstenenKrediMiktari() {
		return istenenKrediMiktari;
	}

	public void setIstenenKrediMiktari(int istenenKrediMiktari) {
		this.istenenKrediMiktari = istenenKrediMiktari;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}


	public int getKrediBorcu() {
		return krediBorcu;
	}


	public void setKrediBorcu(int krediBorcu) {
		this.krediBorcu = krediBorcu;
	}


	public boolean isKrediAlindiMi() {
		return krediAlindiMi;
	}


	public void setKrediAlindiMi(boolean krediAlindiMi) {
		this.krediAlindiMi = krediAlindiMi;
	}


	public boolean isKrediBorcuOdendiMi() {
		return krediBorcuOdendiMi;
	}


	public void setKrediBorcuOdendiMi(boolean krediBorcuOdendiMi) {
		this.krediBorcuOdendiMi = krediBorcuOdendiMi;
	}


	public int getNakitAvans() {
		return nakitAvans;
	}


	public void setNakitAvans(int nakitAvans) {
		this.nakitAvans = nakitAvans;
	}


	public int getKrediPuani() {
		return krediPuani;
	}


	public void setKrediPuani(int krediPuani) {
		this.krediPuani = krediPuani;
	}


	
	
	

}
