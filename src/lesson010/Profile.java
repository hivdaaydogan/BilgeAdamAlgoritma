package lesson010;

public class Profile {
	//attribute, prperty, field
	//nesne özellikleri
	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	
	public int takipciSayisi;
	public int takipSayisi;
	public boolean maviTik;
	
	public int postSayisi;
	public String[] posts = new String[10];
	
	//post oluştur metotdu
	//isim --> post oluşturdu desin
	
	public String postOlustur(String posts) {
		String metin = isim + " Post Oluşturdu";
		this.postSayisi++;
		this.posts[postSayisi] = posts;
		
		//this --> bulundugu sınıfı gösteriri
		return metin;
	}
	//profilIsminiGuncelle methodu
	//method isim alcak ismini güncellicek
	
	public void profilIsminiGuncelle(String isim) {
		this.isim = isim;
	}
	
	//gelenIstegiKabulEt metodu
	//takipçi sayımız artacak
	
	public void ıstegiKabulEt() {
		this.takipciSayisi +=1 ;
		verifiedCheck();
	}
	
	public void kullaniciSil() {
		this.takipciSayisi -=1 ;
		verifiedCheck();
	}
	
	//takipçi sayısı 5 ten fazla ise kullanıcıya mavitik verelim
	//maviTik
	
	private void verifiedCheck() {
		if(this.takipciSayisi > 5) {
			this.maviTik = true;
		}else {
			this.maviTik = false;
		}
	}
	
	//bilgileriGöster
	//isim, takipçi sayımız, maviTik, postSayisi
	
	
	public String bilgileriGoster() {
		return "KullanıcıAdi: " + this.kullaniciAdi + "MaviTik " + this.maviTik +
				"TakipçiSayisi " + this.takipciSayisi + "PostSayisi: " + this.postSayisi;
	}
	
	
	public void bilgileriGoster2() {
		System.out.println(this.toString()); 
	}
	
	@Override
	public String toString() {
		return "Profile [kullaniciAdi=" + kullaniciAdi + ", takipciSayisi=" + takipciSayisi + ", maviTik=" + maviTik
				+ ", postSayisi=" + postSayisi + "]";
	}
	
	
	
	
	
	
}
