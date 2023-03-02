package lesson018;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {
	public static void main(String[] args) {
		
		//character ve int tutan bi map oluşturalım
		//kullanıcıdan bir kelime alalım
		//ve girilen kelimede hangi harften kaç tane var onu yazdıralım
		
		//selamm
		//s-1
		//e-1
		//m-2
		HashMap<Character, Integer> map = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		String metin = scanner.nextLine();
		
		for (int i = 0; i < metin.length(); i++) {
			char c = metin.charAt(i);
			if(map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
		}
		//System.out.println(map);
		
		for (Character ch : map.keySet()) {
			System.out.println(ch + " -" + map.get(ch));
		}
		
	}
}