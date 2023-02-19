package lesson010;

public class Main {

	public static void main(String[] args) {
		
		
		Profile profil1 = new Profile();
		profil1.profilResmi = "resim.png";
		profil1.isim = "mehmet";
		profil1.kullaniciAdi = "mehmet123";
		
		System.out.println(profil1.isim);
		profil1.isim = "mehmet2";
		System.out.println(profil1.isim);
		
		System.out.println(profil1.postSayisi);
		
		System.out.println("*********");
		
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postOlustur("resim2.png"));
		System.out.println(profil1.postSayisi);
		
		System.out.println(profil1.isim);
		profil1.profilIsminiGuncelle("Yasin");
		System.out.println(profil1.isim);
		
		System.out.println(profil1.takipciSayisi);
		profil1.ıstegiKabulEt();
		profil1.ıstegiKabulEt();
		System.out.println(profil1.takipciSayisi);
		System.out.println(profil1.maviTik);
		
		//System.out.println(profil1.bilgileriGoster2());
		profil1.bilgileriGoster2();
		
		profil1.posts[0] = "resim3"; // String[] posts = {"resim3", "resim4"} 
		profil1.posts[1] = "resim4";
		profil1.posts[3] = "resim5";
		profil1.posts[4] = "resim6";
		
		System.out.println("profil1 in postları");
		
		for (int i = 0; i < profil1.posts.length; i++) {
			if(profil1.posts[i] != null) {
				System.out.println(profil1.posts[i]);
			}
		}
		System.out.println("000000000000000");
		
		for (String post : profil1.posts) {
			if(post != null) {
				System.out.println(post);
			}
		}
	}

}
