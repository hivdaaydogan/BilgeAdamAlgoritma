package homework001;

public class EmployeeManager {

	public void tax(Employee employee) {
		if(employee.getMaas() >= 2000) {
		employee.setTax(employee.getMaas()*0.05);
		employee.settMaas(employee.getMaas()-(employee.getMaas()*0.05));	
		}
	}
	
	public void bonus(Employee employee) {
		if(employee.getWorkHours() >= 40) {
			employee.setBonus((employee.getWorkHours()-40)*30);
			employee.setbMaas(employee.getMaas()+((employee.getWorkHours()-40)*30));
		}
	}
	
	public void raiseSalary(Employee employee) {
		if (2022 - employee.getHireYear() < 10) {
			employee.setRaiseSalary(employee.getMaas()*0.05);
			employee.setrMaas(employee.getMaas()+(employee.getMaas()*0.05));
		}else if (10 <= 2022 - employee.getHireYear() && 2022 - employee.getHireYear() < 20) {
			employee.setRaiseSalary(employee.getMaas()*0.1);
			employee.setrMaas(employee.getMaas()+(employee.getMaas()*0.1));
		}else if (2022 - employee.getHireYear() >= 20) {
			employee.setRaiseSalary(employee.getMaas()*0.15);
			employee.setrMaas(employee.getMaas()+(employee.getMaas()*0.15));
		}
	}
	
	
	
	public void employeeBilgileriniYazdir(Employee employee) {
		double vbMaas =  employee.getMaas()-employee.getTax()+employee.getBonus();
		double toplamMaas = employee.getMaas()-employee.getTax()+employee.getBonus()+employee.getRaiseSalary();
		System.out.println("\n* * * Çalışan Bilgileri * * *\n");
		System.out.println("Adı: " +employee.getName() + "\nMaaşı: " + employee.getMaas() + "\nÇalışma Saati:  " + employee.getWorkHours() + "\nVergi: " + employee.getTax() 
									+ "\nBonus: " + employee.getBonus() + "\nMaaş Artışı: " + employee.getRaiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: " + vbMaas
									+ "\nToplam Maaş: " + toplamMaas );
	}
	
	
	
	
	
}
