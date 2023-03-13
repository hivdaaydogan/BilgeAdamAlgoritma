package maraton_2.question_2;

public class CustomStringTR {

	private String metin;

	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}
	
	public String karakteriKucult() {
		String str = metin.toLowerCase();
		return str;
	}
	
	public String karakteriBuyut() {
		String str = metin.toUpperCase();
		return str;
	}
	
	public char karakteriGetir(int index) {
		char chr = metin.charAt(index);
		return chr;
	}
	
	public String yerDegistir(char index1, char index2) {
		String str = metin.replace(index1, index2);
		return str;
	}
	
	public String boslukKaldir() {
		String str = metin.trim();
		return str;
	}
	
	public boolean icerik(String string) {
		Boolean str = metin.contains(string);
		return str;
	}
	
	public int yeriniBul(char index) {
		int c = metin.indexOf(index);
		return c;
	}
	
	public int uzunluk() {
		int c = metin.length();
		return c;
	}
	
	public String birlestir(String string) {
		String str = metin.concat(string);
		return str;
	}
	
	public boolean esitMi(String string) {
		Boolean str = metin.equals(string);
		return str;
	}
	
	
	
	
	
}
