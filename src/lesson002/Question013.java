package lesson002;

import java.util.Scanner;

public class Question013 {

	public static void main(String[] args) {
		
		// telefona ve maile bir kod gelecek ve kodları biz tanımlayacağız.
		// kullanıcıdan maile ve telefona gelen kodu isteyeceğiz.
		// eğer mailine ve telefonuna giden kod ile uyuşuyorsa 
		// sisteme kayıt oldunuz diyelim
		// ya maili hatalıdır ya telefonu ya da ikisi de hatalıdır.
		// kullanıcıyı bilgilendireceğiz.
		
		int telKod = 5432;
		int mailKod = 1234;
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Telefona gelen kodu giriniz: ");
		int kod1 = input.nextInt();
		System.out.println("Maile gelen kodu giriniz: ");
		int kod2 = input.nextInt();
		
//		if (telKod == kod1) {
//			if (mailKod == kod2) {
//				System.out.println("sisteme üye oldunuz!");
//			}
//			else {
//				System.out.println("mail kod yanlış girildi.");
//			}
//		}
//		else {
//			System.out.println("tel kodu yanlış girdiniz");
//		}
		
		
		if (kod1 == telKod && kod2 == mailKod) {
			System.out.println("Sisteme kayıt oldunuz");
		}else if (kod2 != telKod && kod1 == mailKod) {
			System.out.println("mail hatalı girildi");
		}else if (kod2 == telKod && kod1 != mailKod) {
			System.out.println("tel kod hatalı girildi");
		}else {
			System.out.println("iki kod da hatalı girildi");
		}

		
		
		
		

	}

}
