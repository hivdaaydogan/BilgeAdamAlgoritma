package lesson018;

public class Hasta implements Comparable<Hasta>{
	
	private String isim;
	private String sikayet;
	
	private int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		//oncelikBelirle(sikayet);
		
		this.oncelik = sikayet.equalsIgnoreCase("Apandist") ? 1 
				: sikayet.equalsIgnoreCase("Yanık") ? 2
				: sikayet.equalsIgnoreCase("Agrı") ? 3 : 4;
	}
	
	public void oncelikBelirle(String sikayet) {
		if(sikayet.equalsIgnoreCase("Apandist")) {
			this.oncelik =1;
		}else if(sikayet.equalsIgnoreCase("Yanık")){
			this.oncelik =2;
		}else {
			this.oncelik = 3;
		}
	}
	
	//Array, ArrayList farkı
	//ArrayList, LinkedArraylist
	//Hashmap, LinkedHasmap farkı arka tarafta nasıl çalışıyorlar
	//Setler niye kullanılır, avantajları neler. 

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public int compareTo(Hasta o) {
		if(o.getOncelik() > this.oncelik) {
			return -1;
		}else if(o.getOncelik() < this.oncelik) {
			return 1;
		}
		return 0;
	}
	
	
	
	
	// Hasta diye bir sınıf açalım
	// isim, şikayet ve öncelik(int)

	// şikayete göre öncelik belirlicez
	// Öncelik özellikleri
	// Apandisit ----> En yüksek öncelik
	// Yanık -------> Orta Öncelik
	// Baş Ağrısı ---> En düşük öncelik
}
