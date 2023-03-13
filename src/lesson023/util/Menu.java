package lesson023.util;

import lesson023.entity.data.User;
import lesson023.service.UserManager;

public class Menu {
	
	UserManager userManager;
	
	public Menu() {
		userManager = new UserManager();
	}
	
	public void menu() {
		System.out.println("1- Admin Menu");
		System.out.println("2- User İşlemleri");
		System.out.println("3- Kayıt Ol");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem: ");
		switch (key) {
		case 1:
			adminMenu();
			break;
		case 2:
			userLogin();
			break;

		default:
			break;
		}
	}

	private void adminMenu() {
		System.out.println("1- Tüm kullanıcıları Listele");
		System.out.println("2- Ana Menu");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem: ");
		switch (key) {
		case 1:
			System.out.println("Kullanıcılar Listelendi.");
			break;
		case 2:
			menu();
			break;

		default:
			break;
		}
		
	}

	private void userLogin() {
			String mail = Util.stringDegerAl("Mail: ");
			String password = Util.stringDegerAl("Password: ");
			
			User user = userManager.userMailKontrol(mail);
			if(user != null && userManager.userSifreKontrol(password)) {
				userMenu(user);
			}
			
	}
	
	
	private void userMenu(User user) {
		System.out.println("1- DM At");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem: ");
		switch (key) {
		case 1:
			System.out.println("DM Atıldı.");
			break;
		case 2:
			break;

		default:
			break;
		}
	}
	
	
	// UserException sınıfı
	
	
	
	

}
