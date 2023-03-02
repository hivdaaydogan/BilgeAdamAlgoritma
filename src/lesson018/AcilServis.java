package lesson018;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServis {
	public static void main(String[] args) {

		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();

		acilServis.offer(new Hasta("Mustafa", "Apandist"));
		acilServis.offer(new Hasta("Oguz", "Apandist"));
		acilServis.offer(new Hasta("Kemal", "Agrı"));
		acilServis.offer(new Hasta("Ayşe", "Yanık"));
		acilServis.offer(new Hasta("Zeliha", "Yanık"));
		acilServis.offer(new Hasta("Okan", "Apandist"));
		acilServis.offer(new Hasta("Orhan", "Yanık"));
		acilServis.offer(new Hasta("Merve", "Yanık"));
		acilServis.offer(new Hasta("Gizem", "Agrı"));
		acilServis.offer(new Hasta("Muharrem", "Apandist"));
		
		while (!acilServis.isEmpty()) {
			System.out.println(acilServis.peek().getIsim()+ " " +acilServis.poll().getOncelik());
		}
		
		Queue<Hasta> acilServis2 = new LinkedList<Hasta>();

		acilServis2.offer(new Hasta("Mustafa", "Apandist"));
		acilServis2.offer(new Hasta("Oguz", "Apandist"));
		acilServis2.offer(new Hasta("Kemal", "Agrı"));
		acilServis2.offer(new Hasta("Ayşe", "Yanık"));
		acilServis2.offer(new Hasta("Zeliha", "Yanık"));
		acilServis2.offer(new Hasta("Okan", "Apandist"));
		acilServis2.offer(new Hasta("Orhan", "Yanık"));
		acilServis2.offer(new Hasta("Merve", "Yanık"));
		acilServis2.offer(new Hasta("Gizem", "Agrı"));
		acilServis2.offer(new Hasta("Muharrem", "Apandist"));
		
		while (!acilServis2.isEmpty()) {
			System.out.println(acilServis2.peek().getIsim()+ " " +acilServis2.poll().getOncelik());
		}
	}
}
