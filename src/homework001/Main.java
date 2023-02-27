package homework001;

public class Main {
	// Maaş, Vergi, Bonus, Maaşı artımı hesaplayan bir program 
	
	// Sınıfın attributeleri
	// name, salary, workHours(çalıştığı saat), hireYear(işe giriş yılı)
	// tax(vergi), bonus(mesai ücreti)
	// salaryRaise(Maaş artımı)
	
	// tax metodu --> eğer çalışanın maaşı 2000 tl den az ise vergi uygulanmayacak, 
	// fazla ise maaşının %5 i kadar vergisi olacak
	
	// bonus metodu --> eğer haftada 40 saatten fazla çalıştıysa
	// çalıştığı saat başına 30 TL maaşa uygulanacak
	// ve ne kadar bonus aldığı hesaplanacak
	
	// raiseSalary --> işe girdiği yıla göre maaş artışı yapılacak
	// şu anki yıl 2022, 10 yıldan az ise %5, 
	// 10-20 yıl arasında %10,
	// 20 yıldan fazla ise %15 zam yapılacak
	
	// employee bilgilerini göster
	/*
	 * Adı: Ahmet 
	 * Maaşı: 3000.0 
	 * Çalışma saati: 65.0 
	 * Başlangıç yılı: 1995 
	 * Vergi: 90.0
	 * Bonus: 750.0 
	 * Maaş Artışı: 450.0 
	 * Vergi ve Bonuslar ile birlikte maas: 3660.0
	 * Toplam Maaş: 4110.0
	 */ 
	
	public static void main(String[] args) {
	
		EmployeeManager employeeManager = new EmployeeManager();	
		Employee employee1 = new Employee("Ahmet", 3000, 65, 1995 );

		
//		employeeManager.tax(employee1,3000);
//		System.out.println(employee1.getTax());
//		System.out.println(employee1.getMaas());
//		
//		employeeManager.bonus(employee1,3000);
//		System.out.println(employee1.getBonus());
//		System.out.println(employee1.getMaas());
//
//		employeeManager.raiseSalary(employee1,3000);
//		System.out.println(employee1.getRaiseSalary());
//		System.out.println(employee1.getMaas());
		
		
		employeeManager.tax(employee1);
		employeeManager.bonus(employee1);
		employeeManager.raiseSalary(employee1);
		employeeManager.employeeBilgileriniYazdir(employee1);
		
		
		
		
	}
	
	
	
	
}
