package maraton_2.question_1;

public class Rehber {

	private String adSoyad;
	private String sehir;
	private long telefonNo;
	
	
	public Rehber(String adSoyad, String sehir, long telefonNo) {
		super();
		this.adSoyad = adSoyad;
		this.sehir = sehir;
		this.telefonNo = telefonNo;
	}
	
	
	public String getAdSoyad() {
		return adSoyad;
	}
	
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	
	public String getSehir() {
		return sehir;
	}
	
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	
	public long getTelefonNo() {
		return telefonNo;
	}
	
	public void setTelefonNo(long telefonNo) {
		this.telefonNo = telefonNo;
	}
	
	@Override
	public String toString() {
		return "Kisi [adSoyad=" + adSoyad + ", sehir=" + sehir + ", telefonNo=" + telefonNo + "]";
	}


}
