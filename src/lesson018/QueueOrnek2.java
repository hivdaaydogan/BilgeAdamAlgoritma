package lesson018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) throws InterruptedException {

		// Bir tane queue oluşturalım
		// 10-12 tane isim queueya
		// daha sonra 1-10 arasın bir sayı üretcez bu sayi bizim pide sayımız
		
		// pide yazdıralım
		
		// kuyruga göre pideleri dağıtıcaz pideler bittiğinde pideler bitti yazdıralım
		// pideyi alan kişileri kuyruktan çıkarcaz
		// pideyi alamayan kişileri yazdıralım

		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.offer("ahmet");
		kuyruk.offer("mehmet");
		kuyruk.offer("ayse");
		kuyruk.offer("fatma");
		kuyruk.offer("zeynep");
		kuyruk.offer("ali");
		kuyruk.offer("merve");
		kuyruk.offer("emre");
		kuyruk.offer("arda");
		kuyruk.offer("aysun");
		
		Random random = new Random();
		int rand = random.nextInt(1,11);
		
		for (int i=0;i<rand;i++) {
			System.out.println(kuyruk.poll() + " pidesini aldı.");
			Thread.sleep(2000);
		}
		System.out.println("\n* * * * * * * * * * * * * \n");
		System.out.println(kuyruk);
		for(String string : kuyruk) {
			System.out.println(string + " pideyi alamadı");
		}
		
		
		
		
		
		
		
		
	}

}
