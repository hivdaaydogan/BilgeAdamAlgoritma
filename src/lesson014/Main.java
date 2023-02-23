package lesson014;

public class Main {

	public static void main(String[] args) {
		
		// Account sınıfımız olsun sınıfımız attributeleri
		// accountNo, money
		
		// paraYatır()
		// paraCek() metodu
		
		// paraYatir() --> hesabımızı bizim belirttiğimiz miktarda para eklenece
		// paraCek() --> hesabımızdan bizim belirttiğimiz miktarda para düşecek
		
		// bakiye 0
		// paraYatir() --> 100 tl yatırdınız güncel bakiyeniz 100
		// paraCek() --> 50 tl hesaptan para cektiniz güncel bakiyeniz 50
		
		// para çekmek istediğimiz zaman hesapta o kadar para yoksa çekmemize izin vermesin
		// para yatırırken maks 10.000tl limit
		
		// AcoountManager sınıf oluşturalım paracek ve parayatir metodlarını AccountManager sınıfına taşıyalım.
		
		// AccountManager sınıfında bilgileri göster metodu
		// hesapnomuzu ve güncel bakiyemizi
		
		
		// User sınıfı oluşturalım
		// name, surname,email,Account account
		// mainde user oluştururken bir de accountu verelim
		
		// kullanıcıdan aldğımız name ve surname değerleri ile otomatik @xbanka uzantılı mail oluşturalım.
		// XBanka
		// name.surname@xbanka.com
		
		// User olarak 
		// kredi başvurunda bulunalım
		// krediyi çekeceği accountu bir de ne kadar kredi istiyorsa, miktar
		
		// Account sınıfının içinde
		// private boolean krediBasvuru
		// private int istenenKrediMiktari --> 10.000
		// krediBasvurusundaBulun() --> Account account, int para
		// UserManager sınıfında yazalım
		
		
		// AdminManager sınıfı oluşturalım
		// krediBasvurusunuOnayla();
		
		// kredi basvurusunun olması lazım
		// bizim hesabımızı çekmek istediğimiz kadar krediMiktari hesabımıza düşsün.
		
		// KrediBasvurusunuReddet()
		// kredi başvurusunun olması lazım.
		//
		
		
		AccountManager accountManager = new AccountManager();
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		
		Account account = new Account();
		account.setMoney(30000);
		accountManager.accountDetails(account);

		Account account2 = new Account();
		account2.setMoney(20000);
		accountManager.accountDetails(account2);

		Account account3 = new Account(5000);
		account3.setMoney(10000);
		accountManager.accountDetails(account3);

		User user1 = new User("ahmet", "yaz", account);
		System.out.println(user1.getAccount().getMoney());

		User user2 = new User();
		user2.setEmail("asd@gmail.com");
		user2.setName("mehmet");
		user2.setSurname("kış");
		user2.setAccount(account2);
		System.out.println(user2.getAccount().getMoney() + " " + user2.getEmail());

		User user3 = new User("ali demir", "sonbahar", account3);
		userManager.generetaAutoEmail(user3);
		System.out.println(user3.getEmail());

		System.out.println("*****************");
		System.out.println(account.getMoney());
		userManager.krediBasvurusundaBulun(account, 17500);
		
		adminManager.krediBasvurusunuOnayla(account);
		adminManager.krediBasvurusunuReddet(account);
		adminManager.krediBasvurusunuOnayla(account);
		System.out.println(account.getMoney());
		
		System.out.println(account.getIstenenKrediMiktari());

		System.out.println("*****************");
		
		System.out.println(account3.getMoney());
		userManager.krediBasvurusundaBulun(account3, 25000);
		adminManager.krediBasvurusunuOnayla(user3);
		adminManager.krediBasvurusunuOnayla(user3);
		accountManager.accountDetails(account3);
		System.out.println("*****************");
		
		
//		System.out.println(user1.getAccount().isKrediBasvurusu());
//		System.out.println(user1.getAccount().getIstenenKrediMiktari());
//		userManager.krediBasvurusundaBulun(account, 10000);
//		System.out.println(user1.getAccount().isKrediBasvurusu());
//		System.out.println(user1.getAccount().getIstenenKrediMiktari());
		
//		accountManager.depositMoney(account, 200);
//		accountManager.depositMoney(account, 300);
		//accountManager.withdrawMoney(account, 200);
		//accountManager.withdrawMoney(account, 200);
//		accountManager.accountDetails(account2);
//		accountManager.depositMoney(account2,200);
		
		
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
	

	}

}
