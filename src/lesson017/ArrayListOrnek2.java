package lesson017;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOrnek2 {
	public static void main(String[] args) {
		
		// 1 tane çift sayılar
		// 1 tane tek sayılar
		
		// 1'den 100'e kadar 35 tane random sayı üretelim
		// üretilen sayılardan tekleri tekArrayList'e
		// çiftleri de ciftArrayList'e atalım
		
		List<Integer> tekSayilar = new ArrayList<Integer>();
		List<Integer> ciftSayilar = new ArrayList<Integer>();
		
		for (int i=0;i<35;i++) {
			Random random = new Random();
			int rand = random.nextInt(1,101);
			if(rand%2==0) {
				ciftSayilar.add(rand);
			}else {
				tekSayilar.add(rand);
			}
		}
		
		System.out.println("çiftler");
		for(Integer integer : ciftSayilar) {
			System.out.println(integer + ", ");
		}
		
		System.out.println("çiftler");
		for(Integer integer : ciftSayilar) {
			System.out.println(integer + ", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
