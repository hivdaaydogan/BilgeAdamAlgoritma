package homework001;

public class Employee {
	
	private String name;
	private double maas;
	private double workHours;
	private int hireYear;
		
	private double tax;
	private double bonus;
	private double raiseSalary;
	
	private double tMaas;
	private double bMaas;
	private double rMaas;
	
	
	
	
	public Employee() {
		
	}
	
	public Employee(String name, double maasi, double workHours, int hireYear) {
		super();
		this.name = name;
		this.maas = maasi;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getRaiseSalary() {
		return raiseSalary;
	}

	public void setRaiseSalary(double raiseSalary) {
		this.raiseSalary = raiseSalary;
	}
	
	public double gettMaas() {
		return tMaas;
	}

	public void settMaas(double tMaas) {
		this.tMaas = tMaas;
	}

	public double getbMaas() {
		return bMaas;
	}

	public void setbMaas(double bMaas) {
		this.bMaas = bMaas;
	}

	public double getrMaas() {
		return rMaas;
	}

	public void setrMaas(double rMaas) {
		this.rMaas = rMaas;
	}
	

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", maas=" + maas + ", workHours=" + workHours + ", hireYear=" + hireYear
				+ ", tax=" + tax + ", bonus=" + bonus + ", raiseSalary=" + raiseSalary + "]";
	}
	
	
	
	
	
		

}
