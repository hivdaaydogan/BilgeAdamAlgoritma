package lesson018;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek {

	public static void main(String[] args) {
		
		// Bir tane String que oluşturalım
		// kuyruğun içine isimler atalım
		// kuyrukta elemanları yazdıralım
		
		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.offer("ahmet");
		kuyruk.offer("mehmet");
		kuyruk.offer("ayse");
		kuyruk.offer("fatma");
		
		System.out.println(kuyruk);
		
		// FIFO(first in first out) ilk giren ilk çıkar mantığında çalışıyor
		// kuyruk boşalana kadar elemanları çıkaralım
		
		System.out.println(kuyruk.remove());
		System.out.println(kuyruk.remove());
		System.out.println(kuyruk.remove());
		
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk);
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk);
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk);
	
		
		while (!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
		}
		System.out.println(kuyruk);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
